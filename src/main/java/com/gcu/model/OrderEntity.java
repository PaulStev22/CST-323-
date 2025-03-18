package com.gcu.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("ORDERS")
public class OrderEntity {
    @Override
	public String toString() {
		return "OrderModel [id=" + id + ", orderNo=" + orderNo
				+ ", productName=" + productName + ", price=" + price
				+ ", quantity=" + quantity + "]";
	}
    @Id
	@Column
	private Long id = 0L;
    @Column("ORDER_NUMBER")
    private String orderNo = "";
    @Column("PRODUCT_NAME")
    private String productName = "";
    @Column("PRICE")
    private float price = 0;
    @Column("QTY")
    private int quantity = 0;

    
    
    
    
    
    public OrderEntity() {
		
		// TODO Auto-generated constructor stub
	}

	public OrderEntity(Long id, String orderNo, String productName, float price, int quantity) {
        this.id = id;
        this.orderNo = orderNo;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getter and Setter methods

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
