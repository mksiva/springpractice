package com.tt.common.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tt.common.model.Modules;
import com.thillai.store.dto.User;
import com.tt.common.model.AppConfig;

import com.tt.common.service.AppConfigService;
import com.tt.common.service.ModulesService;

@Controller
public class CommonController
{

  //  @Autowired
    //private AppConfigService appConfigService;
    
    @Autowired
    private ModulesService modulesService;
    
    @RequestMapping(value= RESTURIConstants.APP_CONFIG ,method=RequestMethod.GET)
    public @ResponseBody
    List<AppConfig> fetchAppConfig(){
        
        return null;// appConfigService.getAppConfig();
    }
    
    @RequestMapping(value=RESTURIConstants.VIEW_MODULES ,method=RequestMethod.GET)
    public @ResponseBody
    List<Modules> fetchModules(){
        
        return modulesService.findAllModules();
    }
    
    /*
    @RequestMapping(value="/addModule" ,method=RequestMethod.POST)//,consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    String addModule(@RequestParam("module_id") String module_id,
        @RequestParam("name_lang_key") String name_lang_key,@RequestParam("desc_lang_key") String desc_lang_key,@RequestParam("sort") String sort){
        Modules modules = new Modules(module_id, name_lang_key, desc_lang_key, Integer.parseInt(sort));
       String status =  modulesService.addModule(modules);
        return status;
    }
    */
    
    @RequestMapping(value=RESTURIConstants.ADD_MODULE ,method=RequestMethod.POST)//,consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    String putModule(Modules module){
        System.out.println("addModule" + module.getModule_id() + module.getName_lang_key() + module.getDesc_lang_key());
       String status =  modulesService.addModule(module);
        return status;
    }
    
    @RequestMapping(value=RESTURIConstants.REMOVE_MODULE ,method=RequestMethod.GET)//,consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    String removeModule(@PathVariable String module_id){        
       String status =  modulesService.deleteModule(module_id);
        return status;
    }
    
    @RequestMapping(value="/users" ,method=RequestMethod.GET)
    public @ResponseBody
    List<User> fetchUsers(){
        
        return modulesService.findAllUsers();
    }
}
