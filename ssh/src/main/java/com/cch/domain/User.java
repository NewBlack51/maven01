package com.cch.domain;  
/**  
 * ClassName:User <br/>  
 * Function:  <br/>  
 * Date:     2018年3月9日 下午3:28:23 <br/>       
 */
public class User {
    
    private Integer id;
    private String name;
    private String password;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", password=" + password + "]";
    }
}
  
