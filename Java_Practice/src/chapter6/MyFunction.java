package chapter6;

//MyFunction型に関数オブジェクトを代入するために
//SAMインターフェースを定義する
//インターフェース名やメソッドめいは自由に決めていい
public interface MyFunction
{
	//格納したい関数と同じ、引数はintが2つ、戻り値はintの抽象メソッド
	public abstract int call(int x, int y);
}
