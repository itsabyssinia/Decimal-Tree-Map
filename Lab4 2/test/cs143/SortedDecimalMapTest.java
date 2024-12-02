/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs143;

import java.util.Iterator;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 */
public class SortedDecimalMapTest {
    
    SortedDecimalMap tree;
            
    @Before
    public void setUp() {
        tree = new SortedDecimalMap(Product.ID_LENGTH);
    }

    /**
     * Test of contains method, of class SortedDecimalMap.
     */
    @Test
    public void testContains() {
        assertFalse(tree.contains(10000001));
        assertTrue(tree.insert(new Product(11112222, "Hat", 1, 2)));
        assertTrue(tree.contains(11112222));
        assertFalse(tree.insert(new Product(11112222, "Hat", 1, 2)));
    }

    /**
     * Test of get method, of class SortedDecimalMap.
     */
    @Test
    public void testGet() {
        assertTrue(tree.get(10001111) == null);
        assertTrue(tree.insert(new Product(11112222, "Hat", 1, 2)));
        assertTrue(tree.get(11112222).
                equals(new Product(11112222, "Hat", 1, 2)));
        assertFalse(tree.insert(new Product(11112222, "Hat", 1, 2)));
    }

    /**
     * Test of insert method, of class SortedDecimalMap.
     */
    @Test
    public void testInsert() {
        assertTrue(tree.insert(new Product(11112222, "Hat", 1, 2)));
        assertFalse(tree.insert(new Product(11112222, "Hat", 1, 2)));
    }

    /**
     * Test of remove method, of class SortedDecimalMap.
     */
    @Test
    public void testRemove() {
        assertFalse(tree.remove(11112222));
        assertTrue(tree.insert(new Product(11112222, "Hat", 1, 2)));
        assertFalse(tree.insert(new Product(11112222, "Hat", 1, 2)));
        assertTrue(tree.contains(11112222));
        assertTrue(tree.remove(11112222));
        assertFalse(tree.contains(11112222));
    }

    /**
     * Test of isEmpty method, of class SortedDecimalMap.
     */
    @Test
    public void testIsEmpty() {
        assertTrue(tree.isEmpty());
        for (int i = 1; i <= 10; i++) {
            assertTrue(tree.insert(
                    new Product(11112221 + i, "Hat" + i, i, 1 + i))); 
        }
        assertFalse(tree.isEmpty());
        assertTrue(tree.remove(11112222));
        assertFalse(tree.isEmpty());
    }

    /**
     * Test of iterator method, of class SortedDecimalMap.
     */
    @Test
    public void testIterator() {
        for (int i = 1; i <= 10; i++) {
            assertTrue(tree.insert(
                    new Product(11112221 + i, "Hat" + i, i, 1 + i))); 
        }
        Iterator<Product> itr = tree.iterator();
        while (itr.hasNext()) {
            if (itr.next().equals(new Product(11112223, "Hat2", 2, 3))) {
                itr.remove();
            }
        }
    }
    
}
