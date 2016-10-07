
public class BasicArray {
	
	private int[] array = new int[20];
	private int size = 10;
	
	public static void main(String[]args)
	{
		BasicArray basicArray = new BasicArray();
		basicArray.insertRandom();
		basicArray.print();
		basicArray.linearSearch(10);
		
	}
	
	public void insertRandom(){
		for(int i = 0; i < size; i++){
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
	public boolean inArray(int value){
		
		boolean inArray = false;
		for(int i = 0; i< size; i++)
		{
			if(array[i] == value)
				inArray = true;
		}
		return inArray;
	}
	
	public int getValue(int index)
	{
		if(index < size)
			return array[index];
		else
			return -1;
	}
	
	public void deleteIndex(int index){
		if(index < size){
			for(int i = index; i< (size - 1); i++){
				array[i] = array[i+1];
			}
			size--;
		}
	}
	public void insertValue(int value){
		if(size< 20)
		{
			array[size] = value;
			size++;
		}
	}
	
	public void linearSearch(int value){
		String indexs = "";
		System.out.print("Found in : ");
		boolean inArray = false;
		for(int i = 0; i < size; i++){
			if(array[i] == value){
				inArray = true;
				System.out.print(i + " ");
				indexs+= i + " ";
			}
		}
		if(!inArray)
			System.out.println("No values found");
		System.out.println();
	}

}
