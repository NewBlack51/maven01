package com.cch.service.impl;

import org.springframework.transaction.annotation.Transactional;

import com.cch.dao.UserDao;
import com.cch.domain.User;
import com.cch.service.UserService;

/**  
 * ClassName:UserServiceImpl <br/>  
 * Function:  <br/>  
 * Date:     2018年3月10日 上午9:26:11 <br/>       
 */
@Transactional
public class UserServiceImpl implements UserService {

    private UserDao userDao;
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    
    @Override
    public User findById(Integer id) {
        return userDao.findById(id);
    }

}
  
