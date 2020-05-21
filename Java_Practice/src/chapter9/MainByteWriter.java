package chapter9;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class MainByteWriter {

	public static void main(String[] args)
	{
		//バイト配列に対して1バイトずつ書き込んでいく
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		baos.write(65);
		baos.write(66);
		byte[] byteData = baos.toByteArray();
		for(byte data: byteData)
		{
			System.out.println(data);
		}

		//バイト配列から1バイトずつ読み込んでいく
		byte[] byteArr = {12, 13};
		ByteArrayInputStream bais = new ByteArrayInputStream(byteArr);
		System.out.println(bais.read());
		System.out.println(bais.read());
	}
}
