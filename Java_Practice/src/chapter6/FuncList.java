package chapter6;

public class FuncList
{
	public static boolean isOdd(int x)
	{
		return (x % 2 == 1);
	}

	public String addNamePrefix(boolean male, String name)
	{
		if(male == true)
		{
			return "xxx" + name;
		}
		else
		{
			return "yyy" + name;
		}
	}

	//上記2つのメソッドをラムダ式で表現したものをFunc1とFunc2に代入
	Func1 f1 = x -> x %  2 == 1;
	Func2 f2 = (male, name) ->
	{
		if(male == true)
		{
			return "xxx" + name;
		}
		else
		{
			return "yyy" + name;
		}

	};
}
