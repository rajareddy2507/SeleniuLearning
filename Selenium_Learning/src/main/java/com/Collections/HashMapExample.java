package com.Collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMapExample {
	public static void main(String args[]){
List<Person> persons=		Arrays.asList(new Person(101, "Raja", new Address("Smyran", "PA", 12345)),
				new Person(102, "Reddy", new Address("fsd", "et", 654)),
				new Person(103, "Bolle", new Address("bsdafa", "dfg", 45234)));
System.out.println(persons);

Map<String, Address> nameAndAddress = persons.stream().collect(Collectors.toMap(Person :: getEmpName, Person :: getAddress));
//System.out.println(nameAndAddress);

HashMap<String, Address> mp = (HashMap<String, Address>) nameAndAddress;
mp.put("Vishnu", new Address("gdsf", "ewrtew", 34232));
mp.put("Polimera", new Address("etwer", "vxzxc", 86756));
/*System.out.println(mp.size());
System.out.println(mp.keySet());
System.out.println(mp.values());
System.out.println(mp.isEmpty());
System.out.println(mp.remove("Raja"));
System.out.println(mp.size());
System.out.println(mp);
System.out.println(mp.replace("Reddy", new Address("12324", "8768678", 856453)));
System.out.println(mp);*/

for(Map.Entry<String, Address> each_mp: mp.entrySet()){
	System.out.println(each_mp.getKey()+" "+ each_mp.getValue());
}

	}
}
