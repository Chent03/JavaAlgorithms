
public class Queue {
	private String[] array;
	private int size;
	private int front, items, back = 0;
	
	Queue(int size){
		this.size = size;
		array = new String[size];
		
	}
	public static void main(String[]args){
		Queue array = new Queue(10);
		array.insert("10");
		array.insert("11");
		array.insert("20");
		array.peek();
		array.remove();
		array.peek();
	}
	public void insert(String input){
		if(items + 1<= size){
			array[back] = input;
			back++;
			items++;
			System.out.println("Inserted " + input);
		}else{
			System.out.println("Queue is full");
		}
	}
	public void remove(){
		if(items > 0){
			System.out.println("Removed: " + array[front]);
			array[front] = "-1";
			front++;
			items--;
		}else{
			System.out.println("Queue is empty");
		}
	}
	public void peek(){
		System.out.println("Next up: " + array[front]);
	}
	
}
