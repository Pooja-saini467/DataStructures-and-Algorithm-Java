public class linear {
    public static void main(String[]args) {
        int [] nums={25,56,-7,67,3,56,-90};
        int target = 89;
        int ans = linearSearch(nums,target);
        System.out.println(ans);

    }
    static int linearSearch(int arr[], int target) {
        if(arr.length == 0) {
            return -1;
        }
        for(int i=0;i<arr.length;i++) {
            int element = arr[i];
            if(element == target) {
                return i;
            }
        }
        return -1;
    }
}
