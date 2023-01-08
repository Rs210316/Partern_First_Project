public class projectu {
    public static void main (String[] a){
        int n=11;

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){

                if((i==0 || j==(n-1)/2 || i==n-1)){
                     System.out.print("*");
                }
                else{
                      System.out.print(" ");
                }
            }

          
System.out.print(" " + " ");

           
        

      
            for(int j=0; j<n; j++){

                if((i==j || j==0 || j==n-1)){
                    System.out.print("*");
                }
                else{
                       System.out.print(" ");
                }
            }

          
           
     System.out.print(" " + " ");     




            for(int j=0; j<n; j++){

                if((j==0 || i==0 || i==n-1) || (i==(n-1)/2)){
                    System.out.print("*");
                }
                else{
                       System.out.print(" ");
                }
            }

          
           
            System.out.print(" " + " ");     

             

             



     
            for(int j=0; j<n; j++){
                if((j==0 && i<n-1) || (i==n-1 && j>0 && j<n-1) || (j==n-1 && i<n-1 ) ) {

                    System.out.print("*");

                }
                else{
                    System.out.print(" ");
                }


            }

            
            System.out.print(" " + " "); 

        
            for (int j=0; j<n; j++){
                if((j==0 || i==0 &&j<(n*3)/4) ||
                    (i==(n-1)/2 && j<(n*3)/4) ||
                      (j==(n*3)/4 && i<(n-1)/2 && i>0)
                       || (i-j==n/4 && j>2)){
                    System.out.print("*");
                }

                else{
                    System.out.print(" ");
                }
            }

            System.out.print("");  
        

        
            for(int j=0;j<n;j++){
                if((i==0 && j>1 && j<n-2) || (j==0 && i>1 && i<n-2) || 
                  (i==n-1 && j>1 && j<n-2) || j==n-1 && i>1 && i<n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            

            System.out.print(" " + " "); 

        
            for(int j=0; j<n; j++){

                if((i==j || j==0 || j==n-1)){
                    System.out.print("*");
                }
                else{
                       System.out.print(" ");
                }
            }

            System.out.print("          ");   

            for(int j=0; j<n ; j++){
                if  ( (i>=0 && i+j <= (n/2)) || (j>=0 && j-i >= (n-1)/2  ) || (j==0 || i==0) || (i==n-1 || j==n-1) ){
                System.out.print("*");
 
             }
             
             else {
                 System.out.print(" ");
             }
             }
 
             
System.out.print("  ");


             for(int j=0; j<n ; j++){
                if  (i+j>=n-1+(n-1)/2 || i-j>=n/2){
                System.out.print("*");
 
             }
             
             else {
                 System.out.print(" ");
             }
             }
 
System.out.print("  ");


            for(int j=0; j<n ; j++){
               if  ((j+i<=n/2 || i==0) || (i-j>=n/2 || i==n-1)){
               System.out.print("*");

            }
            
            else {
                System.out.print(" ");
            }
            }

            System.out.println();


             
        }


    
            int k=4;
        for(int i=1; i<=k; i++){
            for (int j=1; j<=k ; j++){

                System.out.print(i);
                

            }

          System.out.println();
        }
        
        
    }

    


    
    
}

