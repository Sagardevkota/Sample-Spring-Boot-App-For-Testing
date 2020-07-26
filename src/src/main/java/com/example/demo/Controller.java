package com.example.demo;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;


@RestController
@RequestMapping(value = "/api")
public class Controller {


    @ApiOperation(value = "get words",notes = "Call the endpoint to see the result")
    @RequestMapping(value = "/words")
    public List<String> getWords() {
        List<String> words=new ArrayList<>();
        String [] word={"hy","hello","bye"};
        words.addAll(Arrays.asList(word));
        return words;
    }
}
