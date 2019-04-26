package com.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListExample {

	public static void main(String[] args) {
			List<Person> persons=	new ArrayList<Person>(Arrays.asList(new Person(101, "Raja", new Address("Smyran", "PA", 12345)),
							new Person(102, "Reddy", new Address("fsd", "et", 654)),
							new Person(103, "Bolle", new Address("bsdafa", "dfg", 45234))));
/*			System.out.println(persons);
			
			
			int sizeof_persons = persons.size();
			System.out.println("sizeof_persons ="+sizeof_persons);
			System.out.println(persons.get(2));
			System.out.println(persons.isEmpty());
			persons.add(new Person(104, "vishnu", new Address("35dsd", "fgdfsre", 3452)));
			System.out.println(persons.size());
			System.out.println(persons.remove(1));
			System.out.println(persons);
			System.out.println(persons.size());
			persons.set(1, new Person(121, "dsfsa", new Address("532", "654", 452)));
			System.out.println(persons);
			persons.clear();
			System.out.println(persons.size());
			System.out.println("Lastrly "+ persons);*/
			
			persons.stream().forEach(System.out::println);
			List<Person> person_single = persons.stream().filter(x ->x.getEmpName().equalsIgnoreCase("reddy")).collect(Collectors.toList());
			System.out.println(person_single);
			List<Person> sortedList = persons.stream().sorted((s1,s2) -> s2.getEmpName().compareTo(s1.getEmpName())).collect(Collectors.toList());
			System.out.println(sortedList);
			List<Person> sortedList_Ac = persons.stream().sorted((s1,s2) -> s1.getEmpName().compareTo(s2.getEmpName())).collect(Collectors.toList());
			System.out.println(sortedList_Ac);
			
			List<Integer> Modified_empNo = persons.stream().map(x ->x.getEmpNo()+100).collect(Collectors.toList());
			System.out.println(Modified_empNo);
			
	}

}
