package LinkedList;

class LinkedListt{


    class Node {
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    void traverse (Node head){
        Node cur = head;
        while (cur!=null){
            System.out.println(cur);
            cur= cur.next;
        }
    }
    public void main() {
        Node n1= new Node("abc");
        Node n2= new Node("def");
        Node n3= new Node("ghi");

        Node head = n1;
        head.next=n2;
        n2.next=n3;
        n3.next=null;
    }
}

public class linkedList01 {
    public static void main(String[] args) {
        LinkedListt link = new LinkedListt();

    }

}
