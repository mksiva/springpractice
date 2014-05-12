/**
 * 
 */
package com.tt.common.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.tt.common.model.AppConfig;

/**
 * @author ski8cob
 *
 */
public class CommonDAOImpl extends HibernateDaoSupport implements CommonDAO
{

    /* (non-Javadoc)
     * @see com.tt.common.dao.CommonDAO#getAppConfig()
     */
    @Override
    public List<AppConfig> getAppConfig()
    {
        
        String queryString = "from AppConfig appconfig";
        return getHibernateTemplate().find(queryString);
    }

}
