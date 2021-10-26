package by.itstep.internetMarket.dao.entity;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ItemId implements Serializable {

    private Long orderId;
    
    private Long productId;

    public ItemId() {
    }

    public ItemId(Long orderId, Long productId) {
        this.orderId = orderId;
        this.productId = productId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemId itemId = (ItemId) o;
        return orderId.equals(itemId.orderId) &&
                productId.equals(itemId.productId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, productId);
    }

    @Override
    public String toString() {
        return "ItemId{" +
                "orderId=" + orderId +
                ", productId=" + productId +
                '}';
    }
}
