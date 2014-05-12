package com.tt.common.dao;

import java.util.List;

import com.thillai.store.dto.User;
import com.tt.common.model.Modules;



public interface ModulesDAO
{
    public List<Modules> findAllModules();
    public List<User> findAllUsers();
    public String addModule(Modules module);
    public String deleteModule(String moduleId);
}
