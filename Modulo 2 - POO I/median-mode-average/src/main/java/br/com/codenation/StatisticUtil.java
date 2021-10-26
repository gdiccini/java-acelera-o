package br.com.codenation;

import java.util.Arrays;
import java.util.HashMap;

public class StatisticUtil {

	public static int average(int[] elements) {
		Integer sum = 0;
		for (int element : elements) {
			sum += element;
		}
		return sum / elements.length;
	}

	public static int mode(int[] elements) {
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		int max  = 1;
		int temp = 0;

		for(int i = 0; i < elements.length; i++) {

			if (hm.get(elements[i]) != null) {

				int count = hm.get(elements[i]);
				count++;
				hm.put(elements[i], count);

				if(count > max) {
					max  = count;
					temp = elements[i];
				}
			}

			else
				hm.put(elements[i],1);
		}
		return temp;
	}

	public static int median(int[] elements) {
		Arrays.sort(elements);
		Integer size = elements.length;
		Integer middle = size / 2;
		Integer median = 0;
		if (size % 2 == 0) {
			median = (elements[middle - 1] + elements[middle]) / 2;
		} else {
			median = elements[middle];
		}

		return median;
	}
}