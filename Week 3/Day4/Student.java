class Student{
    String name;
    int ID;
    int age;
    char section;
    String branch;
    void introduceYourself(){
        System.out.println("Hi, my name is: "+ name+ 
        " my ID is: "+ ID+" my major is: "+branch+ 
        " of section "+section+" my age is "+age);
    }
    //Default Constructor
    public Student(){
    }
    public Student(String name,int age){
        this.name=name;
        if(age>17)
            this.age= age;
        else
            System.out.println("Wrong Input");
    }
    
        // try{
        //     if(age>17)
        //     this.age= age;
        //     else
        //         throw new Exception("Wrong Inputs :)");
        // }catch(Exception e){
        //     e.printStackTrace();
        //     // System.exit(0);
        // }finally{
        //     System.out.println("We can end our code");
        // }
        
        // System.out.println("Wrong Input");
    
    //all values and populate thr obj
    // static{
    //     System.out.println("This is stud. static");
    // }
}