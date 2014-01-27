
package fh.ostfalia.projekt2014.login;

import javax.ejb.Stateful;

/**
 *
 * @author Yannick
 */
@Stateful
public class LoginBean {
    private String username;
    private String password; 

    public LoginBean() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
    
    
   

}
