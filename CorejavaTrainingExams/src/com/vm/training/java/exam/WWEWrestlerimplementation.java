package com.vm.training.java.exam;
import java.util.*;
import java.util.stream.Collectors;
public interface WWEWrestlerimplementation 
{
	static long numberOfWrestlesr(ArrayList<WWE> wrestlersList)
	{
		long count =0;
		count= wrestlersList.stream().count();
		return count;
	}
	static long sumOfWeightOfWrestlers(ArrayList<WWE> wrestlersList)
	{
		long sum=0;
		sum= wrestlersList.stream().filter(s->s.getWeight()>200).collect(Collectors.summarizingInt(WWE::getWeight)).getSum();
		return sum;
		
	}
	static List firstNameOfWrestler(ArrayList<WWE> wrestlersList)
	{
		List firstName=wrestlersList.stream().map(m->m.getFirstName()).collect(Collectors.toList());
		return firstName;
	}

	public static void main(String[] args) 
	{
		ArrayList<WWE> wwewrestlersList=new ArrayList<WWE>();
		wwewrestlersList.add(new WWE("ravi", "kumar", 196));
		wwewrestlersList.add(new WWE("rama ", "krishna", 172));
		wwewrestlersList.add(new WWE("siva", "kumar", 215));
		wwewrestlersList.add(new WWE("jhon ", "rao", 248));
		wwewrestlersList.add(new WWE("ranam", "rao", 201));
		
		System.out.println("Total Number of Wrestlers: "+numberOfWrestlesr(wwewrestlersList));
		System.out.println("sum of all wrestlers above weigth 200  "+sumOfWeightOfWrestlers(wwewrestlersList));
		System.out.println("Wrestlers First Name: "+firstNameOfWrestler(wwewrestlersList));
		System.out.println("Sort by First Name of wrestlers: ");
		wwewrestlersList.stream().sorted(Comparator.comparing(WWE::getFirstName)).forEach(System.out::println);
		
	}
}
