class Queue{
    private int arr[];
    private int start,end,currSize,maxSize;
    //creating a constructor
    public Queue(){
        arr= new int[5];
        start=-1;
        end=-1;
        currSize=0;
    }
    public Queue(int maxSize){
        this.maxSize= maxSize;
        arr= new int[maxSize];
        start=-1;
        end=-1;
        currSize=0;
    }
    public void push(int newElement){
        if(currSize== maxSize){
            System.out.println("Queue is full\n");
            System.exit(0);
        }
        if(end==-1){
            start=0;
            end=0;
        }else
            end=(end+1)%maxSize;
        arr[end]=newElement;
        currSize++;
    }
    //Creating the pop function
    public int pop(){
        if(start==-1){
            System.out.print("Queue Empty\n");
            System.exit(1);
        }
        int popped= arr[start];
        if(currSize==1){
            start=-1;
            end=-1;
        }
        else 
            start= (start+1)%maxSize;
        currSize--;
        return popped;
    }
    public int top(){
        if(start==-1){
            System.out.print("Queue Empty\n");
            System.exit(1);
        }
        return arr[start];
    }

    public int size(){
        return currSize;
    }

    public boolean isEmpty(){
        return start==-1;
    }

    //Display Function is HomeWork.
    //Make sure to use the % function if needed
    //A simple for or while loop will work
    
}