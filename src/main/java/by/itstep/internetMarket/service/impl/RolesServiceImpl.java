package by.itstep.internetMarket.service.impl;

import by.itstep.internetMarket.dao.DaoFactory;
import by.itstep.internetMarket.dao.RolesDao;
import by.itstep.internetMarket.service.RolesService;

import javax.management.relation.Role;
import java.util.List;

public class RolesServiceImpl implements RolesService {
    private RolesDao roleDao;

    public RolesServiceImpl() {
        this.roleDao = DaoFactory.getInstance().getRolesDao();
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
