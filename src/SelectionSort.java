
public class SelectionSort {
	private int[] array = new int[20];
	private int size = 10;
	
	public static void main(String[]args){
		SelectionSort sort = new SelectionSort();
		sort.insertRandom();
		System.out.println("Before Selection sort: ");
		sort.print();
		
		System.out.println("After Selection Sort: ");
		sort.selectionSort();
		sort.print();
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
	public void selectionSort(){
		for(int i = 0; i < size; i++){
			int min = i;
			
			for(int j = i; j < size; j++){
				if(array[min] > array[j]){
					min = j;
				}
				swap(i, min);
			}
		}
	}
	public void swap(int one, int two){
		int temp = array[one];
		array[one] = array[two];
		array[two] = temp;
	}
}
