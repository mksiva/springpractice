package com.tt.common.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.NotNull;

@Entity
@Table(name = "MODULES")
public class ModulesSQL implements Serializable
{

    /**
     * 
     */
    private static final long serialVersionUID = -6566803547279533902L;
    
    private String module_id;
    
    private String name_lang_key;
    
    private String desc_lang_key;
    
    private int sort;
    
    public ModulesSQL()
    {
        // TODO Auto-generated constructor stub
    }
    
    public ModulesSQL(String module_id,String name_lang_key,String desc_lang_key,int sort)
    {
        this.module_id = module_id;
        this.name_lang_key = name_lang_key;
        this.desc_lang_key = desc_lang_key;
        this.sort = sort;
    }

    @Id
    @Column(name = "MODULE_ID", unique = true, nullable = false, precision = 18, scale = 0)
    @NotNull
    public String getModule_id()
    {
        return module_id;
    }

    public void setModule_id(String module_id)
    {
        this.module_id = module_id;
    }

    @Column(name = "NAME_LANG_KEY")
    public String getName_lang_key()
    {
        return name_lang_key;
    }

    public void setName_lang_key(String name_lang_key)
    {
        this.name_lang_key = name_lang_key;
    }

    @Column(name = "DESC_LANG_KEY")
    public String getDesc_lang_key()
    {
        return desc_lang_key;
    }

    public void setDesc_lang_key(String desc_lang_key)
    {
        this.desc_lang_key = desc_lang_key;
    }

    @Column(name = "SORT")
    public int getSort()
    {
        return sort;
    }

    public void setSort(int sort)
    {
        this.sort = sort;
    }
    
    
}
