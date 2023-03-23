package eserWeek2Day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.util.Collections;
import java.util.Comparator;

public class eser2 {

	
	public static void main(String[] args) {
		
	}
	
	public static List<Integer> creaLista(int n) {

		List<Integer> l = new ArrayList<Integer>();
		for(int i = 0; i < n; i++) {
			l.add( (int) (Math.random() * 101));
		}
		
		//
		Collections.sort(l, Comparator.naturalOrder());
//		Collections.sort(l, Collections.reverseOrder());
//		Collections.sort(l, Comparator.reverseOrder());
		
		return l;
	}
	
	public static List<Integer> secondaLista(List<Integer> l) {
		List<Integer> l1 = l;
		for(int i = l.size(); i > 0; i--) {
//			i-1 oppure l.size()-1; i>=0
			l1.add(l.get(i-1));
		}
		
		
//		Collections.sort(l, Comparator.naturalOrder());//ordine crescente l
//		List<Integer> l1 = l;
//		Collections.sort(l, Comparator.reverseOrder());
//		l1.addAll(l);
		
		
		return l1;
	}

}