package by.itstep.internetMarket.dto.response;

import by.itstep.internetMarket.dao.entity.Roles;
import by.itstep.internetMarket.dto.RolesDto;

import java.util.Set;


public class UserResponseDto {

    private Long id;

    private String name;

    private RolesDto roles;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RolesDto getRoles() {
        return roles;
    }

    public void setRoles(RolesDto roles) {
        this.roles = roles;
    }
}
