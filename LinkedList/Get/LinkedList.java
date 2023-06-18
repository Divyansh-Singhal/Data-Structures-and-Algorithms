package LinkedList.Get;

public class LinkedList {
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

    public void append(int value){
        Node newnode=new Node(value);
        if(length==0){
            head=newnode;
            tail=newnode;
        }
        else{
            tail.next=newnode;
            tail=newnode;
        }
        length++;
    }

    public Node removefirst(){
        Node temp=head;
        head=head.next;
        temp=null;
        length--;
        return head;
    }

    public LinkedList(int value){
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
    public Node get(int index){
        if(index<0 || index>=length){
            return null;
        }
        else{
            Node temp=head;
            int counter=0;
            while(counter!=index){
                temp=temp.next;
                counter++;
            }
            return temp;
        }
    }
}

