/**
 * 插入排序
 *
 * 将n个待排序的元素看成为一个有序表和一个无序表
 *
 *
 */
public class InsertSort {


    public static void insertSort(int [] arr){
        for (int i = 1; i < arr.length ; i++) {
             //记录待插入的数
            int insertVal = arr[i];

            //记录待插入的数索引，待插入的数应该和它前面的数作比较
            int insertIndex = i - 1;

            //给insetVal 找到插入的位置
            //insertIndex >= 0 保证在insertVal找插入位置时，不越界
            //insertVal < arr[insertIndex] 带插入的数，还没有找到插入位置
            while (insertIndex >= 0 && insertVal < arr[insertIndex]){
                //将arr[insertIndex] 向后移动
                arr[insertIndex + 1] = arr[insertIndex];
                insertIndex --;
            }
            //当退出while循环时，说明插入的位置找到，insertIndex + 1
            arr[insertIndex + 1] = insertVal;
        }
    }
    public static void main(String[] args) {
        int [] arr = {1,5,2,6,3,23,3};
        insertSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
