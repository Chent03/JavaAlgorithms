
public class Link {
	public String Breed;
	public int adopted;
	
	public Link next;
	
	public Link(String Breed, int adopted){
		this.Breed = Breed;
		this.adopted = adopted;
	}
	public void display(){
		System.out.println(Breed + ": " + adopted + " adopted");
	}
	public String toString(){
		return Breed;
	}
	public static void main(String[]args){
		LinkList list = new LinkList();
		list.insert("Yorki", 3);
		list.insert("Poodle", 5);
		list.insert("Husky", 1);
		list.insert("Frenchie", 10);
		list.print();
		System.out.println("\nRemove Frenchie\n");
		list.removefirst();
		list.print();
		
		System.out.println(list.find("Yorki").Breed + " was found\n");
		System.out.println("Remove Poodle");
		list.removeLink("Poodle");
		list.print();
	}
	
}
class LinkList{
	public Link firstLink;
	
	LinkList(){
		firstLink = null;
	}
	
	public boolean isEmpty(){
		return(firstLink == null);
	}
	public void insert(String Breed, int adopted){
		Link newLink = new Link(Breed, adopted);
		
		newLink.next = firstLink;
		
		firstLink = newLink;
	}
	public Link removefirst(){
		Link linkref = firstLink;
		if(!isEmpty()){
			firstLink = firstLink.next;
		}else {
			System.out.println("Empty ");
		}
		return linkref;
	}
	public void print(){
		Link link = firstLink;
		while(link != null){
			link.display();
			link = link.next;
		}
	}
	public Link find(String breed){
		Link link = firstLink;
		if(!isEmpty()){
			while(link.Breed != breed){
				if(link.next == null){
					return null;
				}else {
					link = link.next;
				}
			}
		}else {
			System.out.println("Empty");
		}
		return link;
	}
	
	public Link removeLink(String breed){
		Link current = firstLink;
		Link previous = firstLink;
		
		while(current.Breed != breed){
			if(current.next == null){
				return null;
			}else{
				previous = current;
				current = current.next;
			}
		}
		if(current == firstLink){
			firstLink = firstLink.next;
		}else {
			previous.next = current.next;
		}
		return current;
	}
	
}
