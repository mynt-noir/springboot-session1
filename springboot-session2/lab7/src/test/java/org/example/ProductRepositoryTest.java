package org.example;

import org.junit.jupiter.api.*;


import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

import static org.junit.jupiter.api.Assertions.*;


class ProductRepositoryTest {

    ProductRepository productRepository = new ProductRepository();

    @BeforeEach
    void setUp() {
        ProductRepository productRepository = new ProductRepository();
        final List<Product> products = Collections.synchronizedList(new ArrayList<>());
        final AtomicLong nextId = new AtomicLong(1);
    }

    @Test
    void testFindAll() {
        List<Product> productList = productRepository.findAll();
        assertEquals(3, productList.size());

        Product expectedProduct1 = new Product(1L, "Laptop", 1200.00);
        assertEquals(expectedProduct1, productList.get(0));
        Product expectedProduct2 = new Product(2L, "Mouse", 25.50);
        assertEquals(expectedProduct2, productList.get(1));
        Product expectedProduct3 = new Product(3L, "Keyboard", 75.00);
        assertEquals(expectedProduct3, productList.get(2));
    }

    @Test
    void testFindById() {
        Optional<Product> product = productRepository.findById(1L);
        Product expectedProduct = new Product(1L, "Laptop", 1200.00);

        assertTrue(product.isPresent());
        assertEquals(expectedProduct, product.get());
    }

    void testFindByIdInvalid() {
        Optional<Product> product = productRepository.findById(3L);

        assertNull(product);
    }

    @Test
    void testSaveNoId() {
        productRepository.save(new Product("Monitor", 800.00));
        List<Product> productList = productRepository.findAll();
        assertEquals(4, productList.size());

        Optional<Product> product = productRepository.findById(4L);
        Product expectedProduct = new Product(4L, "Monitor", 800.00);

        assertTrue(product.isPresent());
        assertEquals(expectedProduct, product.get());
    }

    @Test
    void testSaveDuplicateId() {
        productRepository.save(new Product(3L, "Monitor", 800.00));
        List<Product> productList = productRepository.findAll();
        Product expectedProduct = new Product(3L, "Monitor", 800.00);
        assertEquals(expectedProduct, productList.get(2));
    }

    @Test
    void testSaveGivenId() {
        productRepository.save(new Product(4L, "Monitor", 800.00));
        List<Product> productList = productRepository.findAll();
        assertEquals(3, productList.size());

        Optional<Product> product = productRepository.findById(4L);
        assertFalse(product.isPresent());
    }
}