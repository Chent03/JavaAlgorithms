
public class Partition {
	private static int[] array;
	private static int size;
	
	Partition(int size){
		this.size = size;
		array = new int[size];
		insertRandom();
	}
	
	public static void main(String[]args){
		
		Partition sort = new Partition(10);
		System.out.println("Before the sort: ");
		sort.print();
		
		System.out.println("\nAfter the sort: ");
		sort.partArray(30);
		sort.print();
	}
	
	public void partArray(int pivot){
		int leftPointer = -1;
		int rightPointer = size;
		
		while(true){
			while(leftPointer < (size -1) && array[++leftPointer] < pivot)
				;
			System.out.println(array[leftPointer] + " in index " + leftPointer + " is bigger"
					+ " than the pivot value " + pivot);
			while(rightPointer > 0 && array[--rightPointer] > pivot)
				;
			System.out.println(array[rightPointer] + " in index " + rightPointer + " is"
					+ " smaller than the pivot value " + pivot);
			
			if(leftPointer >= rightPointer)
				break;
			else{
				swap(leftPointer, rightPointer);
				System.out.println(array[leftPointer] + " was swapped for " + array[rightPointer]);
			}
		}
	}
	public void insertRandom(){
		for(int i = 0; i < size; i++){
			array[i] = (int)(Math.random()*50)+10;
		}
	}
	public void swap(int one, int two){
		int temp = array[one];
		array[one] = array[two];
		array[two] = temp;
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
