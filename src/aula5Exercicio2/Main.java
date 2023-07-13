package aula5Exercicio2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> strings = new ArrayList<String>();
		
		strings.add("Gol");
		strings.add("Camaro");
		strings.add("Fusca");
		strings.add("S-10");
		strings.add("Gol");
		strings.add("Versa");
		strings.add("Onix");
		strings.add("Fusca");
		
		Map<String, Integer> occurrences = countOccurrences(strings);

		System.out.println("Ocorrências das strings: " + occurrences);
	}
	
	/**
	 * 
	 * @param strings
	 * @return
	 */
	public static Map<String, Integer> countOccurrences(List<String> strings) {
		Map<String, Integer> countMap = new HashMap<>();

		for (String str : strings)
			countMap.put(str, countMap.getOrDefault(str, 0) + 1);
		
		return countMap;
	}

}
