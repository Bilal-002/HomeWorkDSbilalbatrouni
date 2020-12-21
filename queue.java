
package Queue;


/**
 *
 * @author mahmoud
 */
public class queue  implements QueueInterface , comparable <queue>{
    
    private Object [ ] array ;
    private String name ;
    private int  back ;

    public queue(String name ) {
        this.name = name  ;
    }
    

    public queue (Object String ){
        array  = new Object [3];
        back = -1;
    }
    @Override
   public boolean  isEmpty() {
       return back +1 == 0;
   }
    @Override
    public void makeEmpty() {
        back = -1;
    }
    @Override 
    public void enqueue(Object String ){
        if (isEmpty()){
            expand();
        }
        for(int i = back +1;i >0 ; i--){
            array[i]=array[i -1];
        }
        array [0]= String ;
        back++;
    }

    
   
   

     public void expand() {
        Object[] newArray = new Object[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }

     
      @Override
    public void print() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            for (int i = 0; i < back + 1; i++) {
                System.out.print(array[i] + "=>> ");
            }
            System.out.println();
        }
    }
    
      

    @Override
    public void dequeue(Object String) {
       if (isEmpty()) {
            throw new NullPointerException("Queue is empty. No values to remove.");
        } else {
            back--;
        }
    }
    
    //  public void compareto(Object String){
      //    String str1 = "fouad";
        //  String str2 = "ziad";
          //String str3 = "ahmad ";
          //System.out.println(str1.compareTo(str2));
        // System.out.println(str2.compareTo(str3));

    public String compareto(Object String ){
        
         String str1 = "fouad";
          String str2 = "ziad";
          String str3 = "ahmad ";
        
        if(str1 <= String.equals(str2)){
            return - 1;
            
        }else
            if (str2 < = str3.){
                return 1;
            }else{ 
                return 0
                        }
          
        }
    
    public boolean equals(Object String ){
        if (this.name == Object){
            return true ;
        }
        if(Object instanceof String ){
            String str1 = (String )Object;
            
        }return true ;
        if(this.name != Object ){
            
        }return false;
    }
    
    }
    
    
    
           
    


    

