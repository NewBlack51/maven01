package com.cch.dao.impl;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.cch.dao.UserDao;
import com.cch.domain.User;

/**  
 * ClassName:UserDaoImpl <br/>  
 * Function:  <br/>  
 * Date:     2018年3月10日 上午9:25:35 <br/>       
 */
public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

    @Override
    public User findById(Integer id) {
          
        return getHibernateTemplate().get(User.class, id);
    }

}
  
