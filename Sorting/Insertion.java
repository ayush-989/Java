class Insertion{
    public static void main(String[] args) {
       int arr[] = {2,5,1,6,8,4}; 
       InsertionSort(arr);
    }
    public static void InsertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int pivot =arr[i];
            int j =  i-1;
            while(j>=0&&arr[j]>pivot){
                arr[j+1]=arr[j];
                j--;

            }
          arr[j+1]=pivot;
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
}
    }

