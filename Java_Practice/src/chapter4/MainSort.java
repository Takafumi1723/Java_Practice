package chapter4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainSort
{
	public static void main(String[] args)
	{
		List<String> list = new ArrayList<String>();
		list.add("100");
		list.add("あか");
		list.add("@");

		Collections.sort(list);
	}
}
