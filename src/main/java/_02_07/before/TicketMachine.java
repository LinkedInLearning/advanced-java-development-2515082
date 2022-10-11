package _02_07.before;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class TicketMachine {

    public static void main(String[] args) {

        List<List<String>> destinationLists = asList(
                asList("New York", "Boston"),
                asList("Los Angeles", "San Francisco"));


        List<List<Ticket>> ticketLists = asList(
                asList(new AdultTicket(), new AdultTicket()),
                asList(new ChildTicket(), new ChildTicket())
        );

        List<String> destinations = flattenList(destinationLists);
        System.out.println(destinations);

//        List<Ticket> tickets = flattenList(ticketLists);
//        System.out.println(tickets);

//        System.out.println("Total price: " + getTotalPrice(tickets));

//        List<AdultTicket> adultTickets = asList(new AdultTicket(), new AdultTicket());
//        System.out.println("Total price: " + getTotalPrice(adultTickets));

    }


    static List<String> flattenList(List<List<String>> nestedList) {

        List<String> flattenedList = new ArrayList<>();
        nestedList.forEach(flattenedList::addAll);
        return flattenedList;

    }


    static int getTotalPrice(List<Ticket> tickets) {
        int totalPrice = 0;
        for (Ticket ticket : tickets) {
            totalPrice += ticket.getPrice();
        }
        return totalPrice;
    }


}
