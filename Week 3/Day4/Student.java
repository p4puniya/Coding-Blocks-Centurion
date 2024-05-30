class Student{
    String name;
    int ID;
    int age;
    char section;
    String branch;
    static void introduceYourself(){
        System.out.println("Hi, my name is: "+ name+ 
        " my ID is: "+ ID+" my major is: "+branch+ 
        " of section "+section+" my age is "+age);
    }
    //Default Constructor
    public Student(){
    }
    public Student(String name,int age){
        this.name=name;
        this.age= age;
    }
    //all values and populate thr obj
    static{
        System.out.println("This is stud. static");
    }
}