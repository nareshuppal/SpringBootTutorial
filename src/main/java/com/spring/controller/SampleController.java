package com.spring.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class SampleController {

    @RequestMapping("/home")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

    @RequestMapping(method=RequestMethod.GET)
    public String getAll() {
      return new String("Hello Docker");
    }
    
    @RequestMapping(method=RequestMethod.POST)
    public String create(@RequestBody String str) {
      return str;
    }
    
    @RequestMapping(method=RequestMethod.DELETE, value="{id}")
    public void delete(@PathVariable String id) {

    }
    
    @RequestMapping(method=RequestMethod.PUT, value="{id}")
    public String update(@PathVariable String id, @RequestBody String str) {
    return str;
    }	
        
}