package com.kefalebootstring.springtest.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class controller {
    @Autowired
    private Service service;
    @GetMapping("/test")
    public List<employee> test(){
        return service.test();
    }
    @PostMapping
    public void create(@RequestBody employee employee){
        service.create(employee);
    }
    @PutMapping
    public String update(@RequestBody employee employee){
        service.update(employee);
        return "updated successfully";
    }
    @DeleteMapping()
    public String delete(@RequestBody employee employee){
        service.delete(employee);
        return "deleted";
    }
}

