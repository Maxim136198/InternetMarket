package by.itstep.internetMarket.service.impl;

import by.itstep.internetMarket.dao.repository.RolesRepository;
import by.itstep.internetMarket.dao.entity.Roles;
import by.itstep.internetMarket.service.RolesService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Objects;

public class RolesServiceImpl implements RolesService {

    @Autowired
    private RolesRepository rolesRepository;


    public RolesServiceImpl(RolesRepository rolesRepository) {
        this.rolesRepository = rolesRepository;
    }

    @Override
    public Roles save(Roles roles) {
        validate(roles.getId() != null, "error.role.notHaveId");
        validate(rolesRepository.existsByName(roles.getRoleName()),"error.role.name.notUnique");
        return rolesRepository.saveAndFlush(roles);
    }

    @Override
    public void delete(Roles roles) {
        final Long id = roles.getId();
        validate(id == null, "error.role.haveId");
        findById(id);
        rolesRepository.delete(roles);
    }

    @Override
    public void deleteById(Long id) {
        findById(id);
        rolesRepository.deleteById(id);
    }

    @Override
    public Roles updateRoles(Roles roles) {
        final Long id = roles.getId();
        validate(id == null, "error.role.haveId");
        final Roles duplicateRole = rolesRepository.findByName(roles.getRoleName());
        findById(id);
        final boolean isDuplicateExists = duplicateRole != null && !Objects.equals(duplicateRole.getId(), id);
        validate(isDuplicateExists, "error.role.name.notUnique");
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
        validate(!rolesRepository.existsByName(name),"error.user.name.notUnique" );
        return rolesRepository.findByName(name);
    }


    private void validate(boolean expression, String errorMessage) {
        if (expression) {
            throw new RuntimeException(errorMessage);
        }
    }


}
