package com.lego.dpt.be.prototype.pojo;

import java.util.List;

public class Product {

    private String sku;

    private List<Inventory> stock;

    public void setSku(String sku) {
        this.sku = sku;
    }

    public void setStock(List<Inventory> stock) {
        this.stock = stock;
    }

    public void setSalesOrders(List<SalesOrder> salesOrders) {
        this.salesOrders = salesOrders;
    }

    public void setPurchaseOrders(List<PurchaseOrder> purchaseOrders) {
        this.purchaseOrders = purchaseOrders;
    }

    private List<SalesOrder> salesOrders;

    private List<PurchaseOrder> purchaseOrders;

    public Product() {
    }

    public String getSku() {
        return sku;
    }

    public List<Inventory> getStock() {
        return stock;
    }

    public List<SalesOrder> getSalesOrders() {
        return salesOrders;
    }

    public List<PurchaseOrder> getPurchaseOrders() {
        return purchaseOrders;
    }
}
