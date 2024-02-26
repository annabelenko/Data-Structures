//Set container class with dynamic, fixed capacity

class Set {
    Set(int capacity) {arr = new int[capacity];}
    Set() {this(DEFAULT_CAPACITY);}

    void add(int value) {

        if (contains(value) == false ){
            arr[size++] = value;
        }
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
    boolean contains (int value){
        for (int i = 0; i < size; i++) {

            if (value == arr[i]){
                return true;
            }
        }
        return false;
    }

    int [] arr;
    int size = 0;
    static final int DEFAULT_CAPACITY = 10;

}