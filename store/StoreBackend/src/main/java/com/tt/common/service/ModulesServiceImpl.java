package com.tt.common.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tt.common.model.Modules;
import com.thillai.store.dto.User;
import com.tt.common.dao.ModulesDAO;



@Service
public class ModulesServiceImpl implements ModulesService
{

    @Autowired
    private ModulesDAO modulesDAO;

    @Override
    public List<Modules> findAllModules()
    {
        return modulesDAO.findAllModules();
    }

    @Override
    public List<User> findAllUsers()
    {
        // TODO Auto-generated method stub
        return modulesDAO.findAllUsers();
    }

    @Override
    public String addModule(Modules module)
    {
        return modulesDAO.addModule(module);
    }
@Override
public String deleteModule(String moduleId)
{
    // TODO Auto-generated method stub
    return modulesDAO.deleteModule(moduleId);
}
}
