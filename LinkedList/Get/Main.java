package LinkedList.Get;

public class Main {
    public static void main(String[] args){
        LinkedList list=new LinkedList(10);
        list.append(5);
        list.append(6);
        list.printall();
        System.out.println();
        System.out.println("--------------------");
        System.out.println();
        System.out.println(list.removefirst().value);
        System.out.println();
        System.out.println("--------------------");
        System.out.println();
        list.printall();
        System.out.println();
        System.out.println(list.get(1).value+" number");
}
}

