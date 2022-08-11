/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package I3.Classes;

/**
 *
 * @author Abel
 */
public class Login {
    private String username;
    private String password;
    private String usertype;
      public String getUserName() {
        return username;
    }
       public void setUserName(String name) {
        this.username = name;
    }
       public String getUserType() {
        return usertype;
    }
       public void setUserType(String name) {
        this.usertype = name;
    }
        public String getPassword() {
        return password;
    }
       public void setPassword(String name) {
        this.password = name;
    }
}
