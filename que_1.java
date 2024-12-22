/*WAP to pass entire array to a method and display it*/

public class Program
{
    public static void main(String[] args) {
        int [] y = {1,2,3,4,5};
        display(y);
    }
    public static void display(int [] y)
    {
        
        for(int x  : y){
            System.out.println(x);
        }
    }
}