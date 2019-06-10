package cn.emrys.springboot.controller;

import cn.emrys.springboot.entity.Article;
import cn.emrys.springboot.entity.Response;
import cn.emrys.springboot.services.ArticleService;
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

    @PutMapping("/update")
    public Response update(@RequestBody Article article) {
        return new Response(200, "success");
    }

    @PostMapping("create")
    public Response create(@RequestBody Article article) {
        return new Response(200, "success");
    }

    @DeleteMapping("/delete/{id}")
    public Response delete(@PathVariable int id) {
        return new Response(200, "success");
    }
}
