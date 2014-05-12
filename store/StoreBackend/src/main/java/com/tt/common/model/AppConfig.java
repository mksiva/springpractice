package com.tt.common.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.QueryHint;
import javax.persistence.Table;

import org.hibernate.validator.NotNull;

@Entity
@Table(name = "APP_CONFIG")
@NamedQueries(value = {
        @NamedQuery(name = "ALLAPPCONFIG", query = AppConfig.ALLAPPCONFIG, hints = {@QueryHint(name = "org.hibernate.cacheable", value = "true")})     
        })
public class AppConfig implements java.io.Serializable
{
    /**
     * 
     */
    private static final long serialVersionUID = 4541924938631796427L;

    public static final String ALLAPPCONFIG = "FROM AppConfig";
    
    
    private String key;

    private String value;
    
    public AppConfig()
    {
    }

    public AppConfig(String key, String value)
    {
        this.key = key;
        this.value = value;
    }
    
    @Id
    @Column(name = "KEY", unique = true, nullable = false, precision = 18, scale = 0)
    @NotNull
    public String getKey()
    {
        return key;
    }

    public void setKey(String key)
    {
        this.key = key;
    }

    @Column(name = "VALUE")
    public String getValue()
    {
        return value;
    }

    public void setValue(String value)
    {
        this.value = value;
    }
}
