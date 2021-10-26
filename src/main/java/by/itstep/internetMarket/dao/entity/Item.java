package by.itstep.internetMarket.dao.entity;


import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "item")
public class Item {


    @EmbeddedId
    private ItemId id = new ItemId();

    @ManyToOne
    @MapsId("orderId")
    @JoinColumn(name = "order_id", referencedColumnName = "id")
    private Order orderId;


    @ManyToOne
    @MapsId("productId")
    @JoinColumn(name = "product_id", referencedColumnName = "id")
    private Product productId;


    private int count;


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

    public Item() {
    }

    public Item(ItemId id, Order orderId, Product productId) {
        this.id = id;
        this.orderId = orderId;
        this.productId = productId;
    }

    public ItemId getId() {
        return id;
    }

    public void setId(ItemId id) {
        this.id = id;
    }

    public Order getOrderId() {
        return orderId;
    }

    public void setOrderId(Order orderId) {
        this.orderId = orderId;
    }

    public Product getProductId() {
        return productId;
    }

    public void setProductId(Product productId) {
        this.productId = productId;
    }
}
