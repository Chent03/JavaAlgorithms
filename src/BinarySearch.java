
public class BinarySearch {
	private int[] array = new int[20];
	private int size = 10;
	
	public static void main(String[]args){
		BinarySearch search = new BinarySearch();
		search.insertRandom();
		search.bubbleSort();
		search.print();
		search.binarySearch(10);
		
	}
	
	public void binarySearch(int value){
		int low = 0;
		int high = size - 1;
		boolean inarray = false;
		
		while(low <= high){
			int middle = (high + low)/2;
			if(array[middle] < value){
				low = middle +1;
			}else if(array[middle] > value){
				high = middle - 1;
			}else if(array[middle] == value){
				System.out.println("Found in index: " + middle);
				inarray = true;
				low = high +1;
			}
		}
		if(!inarray){
			System.out.println("Value not in array");
		}
	}
	
	public void insertRandom(){
		for(int i = 0; i < size; i++)
		{
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
	public void bubbleSort(){
		for(int i = size - 1; i > 1; i--){
			for(int j = 0; j < i; j++){
				if(array[j] > array[j+1]){
					swap(j, j+1);
				}
			}
		}
	}
	public void swap(int one, int two){
		int temp = array[one];
		array[one] = array[two];
		array[two] = temp;
	}

}
