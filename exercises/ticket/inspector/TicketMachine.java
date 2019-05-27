package exercises.ticket.inspector;

import java.time.LocalDateTime;

public class TicketMachine {

    public static void buyTicket(Passenger passenger, int timeOfValidity){
        Ticket ticket = new Ticket(LocalDateTime.now(), timeOfValidity);
        passenger.setTicket(ticket);
    }
}
