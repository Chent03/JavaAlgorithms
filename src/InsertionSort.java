
public class InsertionSort {
	private int[] array = new int[20];
	private int size = 10;
	
	public static void main(String[]args){
		InsertionSort sort = new InsertionSort();
		System.out.println("Before Insertion Sort: ");
		sort.insertRandom();
		sort.print();
		System.out.println("After Insertion Sort: ");
		sort.insertionSort();
		sort.print();
	}
	
	public void insertionSort(){
		for(int i = 1; i< size; i++){
			int j = i;
			int insert = array[i];
			while((j> 0) && (array[j-1] > insert)){
				array[j] = array[j-1];
				j--;
			}
			array[j] = insert;
		}
	}
	public void insertRandom(){
		for(int i = 0; i< size; i++){
			array[i] = (int)(Math.random()*10)+10;
		}
	}
	public void print(){
		System.out.println("----------");
		for(int i = 0; i< size; i++){
			System.out.print("| " + i + " | ");
			System.out.println(array[i] + " |");
			System.out.println("----------");
		}
	}
}
