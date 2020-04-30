package com.amoc.api;

import com.amoc.domain.Student;
import com.amoc.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/es")
public class ESController {

    @Autowired
    private SearchService searchService;

    @PostMapping("/addValue")
    public void addValue(@RequestBody Student student) {
        searchService.saveValue(student);
    }

    @GetMapping("/getValue")
    public Student getValue(long id) {
        return searchService.getValue(id);
    }

    @PostMapping("/createIndex")
    public void createIndex() {
        searchService.createIndex();
    }

    @DeleteMapping("/delUserById")
    public void delUserById(long id) {
        searchService.deleteById(id);
    }
}
