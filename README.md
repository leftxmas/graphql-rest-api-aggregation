# Aggregate RESTful endpoints with GraphQL
 
This is a prototype based on a blog post published by Raymond Lee at https://raymondhlee.wordpress.com/author/raymondhlee/. 
 
## Tech stack
- Spring Boot
- GraphQL
- Java

## To run the application

Make sure you have jdk and maven installed before running this application. You can install both easily with [sdkman](https://sdkman.io/install).

To run the application, please rune the command below:
```
mvn clean spring-boot:run
```

After launching the app, go to [http://localhost:8080/graphiql](http://localhost:8080/graphiql). Run a sample query like below:
```$json
{
  findProduct(sku: "12345") {
    sku
    stock {
      location
      qtyAvailable
    }
    salesOrders {
      qty
      totalAmount
    }
  }
}

```