package chapter9;

import java.io.FileOutputStream;
import java.io.IOException;

public class MainFileOutputInput
{
	//２進数「01000001」をファイルに書き込む
	public static void main(String[] args) throws IOException
	{
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("/Users/hoge/hogehoge/sampleByte.txt", true);
			fos.write(65);
			fos.flush();
		}
		catch (IOException e)
		{
			System.out.println("error");
			e.printStackTrace();
		}
		finally
		{
			if(fos != null)
			{
				fos.close();
			}
		}
	}
}
