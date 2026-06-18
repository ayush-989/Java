class Quick1{
    public static void swap(int []a,int i,int j){
       int temp =a[i];
       a[i]=a[j];
       a[j]=temp;
    }
    public static void quicksort(int[]a,int low,int high){
        if(low<high){
            int PivotIndex  = getPiovtIndex(a,low,high);
            quicksort(a,low,PivotIndex-1);
            quicksort(a,PivotIndex+1,high);

        }

    }
    public static int getPiovtIndex(int[]a, int low,int high) {
         int pivot = a[high];
        int j =low;
        int i = low-1;
        while(j< high){
            if(a[j]<pivot){
                i++;
                swap(a,i,j);
            }
        j++;
          }
        swap(a,i+1,pivot);
        return i+1;
    }
    public static void main(String[] args) {
        int []a={12,56,23,34,21,12,5,8};
        int low =0;
        int high =a.length-1;
        quicksort(a, low, high);
        for(int i:a){
            System.err.print(i+ " ");
        }
        
    }
}