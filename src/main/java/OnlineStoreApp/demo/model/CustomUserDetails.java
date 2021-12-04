package OnlineStoreApp.demo.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.util.Collection;

@Getter
@Setter
@NoArgsConstructor
public class CustomUserDetails {
    private User user;
    private Role role;
    private boolean locked;
    private boolean enabled;




    public String getPassword() {
        return user.getPassword();
    }


    public String getUsername() {
        return user.getEmail();
    }

    public boolean isAccountNonExpired() {
        return false;
    }

    public boolean isAccountNonLocked() {
        return !locked;
    }


    public boolean isCredentialsNonExpired() {
        return false;
    }


    public boolean isEnabled() {
        return enabled;
    }


//    public String getFullName(){
//        return user.getFirstName() + " " + user.getLastName();
//    }




}
