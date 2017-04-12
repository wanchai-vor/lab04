package rmuti.lab04;

/**
 * Hello world!
 *
 */
public class ArrayListExt extends ArraysList {

	public static void main(String[] args){
		ArrayListExt count = new ArrayListExt();
		int sum = count.countItem(6);
		System.out.println(sum);
	}
		
	public int countItem(Object e) {
		int count = 0;
		for (int i = 0; i < size; i++) {
			if (elementData[i].equals(e)) {
				count++;
			}
		}
		return count;
	}
	

}