package chapter10;

import java.io.FileReader;
import java.io.Reader;
import java.util.Properties;

public class Practice10_1 {

	public static void main(String[] args) throws Exception
	{
		Reader fr = new FileReader("/Users/hoge/hogehoge/Chapter10/Practice10_1.properties");
		Properties p = new Properties();
		p.load(fr);

		System.out.println(p.getProperty("capital") + "：" + p.getProperty("food"));
	}
}
