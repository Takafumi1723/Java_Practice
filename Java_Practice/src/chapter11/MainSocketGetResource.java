package chapter11;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class MainSocketGetResource {

	public static void main(String[] args) throws Exception
	{
		//1.サーバ名とポート番号（またはIPアドレス）を指定してSocketインスタンスを生成する
		Socket sock = new Socket("dokojava.jp", 80);

		//2.Socketから入力ストリームと出力ストリームを取得する
		InputStream is = sock.getInputStream();
		OutputStream os = sock.getOutputStream();

		//3.2つのストリームを読み書きする
		os.write("GET /index.html HTTP/1.0".getBytes());
		os.flush();
		InputStreamReader ist = new InputStreamReader(is);
		int i = ist.read();
		while( i != -1 )
		{
			System.out.println( (char) i);
			i = ist.read();
		}
		//4.ソケットを閉じる（ソケットを閉じると入力・出力ストリームも自動的に閉じられる）
		sock.close();
	}
}
