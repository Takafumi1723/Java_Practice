package chapter10;

import java.io.FileWriter;
import java.io.Writer;
import java.util.Properties;

public class MainWriteProperties {

	public static void main(String[] args) throws Exception
	{
		Writer fw = new FileWriter("/Users/hoge/hogehoge/Chapter10/WritePropertiesSample.properties");
		Properties p = new Properties();
		p.setProperty("day", "2020/08/09");
		p.setProperty("weather", "sunny");
		p.store(fw, "未来予想");//ファイルへの書き込みを実行
		fw.close();
	}

}
