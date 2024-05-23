package com.microservice.product;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.testcontainers.containers.MongoDBContainer;

@SpringBootTest
class ProductServiceApplicationTests {
	MongoDBContainer mongoDBContainer = new MongoDBContainer("mongo:latest");
	@Test
	void contextLoads() {
	}

}
