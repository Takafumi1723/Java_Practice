package chapter6;

import java.util.function.IntBinaryOperator;

public class MainRamda
{
	public static void main(String[] args)
	{
		//「2つの引数の差を求める処理」の実体を生み出し、代入する
		//右辺がラムダ式の構文
		IntBinaryOperator func = (int a, int b) -> { return a - b; };//この行が実行された瞬間、関数の実体が生成される
		int result = func.applyAsInt(5, 3);
		System.out.println(result);
	}

}
