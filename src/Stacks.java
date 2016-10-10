
public class Stacks {
	private String[] stack;
	private int size;
	private int top = -1;
	
	public static void main(String[]args){
		Stacks stack = new Stacks(10);
		stack.push("10");
		stack.push("11");
		stack.pop();
		stack.pop();
	}
	
	Stacks(int size){
		this.size = size;
		stack = new String[size];
	}
	
	public void push(String input){
		if(top + 1 < size){
			top++;
			stack[top] = input;
		}else{
			System.out.println("Full Stack");
		}
		System.out.println("Pushed : " + input);
	}
	
	public String pop(){
		if(top >= 0){
			System.out.println("Popped : "+ stack[top]);
			stack[top] = "-1";
			return stack[top--];
		}else{
			System.out.println("Stack is Empty");
			return "-1";
		}
	}
}
