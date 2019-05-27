package exercises.ticket.inspector;

import java.time.LocalDateTime;

public class TicketController {
    public static void main(String[] args) {
        Passenger[] passengers = new Passenger[5];

        passengers[0] = new Passenger("Zenon", "Marchewka");
        passengers[1] = new Passenger("Marzena", "Kopiec");
        passengers[2] = new Passenger("Krzysztof", "Pająk");
        passengers[3] = new Passenger("Renata", "Lutnia");
        passengers[4] = new Passenger("Franek", "Rataj");


        passengers[1].setTicket(new Ticket(LocalDateTime.now().minusMinutes(20), 15));
        passengers[3].setTicket(new Ticket(LocalDateTime.now().minusMinutes(20), 10));

        TicketMachine.buyTicket(passengers[0],20);
        TicketMachine.buyTicket(passengers[2],30);
        TicketMachine.buyTicket(passengers[4],15);

        Passenger[] passengers1 = expiredTicket(passengers);
        for (Passenger passenger:passengers1){
            System.out.println(passenger);
        }
    }

    public static Passenger[] expiredTicket(Passenger[] passengers){
        int tabSize = 0;
        for (Passenger passenger:passengers){
            Ticket ticket = passenger.getTicket();
            if(ticket == null || !ticket.isValid()){
                tabSize++;
            }
        }
        int index = 0;
        Passenger[] passengers1 = new Passenger[tabSize];
        for (Passenger passenger:passengers){
            Ticket ticket = passenger.getTicket();
            if(ticket == null || !ticket.isValid()){
                passengers1[index] = passenger;
                index++;
            }
        }
        return passengers1;
    }
}
