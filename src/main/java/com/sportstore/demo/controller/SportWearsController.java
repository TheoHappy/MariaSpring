package com.sportstore.demo.controller;



import com.sportstore.demo.repository.SportWearsRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sport")
public class SportWearsController {

    SportWearsRepository sportWears = new SportWearsRepository();

    @GetMapping("/wears")
    public List<String> wearsList() {
        return sportWears.getSportWears();
    }


    @PostMapping("/addWear/{name}")
    public void addWears(@PathVariable("name") String name) {
        sportWears.addWears(name);

    }
}
