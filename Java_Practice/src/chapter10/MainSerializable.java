package chapter10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MainSerializable {

	public static void main(String[] args) throws Exception
	{
		//①インスタンスを保存
		//Serializableインターフェースを実装したクラスのインスタンスを生成
		SerializableHuman human = new SerializableHuman( "superMan", "man", 40 );
		//ファイルを出力する基本ストリームを生成
		FileOutputStream fos =  new FileOutputStream( "/Users/hoge/hogehoge/Chapter10/SerializableSample.txt" );
		//基本ストリームにシリアライズ処理の追加
		ObjectOutputStream oos = new ObjectOutputStream( fos );

		//インスタンスをバイト配列へ変換して書き込み
		oos.writeObject(human);

		oos.flush();
		oos.close();

		//②インスタンスを復元
		FileInputStream fis = new FileInputStream(  "/Users/hoge/hogehoge/Chapter10/SerializableSample.txt" );
		ObjectInputStream ois = new ObjectInputStream( fis );

		//バイト配列からインスタンスへ変換
		SerializableHuman readHuman =  (SerializableHuman) ois.readObject();

		ois.close();
	}
}
