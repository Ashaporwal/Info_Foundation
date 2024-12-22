/*WAP to pass entire array to a method and return some of all the elements of this array to main*/

public class Program
{
    public static void main(String[] args) {
      int [] x = {7,0,3,4,5};
     int sum =  display(x);
       System.out.println("Sum of all elemts are :" + sum);
    }
    public static int display(int [] arr){
       
       int  sum  = 0;
        for(int x: arr){
        
    sum += x;
       
        
        }
         return sum;
            
    
        }
    }