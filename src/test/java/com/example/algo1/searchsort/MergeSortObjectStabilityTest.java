package com.example.algo1.searchsort;

import java.util.Comparator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MergeSortObjectStabilityTest {

	MergeSortObject<Ticket> mergeSorttickets;
	MergeSortObject<String> mergeString;
	
	@BeforeEach
	public void setup() {
		Ticket t22 = Ticket.builder().ticket("2").location("ny").time("03:05").build();
		Ticket t1 = Ticket.builder().ticket("1").location("chicago").time("09:05").build();
		Ticket t21 = Ticket.builder().ticket("2").location("ny").time("10:15").build();
		Ticket t12 = Ticket.builder().ticket("12").location("chicago").time("02:05").build();
		Ticket t3 = Ticket.builder().ticket("3").location("la").time("11:15").build();
		Ticket t33 = Ticket.builder().ticket("33").location("la").time("12:05").build();
		Ticket t2 = Ticket.builder().ticket("2").location("ny").time("10:05").build();
		Ticket t13 = Ticket.builder().ticket("13").location("chicago").time("01:05").build();
		Ticket t32 = Ticket.builder().ticket("32").location("la").time("09:35").build();
		Ticket t23 = Ticket.builder().ticket("2").location("ny").time("11:13").build();
		Ticket t11 = Ticket.builder().ticket("11").location("chicago").time("09:25").build();
		Ticket t31 = Ticket.builder().ticket("31").location("la").time("11:05").build();
		
		
		mergeSorttickets = new MergeSortObject<Ticket>(new Ticket[] {t2,t22,t1,t3,t12,t21,t31,
				t33,t11,t23,t3,t22,t32,t13});
	}
	@Test
	public void testSortTicketsStability() {
		mergeSorttickets.print();
		mergeSorttickets.sort(mergeSorttickets.arr, new Ticket[mergeSorttickets.arr.length], 
				new SortByTime());
		mergeSorttickets.print();
		mergeSorttickets.sort(mergeSorttickets.arr, new Ticket[mergeSorttickets.arr.length], 
				new SortByLocation());
		mergeSorttickets.print();
		
	}
	
	@Test
	public void testString() {
		mergeString = new MergeSortObject<String>(new String[] {
				"this","is","not","how","i","see","it","going"
		});
		mergeString.print();
		mergeString.sort(mergeString.arr , new String[mergeString.arr.length], 
				Comparator.comparing(String::toString));
		mergeString.print();
	}
}
