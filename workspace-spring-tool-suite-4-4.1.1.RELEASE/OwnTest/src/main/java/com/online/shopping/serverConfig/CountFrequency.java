package com.online.shopping.serverConfig;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer  k = 1;
		Map<String, Integer> map =  new HashMap<String, Integer>();
		String input = "abc xyz abc pqr abc xyz";
		String []words = input.split(" ");
		for(int i=0; i<words.length; i++) {
			if(null != map.get(words[i])) {
				map.put(words[i], map.get(words[i])+1);
			}
			else {
				map.put(words[i], k);
			}
		}
		
		System.out.println(map.entrySet().stream().collect(Collectors.toList()));
		/*
		 * Arrays.stream(words) .forEach(word->System.out.print(word + " "));
		 */
		//map.get
		/*
		 * Arrays.stream(words).forEach(word -> { if(null != map.get(word)) {
		 * map.put(word, map.get(word)+1); } else { map.put(word,i); } });
		 */
												//? map.put(word, (map.get(word)+1:i)));
		
	/*
	 * animalMap.entrySet().stream() .forEach( pair -> { if (pair.getValue() !=
	 * null) { myMap.put(pair.getKey(), pair.getValue()); } else {
	 * myList.add(pair.getKey()); } } );
	 */
		
		
	}

}
