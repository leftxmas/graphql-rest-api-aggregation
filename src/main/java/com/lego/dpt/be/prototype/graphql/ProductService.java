package com.lego.dpt.be.prototype.graphql;

import com.lego.dpt.be.prototype.pojo.Inventory;
import com.lego.dpt.be.prototype.pojo.Product;
import com.lego.dpt.be.prototype.pojo.PurchaseOrder;
import com.lego.dpt.be.prototype.pojo.SalesOrder;

public interface ProductService {

    Product getProduct(String sku);

    Inventory[] getInventories(Product product);

    PurchaseOrder[] getPurchaseOrders(Product product);

    SalesOrder[] getSalesOrders(Product product);
}
