package OnlineStoreApp.demo.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class CustomUserDetails  {
    private User user;
    private Role role;
    private boolean locked;
    private boolean enabled;


//    public CustomUserDetails(User user){
//        this.user=user;
//    }
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities(){
//        return null;
//    }
//
//    @Override
//    public String getPassword() {
//        return user.getPassword();
//    }
//
//    @Override
//    public String getUsername() {
//        return user.getEmail();
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return false;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return !locked;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return false;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return enabled;
//    }


//    public String getFullName(){
//        return user.getFirstName() + " " + user.getLastName();
//    }




}
