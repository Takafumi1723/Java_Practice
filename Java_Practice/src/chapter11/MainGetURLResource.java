package chapter11;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class MainGetURLResource {

	public static void main(String[] args) throws Exception
	{
		//URLクラスをインスタンス化
		URL url = new URL("https://www.google.com/");
		//このインプットストリームの先にあるのはインターネット上のWebページ
		InputStream is = url.openStream();
		//Webページのような文字データは文字ストリームとして取得する
		InputStreamReader isr = new InputStreamReader(is);

		int i = isr.read();
		while( i != -1)
		{
			System.out.println( (char) i );
			i = isr.read();
		}
		isr.close();
	}
}
