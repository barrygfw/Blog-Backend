package cn.emrys.springboot.controller;

import cn.emrys.springboot.entity.Category;
import cn.emrys.springboot.entity.Response;
import cn.emrys.springboot.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cate")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @GetMapping("all")
    public Response all() {
        List<Category> res = categoryService.findAll();
        return new Response(200,"获取数据成功!", res);
    }

    @PostMapping("/add")
    public Response create(@RequestBody Category category) {
        try{
            if (category.getCateName() == null) throw new Exception("检查参数");
            if (categoryService.create(category) != 1) throw new Exception("添加失败");
            return new Response(200, "添加成功");
        }catch(Exception e) {
            return new Response(500, e.getMessage());
        }
    }

    @PutMapping("update")
    public Response update(@RequestBody Category category) {
        try{
            if (categoryService.update(category) != 1) throw new Exception("更新失败");
            return new Response(200, "更新成功");
        }catch(Exception e) {
            return new Response(500, e.getMessage());
        }
    }

    @DeleteMapping("del")
    public Response delete(@RequestBody int[] ids) {
        int num;
        try{
            num = categoryService.delete(ids);
            if (num == 0) throw new Exception("删除失败");
            else return new Response(200, "删除 " + num + " 条数据成功");
        }catch(Exception e) {
            return new Response(500, e.getMessage());
        }
    }
}
