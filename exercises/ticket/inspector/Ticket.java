package exercises.ticket.inspector;

import java.time.Duration;
import java.time.LocalDateTime;

public class Ticket {

    private LocalDateTime ticketCheck;
    private int ticketValidTime;

    public LocalDateTime getTicketCheck() {
        return ticketCheck;
    }

    public void setTicketCheck(LocalDateTime ticketCheck) {
        this.ticketCheck = ticketCheck;
    }

    public int getTicketValidTime() {
        return ticketValidTime;
    }

    public void setTicketValidTime(int ticketValidTime) {
        this.ticketValidTime = ticketValidTime;
    }

    public Ticket(LocalDateTime ticketCheck, int ticketValidTime) {
        this.ticketCheck = ticketCheck;
        this.ticketValidTime = ticketValidTime;
    }

    public boolean isValid(){
        Duration duration = Duration.between(ticketCheck,LocalDateTime.now());
        return ticketValidTime>duration.toMinutes();
    }

    @Override
    public String toString() {
        return "Bilet nieważny, okres ważności wynosił: " + ticketValidTime + " min" +
                ", czas, który upłynął: " + Duration.between(ticketCheck,LocalDateTime.now()).toMinutes() +
                " min";
    }
}
