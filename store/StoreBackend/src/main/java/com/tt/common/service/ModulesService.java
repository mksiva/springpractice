package com.tt.common.service;

import java.util.List;

import com.tt.common.model.Modules;
import com.thillai.store.dto.User;

public interface ModulesService
{
    public List<Modules> findAllModules();
    public List<User> findAllUsers();
    public String addModule(Modules module);
    public String deleteModule(String moduleId);
}
