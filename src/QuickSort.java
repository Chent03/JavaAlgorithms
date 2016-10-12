
public class QuickSort {
	private static int[] array;
	private static int size;
	
	QuickSort(int size){
		this.size = size;
		array = new int[size];
		insertRandom();
	}
	
	
	public static void main(String[]args){
		QuickSort sort = new QuickSort(10);
		
		sort.print();
		
		System.out.println("After sort: ");
		sort.quickSort(0, 9);
		sort.print();
	}
	public void quickSort(int left, int right){
		if(right - left <= 0)
			return;
		else{
			int pivot = array[right];
			
			System.out.println("left: " + left + " right: " + right + " pivot: " + pivot);
			
			int pivotlocation = partArray(left, right, pivot);
			
			print();
			
			quickSort(left, pivotlocation -1);
			
			System.out.println();
			print();
			
			quickSort(pivotlocation + 1, right);
			System.out.println();
			print();
		}
	}
	public int partArray(int left, int right, int pivot){
		int leftPointer = left - 1;
		int rightPointer = right;
		
		while(true){
			while(array[++leftPointer] < pivot)
				;
			System.out.println(array[leftPointer] + " in index " + leftPointer + " is bigger"
					+ " than the pivot value " + pivot);	
			while(rightPointer > 0 && array[--rightPointer] > pivot)
				;
			System.out.println(array[rightPointer] + " in index " + rightPointer + " is"
					+ " smaller than the pivot value " + pivot);
			
			if(leftPointer >= rightPointer){
				System.out.println("left is >= right so start again");
				break;
			}else{
				swap(leftPointer, rightPointer);
				System.out.println(array[leftPointer] + " was swapped for " + array[rightPointer]);
				print();
				}
			}
		System.out.println(leftPointer + " " + right);
		print();
		swap(leftPointer, right);
		return leftPointer;
	}
	public void swap(int one, int two){
		int temp = array[one];
		array[one] = array[two];
		array[two] = temp;
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

}
