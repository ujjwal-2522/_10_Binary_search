public class Binary_search {
    public static void main(String[] args) {
        int[] arr={-12,-6,-2,2,3,4,5,15,18,28};
        int target=178;
        int ans=binarysearch(arr,target);
        System.out.println(ans);
    }
    // return the index
    //return -1 if target does not exist
    static int binarysearch(int[] arr, int target){
        int start =0;
        int end= arr.length-1;
        while(start<=end){
            //find the middle element
            //int mid=(start+end)/2; // might possible that(start+end) exceed the range of int in java
            int mid=start +(end-start)/2;
            if (target<arr[mid]){
                end =mid -1;
            }else if(target>arr[mid]){
                start=mid +1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
