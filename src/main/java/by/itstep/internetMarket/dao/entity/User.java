package by.itstep.internetMarket.dao.entity;


import javax.management.relation.Role;
import javax.persistence.*;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "password")
    private String password;

    @ManyToMany
    @JoinTable(name = "role_id")
    private Set<Roles> roleId;

    @OneToMany(mappedBy = "order")
    private List<Order> orders;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", roleId=" + roleId +
                ", orders=" + orders +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id &&
                roleId == user.roleId &&
                name.equals(user.name) &&
                password.equals(user.password) &&
                orders.equals(user.orders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, password, roleId, orders);
    }

    public User() {
    }

    public User(int id, String name, String password, Set<Roles> roleId, List<Order> orders) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.roleId = roleId;
        this.orders = orders;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Roles> getRoleId() {
        return roleId;
    }

    public void setRoleId(Set<Roles> roleId) {
        this.roleId = roleId;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
