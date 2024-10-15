package com.stream.inventory.stock.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Set;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "stock")
public class Stock extends Auditor implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", nullable = false)
    private Long id;
    //findInStock(productId, skuCode, quantity)
    //@OneToMany
    //private Map<Product, String> inStockProduct;// Map<Product , skuCode>
    private Long quantity;// also you can advise user that 4 quality is not available now, at best 3 are available you can buy 3 quality of selected item
    private LocalDate dateOfStocking;
    @OneToMany
    private List<WareHouse> warehouseId;// this field of warehouseId will be used during actual packing product for delivery of goods


}
