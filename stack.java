
package stack;

public class stack implements  stackinterface{
    private Object array[];
    private int top;
     private String Object ;

    public stack(String Object, int String) {
        this.Object = Object;
        Object str = new Object[String ];
    }
     
   

    @Override
    public boolean isEmpty() {
        return top + 1 == 0;
    }

    @Override
    public void makeEmpty() {
        if (!isEmpty()) {
            top = -1;
           
        }
    }

   

    @Override
    public Object peek() {
        if (isEmpty()) {
            throw new NullPointerException("it is empty no name to print  ");
        } else {
            return array[top];
        }
    }

   
    @Override
    public void push(Object String ) {
        if (isFull()) {
            expand();
        }
        top++;
        array[top] = String ;
    }

   
    @Override
    public void pop() {
        if (isEmpty()) {
            throw new NullPointerException("it is empty no name  for removed .");
        } else {
            top--;
        }
    }

   

    @Override
    public void print() {
        if (isEmpty()) {
            System.out.println("empty");
        } else {
            for (int i = top; i >= 0; i--) {
                System.out.print(array[i] + "==>> ");
            }
            System.out.println("it is A stack ");
        }
    }

    private boolean isFull() {
         return top + 1 == array.length;
    }

    private void expand() {
          Object[] newArray = new Object[array.length * 3];
       
        System.arraycopy(array, 0, newArray, 0, array.length);
         this.array = newArray;
    }
}
