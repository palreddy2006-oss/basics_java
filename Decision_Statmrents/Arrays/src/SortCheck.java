public class SortCheck {
    public static void main(String[] args){
        int[] arr = {10,20,30,40,50,50,60};
        int count = 1;
        for(int i = 2 ; i <= arr.length ; i++){
            if(arr[i] > arr[i-1]){
                count++;
                break;
            }
            System.out.println(arr[i]);
        }

        if(count == arr.length){
            System.out.println("array is sorted");
        }else{
            System.out.println("array is not sorted");
        }

    }
}
