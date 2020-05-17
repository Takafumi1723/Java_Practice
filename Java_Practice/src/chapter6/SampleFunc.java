package chapter6;

public class SampleFunc {

	public static int sum(int a, int b)
	{
		return a + b;
	}
	public static void main(String[] args)
	{
		//関数オブジェクトを格納するためのSAMインターフェースIsampleFuncitonに関数を格納
		ISampleFunction func = SampleFunc::sum;

		int result = func.call(8, 9);

		System.out.println(result);
	}

}
