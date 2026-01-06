
class Node{
    int data;
    Node next;
    //Constructor
    Node(int a){
        data=a;
        next=null;
    }
    //method getData
    public void getData(){
        System.out.println(data);
    }
    public void getRef(){
        System.out.println(next);
    }
}
class Main {
    public static void main(String[] args) {
        System.out.println("Harish");
        Node a= new Node(21);
        Node b= new Node(45);
        System.out.println(a);
        System.out.println(b);
        a.getData();
        a.getRef();
        b.getData();
        b.getRef();
        a.next = b;
        a.getRef();
        
    }
}
