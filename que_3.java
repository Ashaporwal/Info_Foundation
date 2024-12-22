/*WAP to pass entire array to a method and count of even and odd*/

public class Program
{
    public static void main(String[] args) {
        int [] x = {10,20,3,4,5};
        display(x);
    }
    public static void display(int [] arr){
        //System.out.println("Array elements are:");
        int ecount = 0;
        int ocount = 0;
        for(int x: arr){
        
        if(x%2==0){
        
            ecount++;
        }
        else{
            ocount++;
        }
        
        
        }
            System.out.println("number of even count are:"+ecount);
          System.out.println("number of odd count are:"+ocount);
        }
    }
