class Basic{
    public static void main(String[] args) {
        int []a={12,56,34,67,34,89};
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("");
        System.out.println("=================");
        for(int i:a){
            System.out.print(i+" ");
        }
        System.err.println("");
        System.out.println("==================");
        for(int i=a.length-1;i>=0;i--){
            System.out.print(a[i]+" ");
        }
    }
}