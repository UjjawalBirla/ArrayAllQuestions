package Stack_Project;

public class StackImplementation {
    static int [] stack=new int[5];
    static int top=-1;

    public static void main(String[] args) {
        push(10);
         push(20);
          push(30);

          System.out.println(pop());
          System.out.println( peek());
    }
    static void push(int x)
    {
        stack[++top]=x;
    }

    static int pop()
    {
        return stack[top--];   
    }

    static int peek()
    {
        return stack[top];
    }
}
