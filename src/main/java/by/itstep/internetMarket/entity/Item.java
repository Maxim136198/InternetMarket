package by.itstep.internetMarket.entity;


import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "item")
public class Item {

    @Id
    @ManyToMany
    @JoinColumn(name = "order_id")
    private int orderId;

    @Id
    @ManyToMany
    @JoinColumn(name = "product_id")
    private int productId;


    @Override
    public String toString() {
        return "Item{" +
                "orderId=" + orderId +
                ", productId=" + productId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return orderId == item.orderId &&
                productId == item.productId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, productId);
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }
}
