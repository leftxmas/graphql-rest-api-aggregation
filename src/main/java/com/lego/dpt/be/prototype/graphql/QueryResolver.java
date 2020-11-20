package com.lego.dpt.be.prototype.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.lego.dpt.be.prototype.pojo.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class QueryResolver implements GraphQLQueryResolver {

    private static final Logger logger = LoggerFactory.getLogger(ProductResolver.class);

    @Autowired
    private ProductService productService;

    public Product findProduct(String sku) {
        Product product = productService.getProduct(sku);
        logger.info("Found product {}", product.getSku());
        return product;
    }
}
