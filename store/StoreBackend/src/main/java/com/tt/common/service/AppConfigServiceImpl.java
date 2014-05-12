/**
 * 
 */
package com.tt.common.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tt.common.dao.CommonDAO;
import com.tt.common.model.AppConfig;

/**
 * @author ski8cob
 *
 */
public class AppConfigServiceImpl implements AppConfigService
{

    @Autowired
    private CommonDAO commonDAO;
    /* (non-Javadoc)
     * @see com.tt.common.service.AppConfigService#getAppConfig()
     */
    @Override
    public List<AppConfig> getAppConfig()
    {
        // TODO Auto-generated method stub
        return commonDAO.getAppConfig();
    }

}
