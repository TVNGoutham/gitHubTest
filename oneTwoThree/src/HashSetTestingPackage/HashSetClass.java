package HashSetTestingPackage;

import java.util.HashSet;
import java.util.Set;

public class HashSetClass {

		Set<Character> set1 = new HashSet<Character>();
		Set<Character> set2 = new HashSet<Character>();
		
		public HashSetClass()
		{
			set1.add('a');
			set1.add('e');
			set1.add('i');
			set1.add('o');
			set1.add('u');
			set2.add('A');
			set2.add('E');
			set2.add('I');
			set2.add('O');
			set2.add('U');
		}
		
		public int vowelsCount(String s)
		{
			int count = 0;
			for(int i=0; i<s.length(); i++)
			{
				if(set1.contains(s.charAt(i)) || set2.contains(s.charAt(i)))
				{
					count++;
				}
			}
			return count;
		}
		
		

}
