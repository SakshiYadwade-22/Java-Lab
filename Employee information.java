import java.util.Scanner;
class Emp_info
{
Object info[]=new Object[5];
int Id;
String Name;
float Sallary;
void setInfo()
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter Id: ");
Id=sc.nextInt();
System.out.println("Enter Name: ");
Name=sc.next();
System.out.println("Enter sallary: ");
Sallary=sc.nextFloat();
info[0]=Id;
info[1]=Name;
info[2]=Sallary;
}
void getInfo()
{
System.out.println("Your information: ");
for(int i=0;i<5;i++)
{
System.out.println(" "+info[i]); 
}
}
} 
class Employee
{
    public static void main(String[]args)
    {
    
Emp_info em=new Emp_info();
em.setInfo();
em.getInfo();
}
}
 
