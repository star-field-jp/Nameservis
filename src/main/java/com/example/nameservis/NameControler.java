package com.example.nameservis;

import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NameControler {

    private NameMapper nameMapper;

    public NameControler(NameMapper nameMapper){
        this.nameMapper = nameMapper;
    }
/*
    @GetMapping("/names")
    public List<Name> getNames(){
        List<Name> names = nameMapper.findAll();
        return names;
    }
*/
    @GetMapping("/names")
    public List<Name> findByNames(@RequestParam String startsWith) {
        return nameMapper.findByNameStartingWith(startsWith);
    }


}
