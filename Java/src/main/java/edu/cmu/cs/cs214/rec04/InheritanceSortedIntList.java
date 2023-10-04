package edu.cmu.cs.cs214.rec04;

/**
 * InheritanceSortedIntList is a variant of SortedIntList that keeps track 
 * of the total number of attempted element insertions. 
 * It provides an accessor method, getTotalAdded, to retrieve this count.
 * <p>
 * Note: The totalAdded count is not to be confused with the current size,
 * as the size can be reduced when an element is removed.
 *
 * @author Nora Shoemaker
 */
public class InheritanceSortedIntList extends SortedIntList {
    
    /**
     * The count of the total numbers added to the list.
     */
    private int totalAdded = 0;

    /**
     * Inserts the specified element to the list in a sorted order. 
     * The list maintains its order after the insertion. 
     * Increments the totalAdded count every time this method is called.
     * 
     * @param value element to be inserted to this list.
     * @return true if this list changed as a result of the call.
     */
    @Override
    public boolean add(int value) {
        totalAdded++;
        return super.add(value);
    }

    /**
     * Inserts all of the elements in the specified collection to the list in a sorted order.
     * The list maintains its order after the insertion. 
     * Increments the totalAdded count by the size of the collection every time this method is called.
     * 
     * @param c collection containing elements to be added to this list.
     * @return true if this list changed as a result of the call.
     */
    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        totalAdded += c.size();
        return super.addAll(c);
    }

    /**
     * Returns the total number of elements that have been attempted to be added since the list was created.
     *
     * @return the total number of elements added.
     */
    public int getTotalAdded() {
        return totalAdded;
    }
}
