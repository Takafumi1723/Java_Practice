package chapter4;

public class HeroHashCode
{
	String name;
	int hp;

	/**
	 * hashCode()のオーバーライドの定石
	 */
	public int hashCode()
	{
		int result = 37;//1.適当な初期値を決める
		result = result * 31 + name.hashCode();//2.各フィールドの影響を加える。奇数かつ素数である31がよく使われる。
		result = result * 31 + hp;//2. "

		return result;//3.結果を返す
	}

}
