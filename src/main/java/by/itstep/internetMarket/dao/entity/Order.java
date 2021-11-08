package by.itstep.internetMarket.dao.entity;


import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User userId;

    @Column(name = "date", nullable = false)
    private LocalDateTime dateOfPurchases;

    @Column(name = "price")
    private Double purchasePrice;

    //=========================
    @OneToMany(mappedBy = "user")
    private Set<User> user;

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", userId=" + userId +
                ", dateOfPurchases=" + dateOfPurchases +
                ", purchasePrice=" + purchasePrice +
                ", user=" + user +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return id.equals(order.id) &&
                userId.equals(order.userId) &&
                dateOfPurchases.equals(order.dateOfPurchases) &&
                purchasePrice.equals(order.purchasePrice) &&
                user.equals(order.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, dateOfPurchases, purchasePrice, user);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public LocalDateTime getDateOfPurchases() {
        return dateOfPurchases;
    }

    public void setDateOfPurchases(LocalDateTime dateOfPurchases) {
        this.dateOfPurchases = dateOfPurchases;
    }

    public Double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Set<User> getUser() {
        return user;
    }

    public void setUser(Set<User> user) {
        this.user = user;
    }
}
