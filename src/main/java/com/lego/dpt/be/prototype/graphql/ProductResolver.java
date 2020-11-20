package com.lego.dpt.be.prototype.graphql;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.lego.dpt.be.prototype.pojo.Inventory;
import com.lego.dpt.be.prototype.pojo.Product;
import com.lego.dpt.be.prototype.pojo.PurchaseOrder;
import com.lego.dpt.be.prototype.pojo.SalesOrder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class ProductResolver implements GraphQLResolver<Product> {

    private static final Logger logger = LoggerFactory.getLogger(ProductResolver.class);

    @Autowired
    private ProductService productService;

    public Inventory[] stock(Product product) {
        logger.info("Get inventory data for product: {}", product.getSku());
        return productService.getInventories(product);
    }

    public PurchaseOrder[] purchaseOrders(Product product) {
        logger.info("Get POs for product: {}", product.getSku());
        return productService.getPurchaseOrders(product);
    }

    public SalesOrder[] salesOrders(Product product) {
        logger.info("Get SOs for product: {}", product.getSku());
        SalesOrder[] salesOrders = productService.getSalesOrders(product);
        salesOrders[0].setDiscount(new Random().nextInt());
        return salesOrders;
    }

}
