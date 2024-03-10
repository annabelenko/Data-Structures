class Vector {
	Vector(int capacity) {arr = new int[capacity];}
	Vector() {this(DEFAULT_CAPACITY);}

	int get(int index) {return arr[index];}

	void set(int index, int value) {arr[index] = value;}

	void add(int value) { arr[size++] = value;}

	int getCapacity() {return arr.length;}
	int size() {return size;}

	public String toString() {
		String result = "{";
		for (int i = 0; i < size; i++)
			result += arr[i] + (i < size-1 ? ", " : "");
		result += "}";
		return result;
	}

	int [] arr;
	int size = 0;
	static final int DEFAULT_CAPACITY = 10;