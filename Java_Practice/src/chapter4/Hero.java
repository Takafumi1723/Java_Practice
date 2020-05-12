package chapter4;

public class Hero
{
	private String name;
	private int hp;
	private int mp;

	//コンストラクタ
	public Hero(String name, int hp, int mp)
	{
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}
	/*
	 * ObjectクラスのtoString()をオーバーライド
	 */
	public String toString()
	{
		return "我は勇者なり（名前：" + this.name + " /hp：" + this.hp + " /mp：" + this.mp + ")";
	}

}
