package com.example.addSample;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class addController {

    @PostMapping("/add")
    public int add(@RequestBody add sum){
        return sum.getNum1()+ sum.getNum2();
    }
}
