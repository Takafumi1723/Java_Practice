package chapter10;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Practice10_2 {

	public static void main(String[] args) throws Exception
	{
		Employee emp = new Employee("小日向小次郎", 41);
		Department dep = new Department("開発部", emp);

		FileOutputStream fos = new FileOutputStream("/Users/hoge/hogehoge/Chapter10/Practice10_2.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(dep);
		oos.flush();
		oos.close();
	}
}
