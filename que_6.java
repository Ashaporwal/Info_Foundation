/*Assignment_2 question_1


public class Employee{
private long eno;
private String ename;
private long emno;
private String eaddress;
private double esalary;

public void setEno(long eno)
{
    this.eno= eno;
}
public long getId()
{
    return eno;
}

public void setEname(String ename)
{
    this.ename= ename;
}
public String getName()
{
    return ename;
}

public void setEmno(long emno)
{
    this.emno= emno;
}
public long getEmno()
{
    return emno;
}

public void setAddress(String  eaddress)
{
    this.eaddress= eaddress;
}
public String getAddress()
{
    return eaddress;
}

public void setEsalary(double esalary)
{
    this.esalary= esalary;
}
public double getSalary()
{
    return esalary;
}
}
class Demo
{
public static void main(String[] args) {
    Employee p1 = new Employee();
    p1.setEno (101);
   System.out.println(p1.getId());
    p1.setEname ("As");
    System.out.println(p1.getName());
    p1.setEmno( 4758558);
    System.out.println(p1.getEmno());
    p1.setAddress ( "jawahar marg");
    System.out.println(p1.getAddress ());
    p1.setEsalary (100000);
   System.out.println(p1.getSalary());
   
   
   System.out.println();
   //2nd obj
   Employee p2 = new Employee();
    p2.setEno (102);
   System.out.println(p2.getId());
    p2.setEname ("s");
    System.out.println(p2.getName());
    p2.setEmno( 47585588);
    System.out.println(p2.getEmno());
    p2.setAddress ( "jawahar marg indore");
    System.out.println(p2.getAddress ());
    p2.setEsalary (200000);
   System.out.println(p2.getSalary());
   
   
   System.out.println();
   //3rd obj
   Employee p3 = new Employee();
    p3.setEno (102);
   System.out.println(p3.getId());
    p3.setEname ("s");
    System.out.println(p2.getName());
    p3.setEmno( 47585588);
    System.out.println(p3.getEmno());
    p3.setAddress ( "jawahar marg indore");
    System.out.println(p3.getAddress ());
    p3.setEsalary (200000);
   System.out.println(p3.getSalary());
   
   
   System.out.println();
   Employee a[] = new Employee [3];
   a[0] = p1;
   a[1] = p2;
   a[2] = p3;
   for(int i=0; i<a.length; i++)
   {
       
       //if(getSalary() >10000){
           System.out.println(a[i].getId()+" "+a[i].getName()+" "+ a[i].getEmno ()+" "+ a[i].getAddress ()+" "+ a[i].getSalary() );
       
   }
   
   
   /* System.out.println("Employee ID: " + p1.getEno());
        System.out.println("Employee Name: " + p1.getEname());
        System.out.println("Employee Mobile Number: " + p1.getEmno());
        System.out.println("Employee Address: " + p1.getEaddress());
        System.out.println("Employee Salary: " + p1.getEsalary());
    */
}
        
    }
