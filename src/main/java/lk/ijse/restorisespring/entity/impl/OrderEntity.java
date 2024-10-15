/*
package lk.ijse.restorisespring.entity.impl;

import jakarta.persistence.*;
import lk.ijse.restorisespring.entity.SuperEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "customer_order")  // Changed from 'order' to 'customer_order'
public class OrderEntity implements SuperEntity {
    @Id
    @Column(name = "order_id", nullable = false)
    private String orderId;

    @Column(name = "order_qty", nullable = false)
    private int orderQTY;

    @Column(name = "order_total", nullable = false)
    private BigDecimal orderTotal;

    // Many Orders can be placed by one Customer
    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private CustomerEntity customer;  // Foreign Key to CustomerEntity

}
*/
