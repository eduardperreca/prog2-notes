import java.util.ArrayList;
import java.util.List;

public class IntSet {

    // Attributes
    /*
     * The {@link List} contains this set of elements.
     */
    public final List<Integer> els;

    // Costructors
    /*
     * Initialize the set to be empty.
     */
    public IntSet() {
        els = new ArrayList<>();
    }
    // Methods]

    /*
     * Looks for a given element in the set.
     * 
     * @param x the element you are looking for.
     * 
     * @return the index the given element, if x is not into the array it gives -1
     */
    public int getIndex(int x) {
        return els.indexOf(x);
    }

    /*
     * Add the given element to this set.
     * 
     * @param x element to be added.
     * 
     */
    public void insert(int x) {
        if (getIndex(x) < 0)
            els.add(x);
    }

    /*
     * Remove a given element x from the set.
     * 
     * @param x the element to be removed.
     */
    public void remove(int x) {
        int i = getIndex(x);
        if (i < 0)
            return;
        int last = els.size() - 1;
        els.set(i, last); // scambio i con l'ultimo.
        els.remove(last); // tolgo l'ultimo.
    }

    /*
     * Check if a given element is in the set
     * 
     * @param x the given element to check
     * 
     * @return true if the given element is in the set or false otherwise.
     */
    public boolean isIn(int x) {
        return getIndex(x) != -1;
    }

    /*
     * Return the cardinality of the set.
     * 
     * @return cardinality of the given set.
     */
    public int size(List<Integer> els2) {
        return els.size();
    }

    /*
     * Return an element of the set.
     * 
     * @throws EmptyException if the set is empty
     * 
     * @return arbitrary element of the set
     */
    public int choose() {
        return els.get(els.size() - 1);
    }

}