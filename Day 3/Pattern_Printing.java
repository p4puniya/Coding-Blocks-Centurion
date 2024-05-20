class Pattern_Printing{
    public static void main(String[] args) {
        int n = 5;

        // for(int i=0;i<10;i++){
        //   System.out.println("Read.");
        //   if(i<5)
        //   System.out.println(i);
        //   else 
        //     break;
        //   System.out.println("not Read.");
        // }
        /* * * * *
         * * * * *
         * * * * *
         * * * * * 
         * * * * *
         */

          // Anand Kumar

          // for(int i=1; i<=5; i++){
          //   System.out.print("*");
          // }
            //Anand Kumar
            for(int i=n; i>=1;i--){ 
              for(int j=i; j>=1;j--)
                System.out.print("* ");
              System.out.println();
            }
            for(int i=2;i<=n;i++){
              for(int j=1;j<=i;j++)
                System.out.print("* ");
              System.out.println();
            }

        /*
* 
* *
* * *
* * * *
* * * * * 
         */
        // for(int i=1; i<=n; i++){
        //     for (int j=1; j<=i; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        /*

* * * * * 
* * * *
* * *
* * 
*

 */
            // for(int i=n; i>=1;i--){
            //     for(int j=1; j<=i; j++){
            //         System.out.print("* ");
            //     }
            //     System.out.println();
            // }
/*

        * 
      * * 
    * * * 
  * * * * 
* * * * * 
 */

            // for(int i=1; i<=n; i++){
            //     for(int j=1; j<=n-i; j++){
            //         System.out.print("  ");
            //     }
            //     for(int j=1; j<=i; j++){
            //         System.out.print("* ");
            //     }
            //     System.out.println();
            // }

/*
 * * * * *
   * * * *
     * * *
       * *
         *
 */
            // for(int i=n;i>=1;i--){
            //     for(int j=1;j<=n-i;j++){
            //         System.out.print("  ");
            //     }
            //     for(int j=i;j>=1;j--){
            //         System.out.print(" *");
            //     }
            //     System.out.println();
            // }
/*
 * * * * * 
     * * * * 
         * * *
             * *
                 *
 */

            // for(int i=n;i>=0;i--){
            //     for(int j=1;j<=2*(n-i);j++)
            //         System.out.print("  ");
            //     for(int j=1;j<=i;j++)
            //         System.out.print("* ");
            //     System.out.println();
            // }
/*
        *       
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *
 */
            // for(int i=1;i<=n;i++){
            //     for(int j=n-i; j>=1;j--){
            //       System.out.print("  ");
            //     }
            //     for(int j=1;j<=i;j++){
            //       System.out.print(" *");
            //     }
            //     for(int j=1;j<=i-1;j++){
            //       System.out.print(" *");
            //     }
            //     System.out.println();
            // }           
    }
}
