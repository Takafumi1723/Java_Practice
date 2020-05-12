package chapter6;

public class MainPractice {

	public static void main(String[] args)
	{
		FuncList funclist = new FuncList();
		Func1 f1 = FuncList::isOdd;
		Func2 f2 = funclist::addNamePrefix;
		System.out.println(f1.call(14));
		System.out.println(f2.call(true, "12345"));
	}
}
