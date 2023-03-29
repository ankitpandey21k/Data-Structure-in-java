package stack;
public class stack_operation {
	static class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data=data;
			next=null;
		}
	}
	public  static class stack{
		public static Node head;
		public  boolean isEmpty(){
			return head==null;
		}
		public  void push(int data) {
			Node newNode=new Node(data);
				if(isEmpty()) {
					head=newNode;
					return;
				}
				newNode.next=head;
				head=newNode;
			}
		public  int pop() {
			if(isEmpty()) {
				return -1;
			}
			int top=head.data;
			head=head.next;
			return top;	
		}
		public  int peek() {
			if(isEmpty()) {
				return -1;
			}
			return head.data;
		    }
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stack stack = new stack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.pop();
		while(!stack.isEmpty()) {
			System.out.println(stack.peek());	
			stack.pop();
		}
	}
}
