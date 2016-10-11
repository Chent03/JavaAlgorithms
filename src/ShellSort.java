import java.util.Arrays;
public class ShellSort {
	
	private int[] array;
	private int size;
	ShellSort(int size){
		this.size = size;
		array = new int[size];
		insertRandom();
	}
	public static void main(String[]args){
		ShellSort sort = new ShellSort(10);
		System.out.println("Before Shell Sort:");
		sort.print();
		sort.sort();
		System.out.println("After Shell Sort: ");
		sort.print();
	}
	public void insertRandom(){
		for(int i = 0; i < size; i++){
			array[i] = (int)(Math.random()*50)+10;
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
	public void sort(){
		int low, high, temp;
		
		int interval = 1;
		while(interval <= size/3){
			interval = interval * 3 + 1;
		}
		while(interval > 0){
			for(high = interval; high < size; high++){
				temp = array[high];
				low = high;
					while(low > interval -1 && array[low - interval] >= temp){
						array[low] = array[low - interval];
						low -= interval;
					}
					array[low] = temp;
				}
			interval = (interval -1)/3;
			}
	}
	
}
