import com.sun.prism.impl.shape.BasicRoundRectRep;

public class BinarySearch {
    public static int  binarySearch(int arr[],int left,int right,int findVal) {
        if(left > right){
            return -1;
        }
        int midIndex = (left + right) / 2;
        if (findVal < arr[midIndex]){
            return binarySearch(arr,left,midIndex - 1,findVal);
        }else if(findVal > arr[midIndex]){
            return binarySearch(arr,midIndex + 1,right,findVal);
        }else {
            return midIndex;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,3,5,6,8};
        System.out.println(binarySearch(arr,0,arr.length -1  ,5));
    }
}
