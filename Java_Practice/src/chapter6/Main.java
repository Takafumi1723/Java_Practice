package chapter6;
import java.util.function.IntBinaryOperator;

public class Main {
	public static int sub(int a, int b)
	{
		return a - b;
	}
	public static void main(String[] args)
	{
		//subメソッドの処理ロジックを、変数funcに代入する
		IntBinaryOperator func = Main::sub;
		//変数funcに格納されている処理ロジックを、引数5と3で実行する
		//ここで代入されているのは、sub()メソッドへの参照である
		int a = func.applyAsInt(5, 3);//ここで処理を呼び出している
		System.out.println("5-3=" + a);

		//自分で作ったSAMインターフェース型にsub()の参照を代入する
		MyFunction myFunc = Main::sub;
		int b = myFunc.call(4, 2);
		System.out.println("4-2=" + b);
	}
}
