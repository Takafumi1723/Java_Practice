package chapter9;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.GZIPOutputStream;

public class Practice9_2 {

	public static void main(String[] args) throws Exception
	{
		//コピー元となるファイル
		String file1 = "/Users/hoge/hogehoge/Chapter9/inputSampl2.txt";
		//コピー先となるファイル
		String file2 = "/Users/hoge/hogehoge/Chapter9/outputSampl2.txt";

		//読み込みストリーム生成
		FileInputStream fis = new FileInputStream(file1);
		//書き込みストリーム生成
		FileOutputStream fos = new FileOutputStream(file2);
		//書き込み時に利用するバッファリングストリームを生成
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		//圧縮ストリームを生成する
		GZIPOutputStream gzos = new GZIPOutputStream(bos);

		int i = fis.read();
		while( i != -1)
		{
			gzos.write(i);
			i = fis.read();
		}
		gzos.flush();
		gzos.close();
		fis.close();
	}

}
