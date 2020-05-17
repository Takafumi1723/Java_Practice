package chapter6;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SampleLambdaExe
{
	final static int num1 = 1;
	final static int num2 = 3;
	final static int num3 = 5;

	public static void main(String[] args)
	{
		List<Integer> tempList = new LinkedList<Integer>();
		tempList.add(num1);
		tempList.add(num2);
		tempList.add(num3);

		//配列とListの相互変換（ただの練習）
		Integer[] numArray = tempList.toArray( new Integer[tempList.size()] );
		List<Integer> numList = Arrays.asList(numArray);

		//ここからラムダ式の構文
		//処理内容は、Integer型の配列を引数に渡すとしてInteger型の配列を返却する処理
		//SAMインターフェースはIsampleLambdaとする
		ISampleLambda array = (List<Integer> list) -> {
			Integer[] tempArray = list.toArray( new Integer[list.size()]);
			return tempArray;
		};

		Integer[] results = array.call(numList);
		for(int result: results)
		{
			System.out.println(result);
		}
	}


}
