package com.example.algo1.sort;

import java.util.Comparator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor @Getter @Setter @AllArgsConstructor @Builder
public class Ticket implements Comparable<Ticket> {

	private String ticket;
	private String time;
	private String location;
	@Override
	public int compareTo(Ticket o) {
		return ticket.compareTo(o.getTicket());
	}
	
	@Override
	public String toString() {
		return new StringBuilder().append(ticket).append(":")
				.append(time).append(":").append(location).toString();
	}
}

class SortByTime implements Comparator<Ticket> {

	@Override
	public int compare(Ticket o1, Ticket o2) {
		return o1.getTime().compareTo(o2.getTime());
	}
}

class SortByLocation implements Comparator<Ticket> {

	@Override
	public int compare(Ticket o1, Ticket o2) {
		return o1.getLocation().compareTo(o2.getLocation());
	}
	
}
