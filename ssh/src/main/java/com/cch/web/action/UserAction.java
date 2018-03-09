package com.cch.web.action;

import com.cch.domain.User;
import com.cch.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**  
 * ClassName:UserAction <br/>  
 * Function:  <br/>  
 * Date:     2018年3月9日 下午3:34:17 <br/>       
 */
public class UserAction extends ActionSupport implements ModelDriven<User>{
    
    private User user;
    @Override
    public User getModel() {
        if(user==null){
            user=new User();
        }
        return user;
    }
    
    private UserService userService;
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    
    public String findById(){
        System.out.println("收到请求....");
        user=userService.findById(user.getId());
        System.out.println("user===="+user);
        return SUCCESS;
    }
    

}
  
