package org.example.mooncserve.controller;

import org.example.mooncserve.entity.People;
import org.example.mooncserve.service.IPeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PeopleController {
    private final IPeopleService peopleService;
    @Autowired
    public PeopleController(IPeopleService peopleService) {
        this.peopleService = peopleService;
    }

    // 新建成员
    @GetMapping("addPeople")
    @ResponseBody
    public boolean addPeople() {
        People people = new People("李四",20);
        peopleService.save(people);
        return true;
    }

    // 删除成员
    @GetMapping("removePeopleById")
    @ResponseBody
    public boolean removePeopleById(@RequestParam("id") String id) {
        return peopleService.removeById(id);
    }

    // 获取成员
    // 需要为实体添加一个无参构造器
    @GetMapping("getPeopleById")
    @ResponseBody
    public People getPeopleById(@RequestParam("id") Integer id) {
        return peopleService.getById(id);
    }

    // 获取所有成员
    // 需要为实体添加一个无参构造器
    @GetMapping("getAllPeople")
    @ResponseBody
    public List<People> getAllPeople() {
        return peopleService.list();
    }
}
