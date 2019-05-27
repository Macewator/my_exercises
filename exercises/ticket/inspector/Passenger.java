package exercises.ticket.inspector;

public class Passenger {

    private String firstName;
    private String lastName;
    private Ticket ticket;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Passenger(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Imie pasażera: " + firstName +
                ", nazwisko pasażera: " + lastName +
                ", " + ticket;
    }
}
