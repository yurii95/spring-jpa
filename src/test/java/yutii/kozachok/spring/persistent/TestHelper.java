package yutii.kozachok.spring.persistent;

import yutii.kozachok.spring.persistent.domain.Role;
import yutii.kozachok.spring.persistent.domain.User;

import java.util.ArrayList;
import java.util.List;

class TestHelper {

    static User buildUser() {
        User user =new User();
        List<Role> roles = new ArrayList<>();
        roles.add(new Role("SUPER"));
        user.setRoles(roles);
        user.setUserName("AlEX");
        return user;
    }
}
