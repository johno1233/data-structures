//compile: javac bag.java
//run: java bag

public interface Bag<T>{
    /** Gets the current number of entries in the bag
     * @return The integer number of entries in the bag*/
    public int getCurrentSize();
    
    /** Check if the bag is empty
     * @return true if bag is empty, false if not*/
    public boolean isEmpty();

    /** Adds a new entry of type T to bag
     * @param anEntry, the object to be added as a new entry
     * @return true if addition was successful, false if not*/
    public boolean add(T newEntry);
    
    /** Removes one unspecified entry from the bag
     * @return the removed entry*/
    public T remove();

    /** Removes one occurance of a given entry
     * @return True if successful, false if not*/
    public boolean remove(T anEntry);
    
    // removes all entries
    public void clear();

    /** counts the number of times an entry appears in the bag
     * @param anEntry, the entry we want to get the frequency of
     * @return the integer number of times anEntry appears in the bag*/
    public int getFrequencyOf(T anEntry);

    /** Test whether the bag contains a given entry
     * @param anEntry, the entry we want to check exists in the bag
     * @return true if it exists, false if it doesn't*/
    public boolean contains(T anEntry);

    /** Retrieves all entries in the bag
     * @return an array of entries */
    public T[] toArray();    
}


class Bank implements Bag{
    private Bag<Coin> coins;
    
    public Bank(){
        coins = new Bag<>();
    }
   
    public boolean add(Coin aCoin){
        return coins.add(aCoin);
    }
    public Coin remove(){
	return coins.remove();
    }
    public boolean isEmpty(){
	return coins.isEmpty();
    }
}

class Coin{
    private string name;
    private int value;

    public Coin(string cName, int cValue){
        name = cName;
	value = cValue;
    }

    public int getValue(){
    	return value;
    }

    public string getName(){
        return name;
    }
}

public class BankExample{
    public static void main(String[] args){
	Bank myBank = new Bank();
	
	addCoin(new Coin("Penny", "1"), myBank);
	addCoin(new Coin("Nickle", "5"), myBank);
	addCoin(new Coin("Dime", "10"), myBank);
	addCoin(new Coin("Quarter", "25"), myBank);
	addCoin(new Coin("Penny", "1"), myBank);	

    }

    public static void addCoin(Coin aCoin, Bank aBank){
	if(aBank.add(aCoin)){
	    System.out.println("Added a " + aCoin.getName());
	} else{ 
	    System.out.println("Tried to add a " + aCoin.getName() +". Operation Failed");
	}
    }
}
