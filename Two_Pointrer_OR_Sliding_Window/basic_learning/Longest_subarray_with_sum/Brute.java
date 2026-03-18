class Brute{
    public static void main(String[] args) {
        int arr[] ={ 2,5,4,6,8,7,5,10};
        int k=14;
        int start=0;
        int end=0;
        int maxlength=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum=sum+arr[j];
               if(sum<=k){
                   /*  maxlength=Math.max(maxlength, j-1+1);
                }
            }
        } 
        System.out.print(maxlength);
        */
        if(j-i+1 >maxlength){
            maxlength =j-i+1;
            start =i;
            end=j;
        }
    }
}
}           System.out.println(maxlength);
         System.out.print("Subarray: ");
        for(int i = start; i <= end; i++){
            System.out.print(arr[i] + " ");
        }
    }
}