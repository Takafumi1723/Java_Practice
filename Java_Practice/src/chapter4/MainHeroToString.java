package chapter4;

public class MainHeroToString {

	public static void main(String[] args)
	{
		Hero hero = new Hero("god", 500, 100);
		//★HeroクラスでオーバーライドされたtoString()が実行される
		System.out.println(hero);
	}

}
