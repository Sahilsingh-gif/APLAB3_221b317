/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
class Juet{
    String name;
    int age;
    
    public void set_age(int b)
    {age=b;}
    public void set_name(String a)
    {name=a;}
    public String get_name()
    {return name;}
    public int get_age()
    {return age;}
};


public class Main
{
	public static void main(String[] args) {
		Juet obj1 = new Juet();
		System.out.println("ENTER NAME :");
		Scanner ob=new Scanner(System.in);
		obj1.set_name(ob.next());
		System.out.println("ENTER AGE :");
		obj1.set_age(ob.next());
		
		System.out.println("Name is = "+obj1.get_name());
		System.out.println("Age is = "+obj1.get_age());
	}
}