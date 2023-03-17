// this is service which gives the logical functionality of rest api
package com.kefalebootstring.springtest.test;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    private Repo repo;

    public List<employee> test() {
        return repo.findAll();
    }

    public void create(employee employee) {
        repo.save(employee);
    }

    public void update(employee employee) {
        repo.save(employee);
    }

    public void delete(employee employee) {
        repo.delete(employee);

    }
}

