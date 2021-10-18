package by.itstep.internetMarket.service;

import javax.management.relation.Role;
import java.util.List;

public interface RolesService {
    void addRole(Role role);

    void removeRole(int id);

    void updateRole(Role role);

    List listRoles();

    Role getRole(String name);
}
