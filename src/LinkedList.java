package src;

class Node {
    private double data;
    private Node next;
    private Node previous;


    public Node(double data) {
        this.data = data;
    }

    public double getData() {
        return data;
    }

    public void setData(double data) {
        this.data = data;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }



    @Override
    public String toString() {
        return
                "data =  || " + data
                ;
    }
}
public class LinkedList {

    private Node first;
    private Node tail;


    public LinkedList() {
        first = null;
        tail = null;

    }

    public boolean isEmpty(){
        return (first == null);
    }

    public void addFirst(double data){
        Node node = new Node(data);
        if (isEmpty()) {
            first = node;
            tail = node;
        }
        else {
            first.setPrevious(node);
            node.setNext(first);
            first = node;
        }
    }

    public void addLast(double data){
        Node node = new Node(data);
        if (isEmpty()){
            first= node;
            tail = node;
        }
        else {
            node.setPrevious(tail);
            tail.setNext(node);
            tail = node;

        }
    }
    public void Fshow(){
        Node tmnode = first;
        while (tmnode != null){
            System.out.println(tmnode);
            tmnode = tmnode.getNext();
        }
    }


    public void  Bshow(){
        Node tmp = tail;
        while (tmp != null){
            System.out.println(tmp);
            tmp = tmp.getPrevious();
        }
    }
    @Override
    public String toString() {
        return "Elm: " + first  ;
    }
}

class Main{

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addFirst(90);
        linkedList.addFirst(0.12);
        linkedList.addFirst(1);
        linkedList.addFirst(17.17);
        linkedList.addFirst(0);
        linkedList.addLast(100);
        linkedList.addLast(0.008);
        linkedList.addFirst(0.99999);

        linkedList.Fshow();
        linkedList.Bshow();
    }
}
