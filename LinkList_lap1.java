public class LinkX {
	 public int iData;
	 
	 public LinkX next;
	 
	 
	 public LinkX(int id) {
		 this.iData=id;
		 next=null;
	 }
	 
	 public void display() {
		 System.out.println(iData);
	 }

}


package link;

public class LinkList {
	
	private LinkX first;
	
	
	public LinkList() {
		first=null;
	}
	
	public void insertFirst(int id) {
		LinkX link=new LinkX(id);
		
		link.next=first;
		first=link;
	}
	
	public LinkX deleteFirst() {
		LinkX del_link=first;
		first=first.next;
		return del_link;
	}
	
	public boolean isEmpty() {
		if(first==null) {
			return true;
		}
		
		return false;
	}
	
	public void displayList() {
		
		LinkX current=first;
		
		while(current !=null) {
			
			current.display();
			current=current.next;
		}
		
	}
	
	public LinkX delete(int id) {
		LinkX current=first;
		LinkX prev=first;
		
		while(current !=null) {
			
			if(current.iData==id) {
				if(first==current) {
					first=current.next;
					return current;
				}
				else {
				
				
					prev.next=current.next;
					return current;
				}
				
			}
			else {
				prev=current;
				current=current.next;
			}
			
			
		}
		
		return null;
	}

}

 class MainX {
	public static void main(String [] args) {
	
		
	LinkList link=new LinkList();
		link.insertFirst(10);
		link.insertFirst(20);
		link.insertFirst(30);
		link.insertFirst(40);
		System.out.println("Before Delete");
		link.displayList();
		System.out.println("After Delete");
		
		link.delete(10);
		link.delete(40);
		
		
		
		link.displayList();
		
		
		
		
	}

}
