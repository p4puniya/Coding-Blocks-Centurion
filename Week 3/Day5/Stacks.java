class Stacks{
    int[] stack= new int[5];
    int index=-1;
    //inserting in stack
    void push(int data){
        if(this.index==stack.length-1)
            System.out.println("Overflow");
        else{
            this.index++;
            stack[this.index]=data;}
    }
    int peek(){
        if(index<0) return -1;
        return stack[index];
    }
    void pop(){
        if(this.index>=0)
            this.index--;
        else
            System.out.println("Empty Stack.");
    }

    int size(){
        return this.index+1;
    }
    
    void Display(){
        for(int i=0;i<=index;i++)
            System.out.print(stack[i]+" ");
        System.out.println();
    }

    boolean isEmpty(){
        return index==-1;
    }
}