package com.example.PP_3_1_4_REST.util;

import com.example.PP_3_1_4_REST.model.Role;
import com.example.PP_3_1_4_REST.model.User;
import com.example.PP_3_1_4_REST.service.RoleService;
import com.example.PP_3_1_4_REST.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;

@Component
public class DataInit {

    private UserService userService;
    private RoleService roleService;

    @Autowired
    public DataInit(UserService userService, RoleService roleService) {
        this.userService = userService;
        this.roleService = roleService;
    }

    @PostConstruct
    private void init() {
        Role role0 = new Role("ADMIN");
        Role role1 = new Role("USER");
        roleService.saveRole(role0);
        roleService.saveRole(role1);

        User user0 = new User();
        user0.setEmail("admin@mail.com");
        user0.setPassword("admin");
        user0.setName("Admin");
        user0.setAge((byte) 33);
        user0.addRole(role0);

        User user1 = new User();
        user1.setEmail("user@mail.com");
        user1.setPassword("user");
        user1.setName("User");

        user1.setAge((byte) 33);
        user1.addRole(role1);

        userService.save(user0);
        userService.save(user1);

    }
}
