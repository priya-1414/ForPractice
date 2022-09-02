/*class SingleInheritance
{
	 static int num1=10;
	 static int num2=5;
}

class Inheritance extends SingleInheritance
{
	public static void main(String[] args){
		int num3=2;
		int result=num1+num2+num3;
		System.out.println("Result = "+result);
	}
}
*/
//Single inheritance
class employe
{
    protected int emp_no;
    protected String name;
    protected int salary;
    public employe(int empno,String nam,int sal)
    {
        emp_no=empno;
        name=nam;
        salary=sal;
    }
    public void emplo_data()
    {
        System.out.println("\nEmploy no. = "+emp_no); 
        System.out.println("Name = "+name);
        System.out.println("Salary = "+salary);
    }
}
class manager extends employe
{
    int reward;
    public manager(int empno,String nam,int sal,int p)
    {
        super(empno,nam,sal);
        reward=p;
    }
    public void managerdata()
    {
        System.out.println("\nEmploy no. = "+emp_no);
        System.out.println("Name = "+name);
        System.out.println("Salary = "+salary);
        System.out.println("Reward = "+reward);
    }
}

class inheritance
{
public static void main(String args[])
{
    employe emp= new employe(1,"Priya Wakhare",20000);
    emp.emplo_data();
    manager man= new manager(2,"Neha Wakhare",50000,1000);
    man.managerdata();
}
}
