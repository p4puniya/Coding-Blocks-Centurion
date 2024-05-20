
        int arr[]= {1,2,3,4,5,6};
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");

        System.out.println();
        swap(arr, 1, 2);
        // System.out.println(arr);
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");

    }
    static void swap(int []arr2, int a,int b){
        // System.out.println(arr2);
        int temp= arr2[a];
        arr2[a]=arr2[b];
        arr2[b]=temp;
    }
