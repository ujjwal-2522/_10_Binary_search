public class OrderAgnosticBS {
    public static void main(String[] args) {
        //int[] arr={-12,-6,-2,2,3,4,5,15,18,28};
        int[]arr={99,78,65,43,32,9,5,2,-2,-5,-9};
        int target=32;
        int ans=orderagnosticBS(arr,target);
        System.out.println(ans);
    }
    static int orderagnosticBS(int[] arr, int target){
        int start=0;
        int end= arr.length-1;

        // find whether the sorted array is ascending or descending
//        boolean isAsc;
//        if(arr[start]<arr[end]){
//            isAsc=true;
//        }else {
//            isAsc=false;
//        }
        //OR
        boolean isAsc=arr[start]<arr[end];

        while(start<=end){
            //find the middle element
            //int mid=(start+end)/2; // might possible that(start+end) exceed the range of int in java
            int mid=start +(end-start)/2;

            if(target==arr[mid]){
                return mid;
            }
            if(isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }else{
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

}
