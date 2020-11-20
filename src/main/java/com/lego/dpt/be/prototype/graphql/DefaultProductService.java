package com.lego.dpt.be.prototype.graphql;

import com.lego.dpt.be.prototype.pojo.Inventory;
import com.lego.dpt.be.prototype.pojo.Product;
import com.lego.dpt.be.prototype.pojo.PurchaseOrder;
import com.lego.dpt.be.prototype.pojo.SalesOrder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class DefaultProductService implements ProductService {

    private static final Logger LOGGER = LoggerFactory.getLogger(DefaultProductService.class);

    private static final String INVENTORY_SERVICE_URL = "http://localhost:8080/inventory/{sku}";

    private static final String PURCHASE_ORDER_SERVICE_URL = "http://localhost:8080/purchaseorder/{sku}";

    private static final String SALES_ORDER_SERVICE_URL = "http://localhost:8080/salesorder/{sku}";

    @Override
    public Product getProduct(String sku) {

        LOGGER.info("Get product for {}", sku);

        Product product = new Product();
        product.setSku(sku);
        return product;
    }

    @Override
    public Inventory[] getInventories(Product product) {

        LOGGER.info("Get inventories for {}", product.getSku());

        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(INVENTORY_SERVICE_URL, Inventory[].class, skuParam(product));
    }

    @Override
    public PurchaseOrder[] getPurchaseOrders(Product product) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(PURCHASE_ORDER_SERVICE_URL, PurchaseOrder[].class, skuParam(product));
    }

    @Override
    public SalesOrder[] getSalesOrders(Product product) {

        LOGGER.info("Get sales order for {}", product.getSku());

        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(SALES_ORDER_SERVICE_URL, SalesOrder[].class, skuParam(product));
    }

    private Map<String, String> skuParam(Product product) {
        Map<String, String> params = new HashMap<>();
        params.put("sku", product.getSku());

        return params;
    }
}
