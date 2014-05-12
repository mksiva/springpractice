package com.tt.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tt.common.model.Device;

@Controller
public class EntryController
{
    @RequestMapping(value = "/login/{username}/{password}", method = RequestMethod.GET)
    public @ResponseBody String enterToSystemGet(@PathVariable String username,@PathVariable  String password) {
        if(!username.isEmpty() && !password.isEmpty() && username.equals("admin") && password.equals("admin")){
            return "ok";
        }
        return "no";
    }
    
    @RequestMapping(value = "/loginme", method = RequestMethod.POST)
    public @ResponseBody String enterToSystem(@RequestParam("username") String username,
        @RequestParam("password") String password) {
        if(!username.isEmpty() && !password.isEmpty() && username.equals("admin") && password.equals("admin")){
            return "ok";
        }
        return "no";
    }
}
