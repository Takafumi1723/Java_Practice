package chapter9;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;

public class MainCharReaderWriter {

	public static void main(String[] args)
	{
		String str = "明日の天気は晴天";
		//文字列から1文字ずつ読み込む
		Reader sr = new StringReader(str);
		try {
			char c1 = (char) sr.read();
			char c2 = (char) sr.read();
			System.out.println("c1:" + c1);
			System.out.println("c2:" + c2);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		//文字列に一文字ずる書き込む
		StringWriter sw = new StringWriter(3);
		sw.write("昨");
		sw.write("日");

		System.out.println(sw.toString());
	}
}
