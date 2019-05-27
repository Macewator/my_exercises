package exercises.wage.calculator;

public class Employee {

    private String firstName;
    private String lastName;
    private double monthPayment;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getMonthPayment() {
        return monthPayment;
    }

    public void setMonthPayment(double monthPayment) {
        this.monthPayment = monthPayment;
    }

    public Employee(String firstName, String lastName, double monthPayment) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthPayment = monthPayment;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", monthPayment=" + monthPayment +
                '}';
    }
}
