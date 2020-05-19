package chapter9;

import java.io.FileReader;
import java.io.IOException;

public class MainFileReader {

	public static void main(String[] args) throws IOException
	{
		FileReader fr = new FileReader("/Users/hoge/hogehoge/sample.txt");

		System.out.println("【読み込みを開始】");

		int i = fr.read();
		while(i != -1)
		{
			char c = (char) i;
			System.out.println(c);
			i = fr.read();
		}
		System.out.println("【読み込みが完了しました】");
		fr.close();
	}

}
