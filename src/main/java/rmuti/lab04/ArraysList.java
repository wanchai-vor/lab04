package rmuti.lab04;

import java.util.Arrays;

public class ArraysList {

	protected Object[] elementData = new Object[4];
	protected int size = 4;

	// Constructor
	public ArraysList() {
		elementData[0] = 13;
		elementData[1] = 6;
		elementData[2] = 6;
		elementData[3] = 20;
	}

	// Find the even number
	public void removeEven() {
		for (int i = 0; i < size; i++) {//if we set j<size-1 ==> เมื่อทำการลบ 2 ไปแล้ว size = 3 แล้ว i=2 ; 2<(3-1)>>เท็จ จึงเหลือ1,2,4
			int data = Integer.parseInt(elementData[i].toString());
			if (data % 2 == 0) {
				remove(i);
			}
		}
	}

	// Method Remove Even
	public void remove(int i) {
		for (int j = i; j < size-1; j++) {
			elementData[j] = elementData[j + 1];
		}
		elementData[size - 1] = null;
		size--;
	}
	
	//Method add
	public void add(int index , int a){
		ensureCapacity(size+1);
		if(index == 0){
			for(int i = size-1; i >= index ; i--){
				elementData[i+1] = elementData[i];
			}
		}
		elementData[index] = a;
		size++;
	}

	// Method addFirst
	public void addFirst(int f) {
		add(0,f);
	}

	// Method addLast
	public void addLast(int l) {
		add(size,l);
	}
	
	//Method ensureCapacity
	public void ensureCapacity(int capacity){
		if(capacity > elementData.length){
			int s = 2*elementData.length;
			Object[] arr = new Object[s];
			for(int i = 0; i < size-1; i++ ){
				arr[i] = elementData[i];
			}
			elementData = arr;
		}
	}
	
	@Override
	public String toString() {
		return Arrays.toString(elementData);
	}


}
