/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs143;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 */
public class ProductTest {
    

    /**
     * Test of getProductId method, of class Product.
     */
    @Test
    public void testGetProductId() {
        Product item1 = new Product(11112222);
        Product item2 = new Product(11112223, "Hat", 1, 2);
        assertTrue(item1.getProductId() == 11112222);
        assertFalse(item1.getProductId() == item2.getProductId());
    }

    /**
     * Test of setProductId method, of class Product.
     */
    @Test
    public void testSetProductId() {
        Product item1 = new Product(11112222);
        item1.setProductId(11223344);
        assertFalse(item1.getProductId() == 11112222);
        assertTrue(item1.getProductId() == 11223344);
    }

    /**
     * Test of getProductName method, of class Product.
     */
    @Test
    public void testGetProductName() {
        Product item2 = new Product(11112223, "Hat", 1, 2);
        assertTrue(item2.getProductName().equals("Hat"));
    }

    /**
     * Test of setProductName method, of class Product.
     */
    @Test
    public void testSetProductName() {
        Product item1 = new Product(11112223, "Hat", 1, 2);
        item1.setProductName("Bat");
        assertTrue(item1.getProductName().equals("Bat"));
    }

    /**
     * Test of getIsle method, of class Product.
     */
    @Test
    public void testGetIsle() {
        Product item1 = new Product(11112223, "Hat", 1, 2);
        assertTrue(item1.getIsle() == 1);
    }

    /**
     * Test of setIsle method, of class Product.
     */
    @Test
    public void testSetIsle() {
        Product item1 = new Product(11112223, "Hat", 1, 2);
        item1.setIsle(2);
        assertTrue(item1.getIsle() == 2);
    }

    /**
     * Test of getShelf method, of class Product.
     */
    @Test
    public void testGetShelf() {
        Product item1 = new Product(11112223, "Hat", 1, 2);
        assertTrue(item1.getShelf() == 2);
    }

    /**
     * Test of setShelf method, of class Product.
     */
    @Test
    public void testSetShelf() {
        Product item1 = new Product(11112223, "Hat", 1, 2);
        item1.setShelf(4);
        assertTrue(item1.getShelf() == 4);
    }

    /**
     * Test of getKey method, of class Product.
     */
    @Test
    public void testGetKey() {
        Product item1 = new Product(11112223, "Hat", 1, 2);
        assertTrue(item1.getKey() == 11112223);
    }

    /**
     * Test of toString method, of class Product.
     */
    @Test
    public void testToString() {
        Product item1 = new Product(11112223, "Hat", 1, 2);
        assertTrue(item1.toString().equals("11112223"));
    }

    /**
     * Test of hashCode method, of class Product.
     */
    @Test
    public void testHashCode() {
        Product item1 = new Product(11112223, "Hat", 1, 2);
        assertTrue(item1.hashCode() == 11112618);
    }

    /**
     * Test of equals method, of class Product.
     */
    @Test
    public void testEquals() {
        Product item1 = new Product(11112223, "Hat", 1, 2);
        assertTrue(item1.equals(item1));
        assertFalse(item1.equals(null));
        assertFalse(item1.equals("Hello"));
        Product item2 = new Product(11112224, "Hat", 1, 2);
        assertFalse(item1.equals(item2));
        Product item3 = new Product(11112223, "Hat", 1, 2);
        assertTrue(item1.equals(item3));
    }
    
}
