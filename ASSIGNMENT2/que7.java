import java.util.Scanner;
class que7
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);

int num1 = sc.nextInt();
System.out.println("Input first number :"+num1);

for (int i=0; i<10; i++)
{
System.out.println(num1+"*"+(i+1)+"="+(num1*(i+1)));
}
}
}
