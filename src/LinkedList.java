import java.util.ArrayList;

public class LinkedList<E> {
       private int size;
       private Node head;
       private class Node<E>{
           E element;
           Node next;

           public Node (E element){
               this.element = element;
           }
       }

       public LinkedList(){
           size = 0;
           head = null;
       }

       public void addFirst(E element){

       }

       public void addLast(E element){
            add(size - 1,element);
       }


       public void add(int index,E element){
           if(index < 0 || index >size){
               throw new IllegalArgumentException("参数错误");
           }
           Node node = new Node(element);
           if (head == null){
               head = node;
           }else {
               Node temp = head;
               for (int i = 0; i < index - 1 ; i++) {
                   temp = temp.next;
               }
               node.next = temp.next;
               temp.next = node;
           }
           size++;
       }

       public void printf(){
           Node temp = head;
           while (temp != null){
               System.out.println(temp.element);
               temp = temp.next;
           }
       }


    public static void main(String[] args) {
         LinkedList<Integer> linkedList = new LinkedList<>();
         linkedList.addLast(1);
         linkedList.addLast(2);
         linkedList.addLast(3);
         linkedList.addLast(4);
         linkedList.addLast(5);
         linkedList.add(2,10);
         linkedList.printf();
    }


}
