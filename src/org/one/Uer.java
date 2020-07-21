package org.one;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class Uer {
	public static void main(String[] args) {
		Map<Integer,India> mp=new HashMap<>();
		India i=new India();
		i.setId(10);
		i.setName("Harun");
		i.setPhno(88787687l);	
		India n=new India();
		n.setId(20);
		n.setName("satz");
		n.setPhno(6876867l);
		India a=new India();
		a.setId(30);
		a.setName("prem");
		a.setPhno(97687686768l);
		mp.put(10, i);
		mp.put(20, n);
		mp.put(30, a);
		
		Set<Entry<Integer, India>> entrySet = mp.entrySet();	
		for (Entry<Integer, India> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue().getId());
			System.out.println(entry.getValue().getName());
			System.out.println(entry.getValue().getPhno());
			
		}
				
		
		
		}
	}


