package by.itstep.internetMarket.dao.entity;


import javax.management.relation.Role;
import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name", unique = true, nullable = false)
    @Size(min = 3, max = 50)
    private String name;

    @Column(name = "password", unique = true, nullable = false)
    @Size(min = 6, max = 50)
    private String password;

    @ManyToMany
    @JoinTable(name = "role_id")
    private Set<Roles> roleId;

    @OneToMany(mappedBy = "order")
    @Column(name = "order")
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
        return id.equals(user.id) &&
                name.equals(user.name) &&
                password.equals(user.password) &&
                roleId.equals(user.roleId) &&
                orders.equals(user.orders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, password, roleId, orders);
    }

    public User() {
    }


    public User(Long id, @Size(min = 3, max = 50) String name, @Size(min = 6, max = 50) String password, Set<Roles> roleId, List<Order> orders) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.roleId = roleId;
        this.orders = orders;
    }

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
