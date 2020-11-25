# Aggregate RESTful endpoints with GraphQL
 
This is a prototype based on a blog post published by Raymond Lee at https://raymondhlee.wordpress.com/author/raymondhlee/. This prototype is free to use but I reserve the copyright as Raymond doesn't provide full source codes and it did take me quite a bit of time to get the application working. 
 
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