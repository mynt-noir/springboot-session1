package org.example;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    private Product product;

    @Test
    void getPrice() {
        Product product = new Product("Coffee", 200);
        assertEquals(200, product.getPrice());
    }

    @Test
    void setPrice() {
        Product product = new Product("Coffee", 200);
        product.setPrice(500);
        assertEquals(500, product.getPrice());
    }

    @Test
    void getName() {
        Product product = new Product("Coffee", 200);
        assertEquals("Coffee", product.getName());
    }

    @Test
    void setName() {
        Product product = new Product("Coffee", 200);
        product.setName("Milk");
        assertEquals("Milk", product.getName());
    }

    @Test
    void getId() {
        Product product = new Product(12345L, "Coffee", 200);
        assertEquals(12345L, product.getId());
    }

    @Test
    void getNullId() {
        Product product = new Product("Coffee", 200);
        assertNull(product.getId());
    }

    @Test
    void setId() {
        Product product = new Product("Coffee", 200);
        product.setId(54321L);
        assertEquals(54321L, product.getId());
    }

    @Test
    void testToString() {
        Product product = new Product(1L, "Bread", 150);
        assertEquals("Product{id=1, name='Bread', price=150.0}", product.toString());
    }

    @Test
    void testToStringNullId() {
        Product product = new Product("Bread", 150);
        assertEquals("Product{id=null, name='Bread', price=150.0}", product.toString());
    }

    @Test
    void testEqualsTrue() {
        Product product1 = new Product(11L, "Bread", 150);
        Product product2 = new Product(11L, "Bread", 150);
        assertTrue(product1.equals(product2));
    }


    @Test
    void testEqualsFalse() {
        Product product1 = new Product(11L, "Bread", 150);
        Product product2 = new Product(12L, "Bread", 150);
        assertFalse(product1.equals(product2));
    }

    @Test
    void testEqualsTrueNullId() {
        Product product1 = new Product("Bread", 150);
        Product product2 = new Product("Bread", 150);
        assertTrue(product1.equals(product2));
    }


    @Test
    void testEqualsFalseNullId() {
        Product product1 = new Product("Bread", 150);
        Product product2 = new Product("Bread", 100);
        assertFalse(product1.equals(product2));

        Product product3 = new Product(1L, "Bread", 150);
        Product product4 = new Product("Bread", 100);
        assertFalse(product3.equals(product4));
    }

    @Test
    void testHashCode() {
        Product product = new Product(1L,"Coffee", 200);
        assertEquals(-605935180, product.hashCode());
    }
}