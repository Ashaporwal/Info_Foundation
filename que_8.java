/*WAP to check number is Armstrong or not*/

class Armstrong
{
public static void main (String args[])
 {
int n = 153;
int x = n;
int sum = 0;
while(n>0)
 {
int rem = n%10; 
sum = sum +(rem *rem *rem);
}
if (sum = x&& x>0) 
{
System. out. println ("Armstrong no");
}
else{
System. out. println (" not Armstrong no");
}
}
}