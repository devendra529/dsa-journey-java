public class Optimal_solution {
    public static void main(String[] args) {
    
        int arr[] = {2, 5, 4, 10, 10};
        int k = 14;

        int l = 0;
        int sum = 0;
        int maxlength = 0;
        int start=0;
        int end=0;

        for(int r = 0; r < arr.length; r++){

            sum += arr[r];

            // int his case if sum is greater then the k then the window is swrink from the left side means l swrink
         /*   while(sum > k){
                sum -= arr[l];
                l++;
            }  */
              
            // in palce of the while loop we use the if to make the optimal O(n)
            
            if(sum>k){
                sum-=arr[l];
                l++;
            }

            // int this we check if sum is less then or equal to k then finding the maxlength
            if(sum <= k){
               // maxlength = Math.max(maxlength, r - l + 1);
                   if(maxlength <r-l+1){
                    maxlength=r-l+1;
                    start =l;
                    end=r;
                   }
            }
        }
 
        System.out.println("Max length is: " + maxlength);
        for(int i=start;i<=end;i++){
            System.out.print(arr[i]+ " ");
        }

    }
}
    

