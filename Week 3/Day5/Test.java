class Test{
    public static void main(String args[]){
        Stacks stk= new Stacks();
        System.out.println(stk.isEmpty());

        stk.insert(1);
        stk.insert(2);
        stk.insert(3);
        stk.remove();
        stk.insert(4);
        
        System.out.println(stk.peek());
        stk.insert(5);
        // stk.insert(1);        
        stk.display();
        System.out.println(stk.size());
        System.out.println(stk.isEmpty());
    }
}