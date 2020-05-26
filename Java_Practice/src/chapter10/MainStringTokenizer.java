package chapter10;

import java.util.StringTokenizer;

public class MainStringTokenizer {

	public static void main(String[] args)
	{
		String str = "Account,Password,Gender";
		//第二引数のデミリタ「,」で文字列を分割する
		StringTokenizer st = new StringTokenizer(str, ",");

		while(st.hasMoreTokens())
		{
			//それぞれのデータ（トークンという）を順次取得する
			String tempStr = st.nextToken();
			System.out.println(tempStr);
		}
	}
}
