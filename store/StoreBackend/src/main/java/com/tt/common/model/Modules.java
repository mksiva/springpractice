package com.tt.common.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "MODULES")
public class Modules
{    
    @Id
    private String module_id;
    
    private String name_lang_key;
    
    private String desc_lang_key;
    
    private int sort;
    
    public Modules()
    {
        // TODO Auto-generated constructor stub
    }
    
    public Modules(String module_id,String name_lang_key,String desc_lang_key,int sort)
    {
        this.module_id = module_id;
        this.name_lang_key = name_lang_key;
        this.desc_lang_key = desc_lang_key;
        this.sort = sort;
    }

    public String getModule_id()
    {
        return module_id;
    }

    public void setModule_id(String module_id)
    {
        this.module_id = module_id;
    }

    public String getName_lang_key()
    {
        return name_lang_key;
    }

    public void setName_lang_key(String name_lang_key)
    {
        this.name_lang_key = name_lang_key;
    }

    public String getDesc_lang_key()
    {
        return desc_lang_key;
    }

    public void setDesc_lang_key(String desc_lang_key)
    {
        this.desc_lang_key = desc_lang_key;
    }

    public int getSort()
    {
        return sort;
    }

    public void setSort(int sort)
    {
        this.sort = sort;
    }

    
   
    
}
