package by.itstep.internetMarket.controller.impl;

import by.itstep.internetMarket.controller.RolesController;
import by.itstep.internetMarket.dao.entity.Roles;
import by.itstep.internetMarket.service.RolesService;


import java.util.List;

public class RolesControllerImpl implements RolesController {


    private RolesService rolesService;


    @Override
    public void addRoles(Roles roles) {
        rolesService.save(roles);
    }

    @Override
    public void removeRoles(Long id) {
        rolesService.deleteById(id);
    }

    @Override
    public void updateRoles(Roles roles) {
rolesService.updateRoles(roles);
    }

    @Override
    public List listRoles() {
        return rolesService.findAll();
    }

    @Override
    public Roles getRoles(String name) {
        return rolesService.findByName(name);
    }
}
