package com.lego.dpt.be.prototype.pojo;

public class PurchaseOrder {

    private String sku;

    private String orderDate;

    public String getShipDate() {
        return shipDate;
    }

    private String shipDate;

    private int qty;

    public PurchaseOrder(String sku, String orderDate, String shipDate, int qty) {
        this.sku = sku;
        this.orderDate = orderDate;
        this.shipDate = shipDate;
        this.qty = qty;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public int getQty() {
        return qty;
    }

    public String getSku() {
        return sku;
    }
}
