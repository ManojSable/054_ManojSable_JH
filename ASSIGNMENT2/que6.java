import java.util.Scanner;
class que6
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);

int num1 = sc.nextInt();
int num2 = sc.nextInt();

System.out.println("Input first number :"+num1);
System.out.println("Input second number :"+num2);
System.out.println("sum :"+num1+"+"+num2+" = "+num1+num2);
System.out.println("multiplication :"+num1+"*"+num2+" = "+num1*num2);
System.out.println("division :"+num1+"/"+num2+" = "+num1/num2);
System.out.println("Remainder :"+num1+"%"+num2+" = "+num1%num2);
}
}