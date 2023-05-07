package LinkedList;

public class lnkdlist {
    private Node head;
    private Node tail;
    private int length;

    class Node{
        int value;
        Node next;

        Node(int value){
            this.value=value;
        }
    }

    public lnkdlist(int value){
        Node newnode=new Node(value);
        head=newnode;
        tail=newnode;
        length=1;
    }
}
