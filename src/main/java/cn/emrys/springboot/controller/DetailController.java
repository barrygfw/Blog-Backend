package cn.emrys.springboot.controller;

import cn.emrys.springboot.entity.Detail;
import cn.emrys.springboot.services.DetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DetailController {

    @Autowired
    DetailService detailService;

    @RequestMapping("/findArtical/{id}")
    public List<Detail> getById(@RequestParam("id") int id) {
        return detailService.findById(id);
    }
}
