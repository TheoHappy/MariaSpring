package com.sportstore.demo.controller;

import com.sportstore.demo.repository.SportTypeRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sport")
public class SportTypeController {
    @GetMapping
    public String test() {
        return "First try in Spring Web";
    }

    private SportTypeRepository sportType1 = new SportTypeRepository();

    @GetMapping("/type")
    public List<String> typeList() {
        return sportType1.getType();
    }

    @PutMapping("/addtype/{name}")
    public void addTypes(@PathVariable("name") String name) {
        sportType1.addTypes(name);
    }

    @DeleteMapping("/delType/{name}")
    public void delType(@PathVariable("name") String name) {
        sportType1.delType(name);
    }
}
