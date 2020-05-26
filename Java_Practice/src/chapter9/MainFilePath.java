package chapter9;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

public class MainFilePath {

	public static void main(String[] args)
	{
		//java.io.Fileインスタンスを生成する
		File file = new File("/Users/hoge/hogehoge/sample.txt");

		//PathクラスはFileクラスの後継クラスのようなもの
		//FileインスタンスよりPathインスタンスを取得する
		Path path = file.toPath();

		//Pathインスタンスを引数にFilesクラスのStaticメソッドを呼び出してファイルに対して操作を行う
		boolean exist = Files.exists(path);

		if(exist)
		{
			System.out.println("ファイルは存在します");
		}
		else
		{
			System.out.println("ファイルは存在しません");
		}
	}

}
