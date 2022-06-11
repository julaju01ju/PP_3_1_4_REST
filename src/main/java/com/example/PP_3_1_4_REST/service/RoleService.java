package com.example.PP_3_1_4_REST.service;

import com.example.PP_3_1_4_REST.model.Role;

import java.util.List;

public interface RoleService {

    List<Role> getAllRoles();

    Role findById(Long id);

    void saveRole(Role role);
}
