package org.alex.springappic.restmodels;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class UserData {
    
    private long id;
    private String userName;
    private String userPassword;
    private String email;
    private long roleId;
    
    public String toString() {
        
        return "User data: [id=" + id + "]"
                + "[userName=" + userName + "]"
                + "[userPassword=" + userPassword + "]"
                + "[email=" + email + "]"
                + "[roleId=" + roleId + "]";        
    }
}
