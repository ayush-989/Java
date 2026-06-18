class QuickSort{
    public static void main(String[] args) {
        int []a={12,11,6,8,7,94,53};
        quickSort(a, 0, a.length-1);
        for(int i :a){
            System.out.print(i+" ");
        }
        }
    
    public static void quickSort(int[]a,int low,int high){
            if(low<high){
                int PivotIndex = getPiovtIndex(a, low, high);
                quickSort(a, low, PivotIndex -1);
                quickSort(a, PivotIndex +1, high);
            }
    }
    public static int getPiovtIndex(int[]a,int low,int high){
        int pivot =  a[high];
        int i = low-1;
        int j = low;
        while(j<high){
            if(a[j]<pivot){
                i++;
                swap(a,i,j);
            }
            j++;
        }
        swap(a,i+1,high);
        return i+1;


    }
    public static void swap(int []a,int i,int j){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
    }
}