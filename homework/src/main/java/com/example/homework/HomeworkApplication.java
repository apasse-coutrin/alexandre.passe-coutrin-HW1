package com.example.homework;

import org.apache.logging.log4j.util.PropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.lang.annotation.*;
import java.util.stream.Collectors;

@SpringBootApplication
public class HomeworkApplication {

	public static void main(String[] args) {

	}

	public static void ListAllObject(List<Car> cars)
	{
		cars.forEach( (n) -> { System.out.println(n.toString());});
	}

	public static Car createCargo(int makeyear,Car.Color color)
	{
		return new Car(makeyear, 6, 50, color);
	}

	public static Car createPersonal(int makeyear, Car.Color color)
	{
		return new Car(makeyear, 4, 17, color);
	}

	public List<Transactions> findAllTransactionIn2011AndSortByValueASC(List<Transactions> transactions)
	{
		List<Transactions> t = transactions
				.stream()
				.filter((x) -> x.getYear() == 2011)
				.sorted(Comparator.comparingDouble(Transactions::getValue)).toList();
		Collections.reverse(transactions);
		return transactions;
	}

	public List<String> getUniqueCitiesSortedASC(List<Transactions> transactions)
	{
		List<String> t = transactions
				.stream()
				.map(Transactions::getTrader)
				.toList()
				.stream()
				.map(Trader::getCity)
				.distinct()
				.toList();

		Collections.sort(t);
		Collections.reverse(t);
		return t;
	}

	public String getSingleStringFromUniqueTradersNameSortByNameASC(List<Transactions> transactions)
	{
		String result = transactions
				.stream()
				.map(Transactions::getTrader)
				.toList()
				.stream()
				.map(Trader::toString)
				.distinct()
				.reduce("", (a, e) -> a + " " + e);

		return result;
	}

}
