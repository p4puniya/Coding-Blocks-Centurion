class Classroom{
    // static void entry(){}
    public static void main(String args[]){
        System.out.println("This is main method");
        // Student.introduceYourself();
        Student sumit= new Student();
        sumit.name= "LORD";
        sumit.ID= 69;
        sumit.section= 'z';
        sumit.branch="ECE";
        sumit.introduceYourself();
        Student ankesh= new Student("Ankesh",9);
        ankesh.introduceYourself();
        // int[] arr= new int[];
        // List<Integer> arr= new ArrayList<>();
    }
    static{
    System.out.println("This is main static");}
}