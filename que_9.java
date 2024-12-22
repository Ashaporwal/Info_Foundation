/*WAP to read to array from user and display only Armstrong number in that array*/

class Armstrong1
{
public static void main (String args[])
 {
int arr[] = {153,370,371,407,567};
for(int i=0; i<arr.length; i++)
 {
     int x = arr[i];
int sum = 0;
int n = x;
while(x>0)
 {
int rem = x%10; 
sum = sum +(rem *rem *rem);
x = x/10;
}
if(sum == n)
{
System. out. println (n);
}

}
}
}