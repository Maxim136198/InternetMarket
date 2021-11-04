package by.itstep.internetMarket.service.impl;

import by.itstep.internetMarket.dao.repository.RolesRepository;
import by.itstep.internetMarket.dao.entity.Roles;
import by.itstep.internetMarket.service.RolesService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RolesServiceImpl implements RolesService {

    @Autowired
    private RolesRepository rolesRepository;


    @Override
    public void addRoles(Roles roles) {
        rolesRepository.save(roles);
    }

    @Override
    public void removeRolesById(Long id) {
        rolesRepository.deleteById(id);
    }

    @Override
    public void updateRoles(Roles roles) {
rolesRepository.saveAndFlush(roles);
    }

    @Override
    public List<Roles> listRoles() {
        return rolesRepository.findAll();
    }

    @Override
    public Roles getRoles(String name) {
        return rolesRepository.findByName(name);
    }
}
