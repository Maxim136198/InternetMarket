package by.itstep.internetMarket.controller;

import javax.management.relation.Role;
import java.util.List;

public interface RolesController {
    void addRole(Role role);

    void removeRole(int id);

    void updateRole(Role role);

    List listRoles();

    Role getRole(String name);
}
