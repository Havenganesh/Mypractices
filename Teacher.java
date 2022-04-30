public class Teacher extends School_Inspector
{
public static void main(String[] args)
{
School_Inspector teacher = new Teacher();
teacher.distribute();
teacher.inspect();
teacher.meet_Kids();
//teacher.teach();
//teacher.correct_Papers();
}
public void teach()
{
System.out.println("Teaching");
}
public void correct_Papers()
{
System.out.println("papers");
}
public void meet_Kids()
	{
		System.out.println("class room ");
	}
}
