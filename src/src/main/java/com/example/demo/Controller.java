package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;


@RestController
public class Controller {
    @RequestMapping(value = "/")
    public String home() {
        return "Welcome to spring boot API";
    }

    @RequestMapping(value = "/words")
    public List<String> getWords() {
        List<String> words=new ArrayList<>();
        String [] word={"hy","hello","bye"};
        words.addAll(Arrays.asList(word));
        return words;
    }
}
