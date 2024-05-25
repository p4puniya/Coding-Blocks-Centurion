class SearchNum{
    public static void main(String[] args){
        int []arr={1,2,3,4,6,7,8,9,10};
        BinarySearch bs= new BinarySearch();
        System.out.print(arr[bs.upperBound(arr,7)]);
    }
}

// 1,3,9,11,3,6,12,16,9,7,6,20,8,16
// 10