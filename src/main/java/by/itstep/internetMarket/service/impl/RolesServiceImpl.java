package by.itstep.internetMarket.service.impl;

import by.itstep.internetMarket.dao.repository.RolesRepository;
import by.itstep.internetMarket.dao.entity.Roles;
import by.itstep.internetMarket.service.RolesService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RolesServiceImpl implements RolesService {

    @Autowired
    private RolesRepository rolesRepository;

    public RolesServiceImpl(RolesRepository rolesRepository) {
        this.rolesRepository = rolesRepository;
    }

    @Override
    public Roles save(Roles roles) {
        return rolesRepository.save(roles);
    }

    @Override
    public void delete(Roles roles) {
        rolesRepository.delete(roles);
    }

    @Override
    public void deleteById(Long id) {
        rolesRepository.deleteById(id);
    }

    @Override
    public Roles updateRoles(Roles roles) {
return rolesRepository.saveAndFlush(roles);
    }

    @Override
    public List<Roles> findAll() {
        return rolesRepository.findAll();
    }

    @Override
    public Roles findById(Long id) {
        return rolesRepository.findById(id).orElseThrow(() -> new RuntimeException("roles not found"));
    }

    @Override
    public Roles findByName(String name) {
        return rolesRepository.findByName(name);
    }




}
