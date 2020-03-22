/**
 * 选择排序
 * 1， 一共进行数组大小 - 1次循环
 * 2.  每一次排序又是一个循环
 *    2.1   先假定当前这个数是最小数
 *    2.2   然后和后面的每个数进行比较，如果发现比当前更小的数，就重新确定最小数，并得到下标
 *    2.3   当遍历后数组最后时，得到本轮最小数和下标
 *    2.4   交换
 */

public class SelectSort {
    public static void selectSort(int arr[]) {
        for (int i = 0; i < arr.length - 1 ; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[minIndex] < arr[j]){  //本轮循环的最小值索引
                    minIndex = j;
                }
            }
            // 将找到的最小值和i位置所在的值进行交换
            if(i != minIndex) {
                arr[i] = arr[i] ^ arr[minIndex];
                arr[minIndex] = arr[i] ^ arr[minIndex];
                arr[i] = arr[i] ^ arr[minIndex];
            }
        }

    }
    public static void main(String[] args) {
        int arr[] = {1,343,2,34,5,3,45,43};
         selectSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
