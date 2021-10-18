package by.itstep.internetMarket.controller.impl;

import by.itstep.internetMarket.controller.RolesController;
import by.itstep.internetMarket.service.RolesService;
import by.itstep.internetMarket.service.ServiceFactory;

import javax.management.relation.Role;
import java.util.List;

public class RolesControllerImpl implements RolesController {

    private RolesService rolesService;

    public RolesControllerImpl(){
        this.rolesService = ServiceFactory.getInstance().getRolesService();
    }

    @Override
    public void addRole(Role role) {

    }

    @Override
    public void removeRole(int id) {

    }

    @Override
    public void updateRole(Role role) {

    }

    @Override
    public List listRoles() {
        return null;
    }

    @Override
    public Role getRole(String name) {
        return null;
    }
}
