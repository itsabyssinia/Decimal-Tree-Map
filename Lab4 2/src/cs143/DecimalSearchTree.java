package cs143;

/**
 * 
 * @author Linda Zuvich
 */
public interface DecimalSearchTree<E> extends Iterable<E> {
    
    /**
     * Check if the tree contains the value by its key number.
     *
     * @param key the key number attached with the value inside of the tree
     * @return true if a value with given key exists, false if it is not
     */
    public boolean contains(int key);
    
    /**
     * Get the value with the given key number.
     *
     * @param key the key number attached with the value inside of the tree
     * @return the value of its given key, null if the value does not exist
     */
    public E get(int key);

    /**
     * Insert the value which has a unique non-negative whole-number key to the
     * tree.
     *
     * @param e the value to be inserted
     * @return true if the value has been inserted, false if is not
     */
    public boolean insert(E e);

    /**
     * Remove the value with the given key from the tree.
     *
     * @param key the key number attached with the value inside of the tree
     * @return true if the value is found and removed, false if it is not
     */
    public boolean remove(int key);

    /**
     * Reports if the tree is empty or not.
     *
     * @return true if the tree is empty, false if not
     */
    public boolean isEmpty();
    
}
