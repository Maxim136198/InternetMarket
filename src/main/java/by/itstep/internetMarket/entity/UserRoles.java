package by.itstep.internetMarket.entity;


import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "user_roles")
public class UserRoles {

    @Id
    @ManyToOne
    @JoinColumn(name = "user_id")
    private int userId;

    @Id
    @ManyToOne
    @JoinColumn(name = "role_id")
    private int roleId;

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

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }
}
