# Info_Foundation
Assignments

/*Bob has been tasked with creating a program to calculate and display the circumference and area of the circle.

The program should allow Bob to input the radius of a circle as both an integer and a double and compute both the circumference and area of the circle using separate overloaded methods:

1. calculateCircumference- To calculate the circumference using the formula 2 3.14 radius

24 calculateArea To calculate the area 3.14 radius radius

Write a program to help Bob.

Input format:

The first line of Input consists of an integer m, representing the radius of the circle as a whole number.

The second line consists of a double value n, representing the radius of the circle as a decimal number.

Output format:

The first line of output displays two space-separated double values, rounded to two decimal places, representing the circumference of the circle with the integer radius and the double radius, respectively.

The second line displays two space-separated double values, rounded to two decimal places, representing the area of the circle with the integer radius and the double radius, respectively.

Refer to the sample output for formatting specifications.

Code constraints:


The program should allow Bob to input the radius of a circle as both an integer and a double and compute both the circumference and area of the circle using separate overloaded methods:

*/
public class Bob
{
void Circumference(int m)
{
    System.out.println((2*3.14*m));
}
void AreaofCircle  (int n)
{
    System.out.println((3.14*n*n));
}
void Circumference (double m)
{
    System.out.println((2*3.14*m));
}

void AreaofCircle(double n)
{
    System.out.println((3.14*n*n));
}



class Demo
{

    public static void main(String[] args) 
    {
    //Scanner sc = new Scanner(System.in);
        Bob obj1 = new Bob();
        obj1.Circumference (5);
        obj1.AreaofCircle (3);
        obj1.Circumference(3.5);
        obj1.AreaofCircle (5);
        
    }
}
}
