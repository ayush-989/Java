class Merge{
    public static void main(String[] args){
        int []a={34,45,78,96};
        int  []b={3,8,19,23,45};
        int []c = new int[a.length + b.length];

        int index1=0;
        int index2=0;
        int index3=0;

        while(index1<a.length && index2<b.length){
            if(a[index1]<b[index2]){
                c[index3++]=a[index1++];
            }
            else{
                c[index3++]=b[index2++];
            }
        }
        while(index1<a.length){
            c[index3++]=a[index1++];
        }
        while(index2<b.length){
            c[index3++]=b[index2++];
        }

        for(int i : c){
            System.out.print(i+" ");
        }
        
    
    }
}