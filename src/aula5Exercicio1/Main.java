package aula5Exercicio1;

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
		
		List<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(1);
		numbers.add(4);
		numbers.add(6);
		numbers.add(2);
		numbers.add(2);
				
		List<Integer> duplicates = findDuplicates(numbers);

		System.out.println("Duplicates: " + duplicates);
	}
	
	/**
	 * 
	 * @param numbers
	 * @return
	 */
	public static List<Integer> findDuplicates(List<Integer> numbers) {
		
		List<Integer> duplicates = new ArrayList<>();
		Map<Integer, Integer> countMap = new HashMap<>();

		for (int number : numbers)
			countMap.put(number, countMap.getOrDefault(number, 0) + 1);

		for (Map.Entry<Integer, Integer> entry : countMap.entrySet())
			if (entry.getValue() > 1)
				duplicates.add(entry.getKey());

		return duplicates;
	}
}