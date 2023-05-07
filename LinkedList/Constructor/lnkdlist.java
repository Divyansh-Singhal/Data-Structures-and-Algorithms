package LinkedList.Constructor;

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

    public void printall(){
        if(length==0){
            System.out.println("Empty List");
        }
        else{
            System.out.println(head.value);
            System.out.println(tail.value);
        }
        System.out.println(length);
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+" ");
            temp=temp.next;
        }
    }
}
