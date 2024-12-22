/*WAP to pass entire array to a method and display it*/

public class Program
{
    public static void main(String[] args) {
        int [] x = {10,20,30,40,50};
        display(x);
    }
    public static void display(int [] arr){
        System.out.println("Array elements are:");
        for(int x : arr){
            System.out.println(x);
        }
    }
}