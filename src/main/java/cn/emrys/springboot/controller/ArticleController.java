package cn.emrys.springboot.controller;

import cn.emrys.springboot.entity.Article;
import cn.emrys.springboot.entity.Response;
import cn.emrys.springboot.services.ArticleService;
import com.fasterxml.classmate.types.ResolvedPrimitiveType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("article")
public class ArticleController {

    @Autowired
    ArticleService articleService;

    /**
     * 获取所有文章(分页)
     * @param state 文章状态 0草稿箱,1已发表,2已删除
     * @param uid 作者id
     * @param keywords 文章标题模糊搜索
     * @param page 第几页
     * @param page_size 页面大小
     * @return 文章列表
     */
    @GetMapping("all")
    public Response findAll(@RequestParam int state, @RequestParam int uid, @RequestParam String keywords, @RequestParam int page, @RequestParam int page_size) {
        int start = (page - 1) * page_size;
        List<Article> articles = articleService.all(state, uid, keywords, start, page_size);
        int totalCount = articleService.allCount(state, uid, keywords);
        Map<String, Object> res = new HashMap<>();
        res.put("totalCount", totalCount);
        res.put("articles", articles);
        return new Response(200, "获取数据成功", res);
    }

    @GetMapping("/{id}")
    public Response findById(@PathVariable int id) {
        Article res = articleService.findById(id);
        return new Response(200, "success", res);
    }

    @PostMapping("/update")
    public Response update(@RequestBody Article article) {
        try {
            if (articleService.update(article) != 1) throw new Exception("更新失败");
            else return new Response(200, "更新成功");
        }catch(Exception e) {
            return new Response(500, e.getMessage());
        }
    }

    @PostMapping("create")
    public Response create(@RequestBody Article article) {
        try{
            if (articleService.create(article) != 1) throw new Exception("添加失败");
            else return new Response(200, "添加成功");
        }catch(Exception e) {
            return new Response(500, e.getMessage());
        }
    }

    @DeleteMapping("/delete/{state}")
    public Response delete(@RequestBody int[] ids, @PathVariable int state) {
        int num;
        try{
            if (state == 2) num = articleService.delete(ids);
            else num = articleService.recycle(ids);
            if (num == 0) throw new Exception("删除失败");
            else return new Response(200,"删除成功");
        }catch(Exception e) {
            return new Response(500, e.getMessage());
        }
    }
}
