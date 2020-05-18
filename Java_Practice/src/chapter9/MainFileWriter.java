package chapter9;

import java.io.FileWriter;
import java.io.IOException;

public class MainFileWriter {

	public static void main(String[] args) throws IOException
	{
		//1.ファイルを開く
		//true:ファイルがあれば末尾に追加、false:上書き
		FileWriter fw = new FileWriter("/Users/hoge/hogehoge/sample.txt", true);
		//2.ファイルに書く＋書き込み
		fw.write("sampleStr");
		fw.flush();
		//3.ファイルを閉じる
		fw.close();
	}
}
