package LinkedList.Remove;

public class Main {
    public static void main(String[] args){
        LinkedList list=new LinkedList(10);
        list.append(5);
        list.append(6);
        list.printall();
        System.out.println();
        System.out.println("--------------------");
        System.out.println(list.removelast().value);
        System.out.println();
        System.out.println("--------------------");
        System.out.println();
        list.printall();
}
}