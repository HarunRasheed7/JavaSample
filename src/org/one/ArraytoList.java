package org.one;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class ArraytoList {
	public static void main(String[] args) {
		int[] a= {10,40,50,20,30,70,88};
		Arrays.sort(a);
		List<Integer> c = Arrays.stream(a).boxed().collect(Collectors.toList());
	ListIterator<Integer> i = c.listIterator();
		while (i.hasNext()) {
			Integer next = i.next();
			System.out.println(next);
		}	
		while (i.hasPrevious()) {
			Integer p = i.previous();
			System.out.println(p);
			
		}
			}			}