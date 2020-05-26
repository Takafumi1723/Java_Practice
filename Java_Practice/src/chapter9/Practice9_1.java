package chapter9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Practice9_1
{
	public static void main(String[] args) throws Exception
	{
		//コピー元となるファイル
		String file1 = "/Users/hoge/hogehoge/Chapter/inputSampl.txt";
		//コピー先となるファイル
		String file2 = "/Users/hoge/hogehoge/Chapter/outputSampl.txt";

		//読み込みストリーム生成
		FileInputStream fis = new FileInputStream(file1);
		//書き込みストリーム生成
		FileOutputStream fos = new FileOutputStream(file2);
		int i = fis.read();
		while( i != -1)
		{
			fos.write(i);
			i = fis.read();
		}
		fos.flush();
		fos.close();
		fis.close();

		//上記のコピー処理をFilesクラスとPathインターフェースを使って１行書く
		Files.copy(Paths.get(file1), Paths.get(file2));
	}

}
