
3.
/*
Employee Categorization by Salary Level

A company maintains a database that includes the details of all employees. Employees are categorized into two levels based on their salary:

Level 1: Top management with a salary of more than $100.
Level 2: Staff with a salary of $100 or less.

Your task is to implement a Java program to categorize employees based on their salary levels.

Requirements:

1. Employee Class:

Attributes:
•    empId (int): The employee's ID.
•    salary (float): The employee's salary.

Methods:
•    Constructor to initialize 'empId' and 'salary'.

2. EmployeeLevel Class:

Inherits from 'Employee'.

Methods:
•    Constructor to initialize 'empId' and 'salary'.
•    Method to determine and return the employee's level based on their salary.
Input format :
•    The input contains the empId and salary of the employee, separated by a space.
Output format :
•    The output should display the empId, salary, and level of the employee, each on a new line.

Refer to the sample output for formatting specifications.
Sample test cases :
Input 1 :
253 46.6
Output 1 :
253
46.6
2
Input 2 :
156 167
Output 2 :
156
167.0
1
*/
import java.util.Scanner;
class Employee
{
    int empId;
    float salary ;
  public  Employee(int empId,float salary)
{
    this.empId = empId;
    this.salary = salary;
}
public int getEmpId()
{
    return empId;
}
public float getSalary()
{
    return salary;
}
}
class EmployeeLevel extends Employee
{
   public EmployeeLevel(int empId ,float salary)
    {
        super(empId,salary);
        }
  public int determineLevel() {
        return getSalary() > 100 ? 1 : 2;
    
}
}
public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int empId = sc.nextInt();
        float salary = sc.nextFloat();

        EmployeeLevel employee = new EmployeeLevel(empId, salary);
        System.out.println(employee.getEmpId());
        System.out.println(employee.getSalary());
        System.out.println(employee.determineLevel());
    }
}