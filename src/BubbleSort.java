
public class BubbleSort {

	private int[] array = new int[20];
	private int size = 10;
	
	
	public static void main(String[]args){
		BubbleSort sort = new BubbleSort();
		
		System.out.println("Before bubble sort: ");
		sort.insertRandom();
		sort.print();
		
		System.out.println("After bubble sort: ");
		sort.bubble();
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
	public void bubble(){
		for(int i = size - 1; i > 1; i--){
			for(int j = 0; j < i; j++)
				if(array[j] > array[j+1]){
					swap(j, j+1);
				}
		}
	}
	public void swap(int j, int jplus)
	{
		int temp = array[j];
		array[j] = array[jplus];
		array[jplus] = temp;
	}
	
}
