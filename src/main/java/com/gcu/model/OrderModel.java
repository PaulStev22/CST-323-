package com.gcu.model;

public class OrderModel {
    @Override
	public String toString() {
		return "OrderModel [id=" + id + ", orderNo=" + orderNo
				+ ", productName=" + productName + ", price=" + price
				+ ", quantity=" + quantity + "]";
	}

	private long id = 0L;
    private String orderNo = "";
    private String productName = "";
    private float price = 0;
    private int quantity = 0;

    public OrderModel(Long id, String orderNo, String productName, float price, int quantity) {
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
