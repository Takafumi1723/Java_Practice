package chapter10;

import java.io.FileReader;
import java.io.Reader;
import java.util.Properties;

public class MainReadProperties {

	public static void main(String[] args) throws Exception
	{
		Reader fr = new FileReader("/Users/hoge/hogehoge/Chapter10/ReadPropertiesSample.properties");
		Properties p = new Properties();//java.util.Propertiesクラスの利用
		p.load(fr);//プロパティファイルの読み込み
		String name = p.getProperty("name");
		String password = p.getProperty("password");

		System.out.println(name);
		System.out.println(password);

		fr.close();
	}
}
