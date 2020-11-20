package com.lego.dpt.be.prototype.graphqlapiaggregation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.lego.dpt.be.prototype")
public class GraphqlApiAggregationApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphqlApiAggregationApplication.class, args);
	}

}
