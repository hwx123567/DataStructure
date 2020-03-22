import java.util.Arrays;

public class ArrayList {
       private int size; //初始为0，size指向数组中第一个没有元素的地址
       private Object [] elements;  //数组的长度就是容量

       public ArrayList(int capacity){
           elements = new Object [capacity];
           size = 0;
       }

       public ArrayList(){
           this(10);
       }

       public int getCapacity(){
           return elements.length;
       }

       public boolean isEmpty(){
           return size == 0;
       }

       public boolean contains(int element){
           for (int i = 0; i < size; i++) {
               elements[i] = element;
               return true;
           }
           return false;
       }

       public void remove(int index){
           if(index<0 || index > size -1){
               throw new IllegalArgumentException("参数错误");
           }
           for (int i = index ; i < size ; i++) {
               elements[i] = elements[i + 1];
           }
           size--;
       }

       public void removeLast(){
           remove(size -1);
       }

       public void removeFirst(){
           remove(0);
       }


       public void addList(Object element){
           if(size == elements.length){
               //throw new IllegalArgumentException("参错错误");
               Object [] newElement = new Object [getCapacity() + (getCapacity() >> 1)];
               for (int i = 0; i < size; i++) {
                   newElement[i] = elements[i];
               }
               elements = newElement;
           }
           elements[size] =  element;
           size ++;
       }

       public void add(int index,Object element){
           if(size == elements.length){
               //throw new IllegalArgumentException("参错错误");
               Object [] newElement = new Object [getCapacity() + (getCapacity() >> 1)];
               for (int i = 0; i < size; i++) {
                   newElement[i] = elements[i];
               }
               elements = newElement;
           }
           if(index == size){
               addList(element);
           }
           //元素向后移动，最后一个元素的索引为size - 1
           for (int i = size - 1; i >=index; i--) {
               elements[i + 1] = elements[i];
           }
           elements[index] = element;
           size++;
       }



    @Override
    public String toString() {
        return "ArrayList{" +
                "size=" + size + ",length="+elements.length +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.addList("a");
        list.addList("b");
        list.addList("c");



        System.out.println(list.toString());
    }
}
