class MergeSort1{
   public static void main(String[] args) {
       int[]a ={12,8,10,17,6,15};
       divide(a,0,a.length-1);
       for(int n :a)
         System.out.print(n+" ");   
   }  
   public static void divide(int []a , int low , int high){
    if(low<high ){
    int mid = low + (high-low)/2;
    divide(a, low, mid);
    divide(a , mid+1 , high);
    merge( a , low , mid , high);
   }
   }
   public static void merge(int[]a,int low ,int mid, int high ) {
    int[] merged = new int[high-low+1];
    int index1 = low,index2=mid+1 , index3=0;
    while(index1<=mid && index2 <=high){
        if(a[index1]<a[index2])
          merged[index3++]=a[index1++];
        else
          merged[index3++]=a[index2++];

    }
    while(index1 <= mid){
        merged[index3++]=a[index1++];
    }

    while(index2 <= high){
        merged[index3++]=a[index2++];
    }
    for(int i = low , j= 0 ; j<merged.length ; i++ , j++)
    a[i]=merged[j];
}
}
