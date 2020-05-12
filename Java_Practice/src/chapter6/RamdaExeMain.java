package chapter6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RamdaExeMain {

	public static void main(String[] args)
	{
		List<Integer> list = new ArrayList<Integer>();
		Collections.addAll(list, 3,6,9);

		//①listの各要素を２倍にする
		//（RamdaMain.javaの同処理を１行で書くことができる）
		list.stream().forEach( i -> System.out.println( i * 2 ));

		//parallelStream()を使ってJVMは並列処理を行うようになる
		list.parallelStream().forEach( i -> System.out.println( i * 3 ));

		//配列に対してStream処理を行う
//		int[] num = {2,4,6};
//		Stream st = Arrays.stream(num);
//		st.forEach( i -> System.out.println( i * 2 ));

	}

}
