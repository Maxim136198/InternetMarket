package by.itstep.internetMarket.dao.entity;


import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "user_roles")
public class UserRoles {


    @EmbeddedId
    private UserRolesId id = new UserRolesId();

    @ManyToOne
    @MapsId("userId")
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User userId;


    @ManyToOne
    @MapsId("roleId")
    @JoinColumn(name = "role_id")
    private Roles roleId;

    @Override
    public String toString() {
        return "UserRoles{" +
                "userId=" + userId +
                ", roleId=" + roleId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserRoles userRoles = (UserRoles) o;
        return userId == userRoles.userId &&
                roleId == userRoles.roleId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, roleId);
    }

    public UserRolesId getId() {
        return id;
    }

    public void setId(UserRolesId id) {
        this.id = id;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public Roles getRoleId() {
        return roleId;
    }

    public void setRoleId(Roles roleId) {
        this.roleId = roleId;
    }
}
