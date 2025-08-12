//compile: javac bag.java
//run: java bag

public interface Bag<T>{
    // Gets teh current number of entries in the bag
    public int getCurrentSize();
    
    // Returns True if bag is empty
    public bolean isEmpty();

    // Adds a new entry of type T to bag
    public boolean add(T newEntry);
    
    // Removes one unspecified entry from the bag
    public T remove();

    // Removes one occurance of a given entry, returns True if successful, false if not
    public boolean remove(T anEntry);
    
    // removes all entries
    public void clear();

    // counts the number of times an entry appears in the bag
    public int getFrequencyOf(T anEntry);

    // Test whether the bag contains a given entry
    public boolean contains(T anEntry);

    // Retrieves all entries in the bag
    public T[] toArray();    
}


