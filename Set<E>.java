// A resizable, generic set container class
class Set <E>{
	
    Set(int capacity) {
    	//arr = new int[capacity];
    	arr = (E [])new Object[capacity];
    	}
    Set() {this(DEFAULT_CAPACITY);}

    void add(E value) {

        if (contains(value) == false ){
            checkCapacity();
            arr[size++] = value;
        }
    }
    private void checkCapacity() {
        if (size < getCapacity()) return;
        //int [] temp = new int[2*getCapacity()];
        E [] temp = (E [])new Object[2*getCapacity()];

        for (int i = 0; i < size; i++)
            temp[i] = arr[i];
        arr = temp;
    }
    int getCapacity() {return arr.length;}
    int size() {return size;}

    public String toString() {
        String result = "{";
        for (int i = 0; i < size; i++)
            result += arr[i] + (i < size-1 ? ", " : "");
        result += "}";
        return result;
    }
    boolean contains (E value){
        for (int i = 0; i < size; i++) {

            if (value == arr[i]){
                return true;
            }
        }
        return false;
    }

    E [] arr;
    int size = 0;
    static final int DEFAULT_CAPACITY = 10;

}