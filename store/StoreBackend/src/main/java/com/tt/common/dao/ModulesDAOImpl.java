/**
 * 
 */
package com.tt.common.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.tt.common.model.Modules;
import com.thillai.store.dto.User;


/**
 * @author ski8cob
 *
 */
public class ModulesDAOImpl implements ModulesDAO
{

    @Autowired
    private MongoTemplate mongoTemplate;
    /* (non-Javadoc)
     * @see com.tt.common.dao.ModulesDAO#findAllModules()
     */
    @Override
    public List<User> findAllUsers()
    {
        return mongoTemplate.findAll(User.class);
    }
    @Override
    public List<Modules> findAllModules()
    {
        return mongoTemplate.findAll(Modules.class);
    }
    @Override
    public String addModule(Modules module)
    {
        String status = "success";
        try
        {
            mongoTemplate.save(module);
        }
        catch (Exception e)
        {
            status = "failed";
           e.printStackTrace();
        }
        return status;
    }
    
    @Override
    public String deleteModule(String moduleId)
    {
        String status = "success";
        try
        {
         // query to search user
            Query searchUserQuery = new Query(Criteria.where("module_id").is(moduleId));
            Modules mod = mongoTemplate.findOne(searchUserQuery, Modules.class);
            System.out.println(mod.getDesc_lang_key() + "======" + mod.getName_lang_key() + "--" + mod.getModule_id());
            mongoTemplate.remove(searchUserQuery,Modules.class);
           // mongoTemplate.dropCollection(Modules.class);
        }
        catch (Exception e)
        {
            status = "failed";
           e.printStackTrace();
        }
        return status;
    }
}
