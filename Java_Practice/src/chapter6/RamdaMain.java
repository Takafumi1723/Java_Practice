package chapter6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RamdaMain {

	public static void main(String[] args)
	{
		List<Integer> list = new ArrayList<Integer>();
		Collections.addAll(list, 3,6,9);
		//listの各要素の２倍を表示する
		for(int num : list)
		{
			System.out.println(num * 2);
		}

		List<Character> charList = new ArrayList<Character>();
		Character c1 = new Character('a');
		Character c2 = new Character('b');
		charList.add(c1);
		charList.add(c2);

		for( Character c : charList )
		{
			System.out.println(c.charValue());
		}

	}

}
