package by.itstep.internetMarket.service;

import by.itstep.internetMarket.dao.entity.Roles;

import java.util.List;

public interface RolesService {
    Roles save(Roles roles);

    void delete(Roles roles);

    void deleteById(Long id);

    Roles updateRoles(Roles roles);

    List<Roles> findAll();

    Roles findById(Long id);

    Roles findByName(String name);
}
