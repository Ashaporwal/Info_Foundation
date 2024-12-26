/*task
1.
You are tasked with developing a Java program to manage employee records. The program should allow users to input the first name, last name, employee ID, and job title of an employee. Once the user inputs these details, the program should display the employee's information, including their full name, employee ID, and job title.

Requirements:

Create a class Person with the following attributes:
•    firstName - String
•    lastName - String

This class serves as a base class for other classes and will be extended by the 'Employee' class.

Create a class 'Employee' that extends the 'Person' class:

•    Inherits attributes firstName and lastName from Person.
•    Has additional attributes:
1.    employeeId - int
2.    jobTitle - String
•    Implement getters, setters, and constructors for all the above-mentioned attributes in both Person and Employee classes.

Create a class named 'Main' which contains the main method where program execution begins:

•    It prompts the user to input the details of an employee.
•    It creates an Employee object with the provided details.
•    It displays the employee's information using the getters implemented in the 'Employee' class.
Input format :
•    The first line consists of a String that represents firstName.
•    The second line consists of a String that represents lastName.
•    The third line consists of an int that represents the employeeId.
•    The fourth line consists of a String that represents the jobTitle.
Output format :
•    The output should display the employee details in the following format:
Employee details:
Name: <firstName> <lastName>, <jobTitle>
Employee ID: <employeeId>

Refer to the sample output for formatting specifications.
Sample test cases :
Input 1 :
John
Mathew
120948
Developer
Output 1 :
Employee details:
Name: John Mathew, Developer
Employee ID: 120948
Input 2 :
Tony
Stark
98364
Senior Program Manager
Output 2 :
Employee details:
Name: Tony Stark, Senior Program Manager
Employee ID: 9836


2.
ONLINE TRANSACTION

Google Pay is a popular digital payment platform that allows users to send and receive money securely. It supports various types of transactions, including person-to-person payments, online purchases, and bill payments.

Implement the following classes to represent different types of transactions in Google Pay:

1. The Transaction class should have the following attributes:
 

2. The PeerToPeerTransaction class should inherit from Transaction and have an additional attribute:
 
 
  
3. The OnlinePurchaseTransaction class should inherit from Transaction and have an additional attribute:
 
 

4. The BillPaymentTransaction class should inherit from Transaction and have an additional attribute:
 
 

Write a Java program that demonstrates the usage of these classes. Create instances of PeerToPeerTransaction, OnlinePurchaseTransaction, and BillPaymentTransaction objects, and display their respective transaction information.

Your task is to implement the necessary classes and complete the main method to demonstrate the functionality. Provide the appropriate access modifiers, constructors, and methods as needed.
Input format :
•    The first input is an integer value representing the transaction ID.
•    The second input is a double value representing the amount.
•    The third input is a String value representing the recipient.
•    The fourth input is a String value representing the merchant.
•    The fifth input is a String value representing the bill type.
Output format :
The output should be in the following format:

Peer-to-Peer Transaction:
Transaction ID: <transactionId>
Amount: $<amount>
Recipient: <recipient>

Online Purchase Transaction:
Transaction ID: <transactionId>
Amount: $<amount>
Merchant: <merchant>

Bill Payment Transaction:
Transaction ID: <transactionId>
Amount: $<amount>
Bill Type: <billType>

3.

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

4.
*/
//import java util.Scanner;
class Person
{
    private String fname;
    private String lname;
    
    public void setFname(String fname)
    {
        this.fname = fname;
    }
    public String getFname()
    {
        return fname;
    }
    
    public void setLname(String lname)
    {
        this.lname = lname;
    }
    public String getLname()
    {
        return lname;
    }
}
class Employee extends Person
{
    private int employeeId;
    private String jobtitle;
    
    public void setemployeeId(int employeeId)
    {
        this.employeeId = employeeId;
    }
    
    public int getemployeeId()
    {
        return employeeId;
    }
    
    public void setJobtitle(String jobtitle)
    {
        this.jobtitle = jobtitle;
    }
    public String getJobtitle()
    {
        return jobtitle;
    }
    
}


public class Program
{
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setFname ("asha");
        System.out.println("Employee name is:"+e.getFname());
        e.setLname ("porwal");
        System.out.println("Employee last name is:"+e.getLname() );
        e.setemployeeId (109);
        System.out.println("Employee Id is:"+ e.getemployeeId());
        e.setJobtitle ("software developer");
        System.out.println("Employee name is:"+e.getJobtitle());
        
    }
}