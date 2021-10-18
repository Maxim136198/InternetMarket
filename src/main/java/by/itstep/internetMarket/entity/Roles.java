package by.itstep.internetMarket.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "roles")
public class Roles {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @JoinColumn(name = "role_name")
    private String roleName;

    @Override
    public String toString() {
        return "Roles{" +
                "id=" + id +
                ", roleName='" + roleName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Roles roles = (Roles) o;
        return id == roles.id &&
                roleName.equals(roles.roleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleName);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
