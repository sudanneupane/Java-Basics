import java.io.*;
public class Stack {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the size of the stack");
        int x= Integer.parseInt(br.readLine());
        Stacking s= new Stacking(x);
        int ch;
        do
        {
            System.out.println("1.Push 2.Pop 3.Display 4.Exit");
            ch=Integer.parseInt(br.readLine());
            switch(ch)
            {
                case 1:s.push();
                    break;
                case 2:s.pop();
                    break;
                case 3:s.display();
                    break;
                case 4:System.exit(0);
            }
        }
        while(ch!=4);
    }

}





class Stacking
        {
            private int a[], size, top;
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            public Stacking(int n)
            {
                size =n;
                a =new int[size];
                top=-1;
            }
            public void push() throws IOException {
                if(top==size-1)
                    System.out.println("Stack is full");
                else
                {
                    System.out.println("enter the elements into stack");
                    int n =Integer.parseInt(br.readLine());
                    top++;
                    a[top]=n;
                }
            }
            public void pop()
            {
                if(top==-1)
                    System.out.println("stack is empty");
                else
                {
                    int d=a[top];
                    top--;
                    System.out.println("deleted element is"+d);
                }
            }
            public void display()
            {
                if (top==-1)
                    System.out.println("stack is empty");
                else
                {
                    System.out.println("elements in stack are");
                    for(int i=0; i<=top; i++)
                        System.out.println(" "+a[i]);
                }
            }
        }
