package cn.emrys.springboot.controller;

import cn.emrys.springboot.entity.Detail;
import cn.emrys.springboot.services.DetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/detail")
public class DetailController {

    @Autowired
    DetailService detailService;

    /**
     * 根据id查询单个文章详情
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public List<Detail> getById(@PathVariable int id) {
        return detailService.findById(id);
    }

    /**
     * 查询所有文章详情
     * @return
     */
    @GetMapping("/getall")
    public List<Detail> getAll() {
        return detailService.findAll();
    }
}
