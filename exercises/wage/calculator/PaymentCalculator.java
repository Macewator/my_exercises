package exercises.wage.calculator;

public class PaymentCalculator {

    public static final int  MONTH_ZUS = 1000;

    public static void main(String[] args) {
        Employee employee = new Employee("Zenon", "Kowalski", 3750);

        System.out.println(nettoYearPayment(employee));
        System.out.println(bruttoYearPayment(employee));
    }

    public static double nettoYearPayment(Employee employee){
        double brutto = employee.getMonthPayment();
        double yearNetto = (brutto - (0.2 * brutto))*12;
        return yearNetto;
    }

    public static double bruttoYearPayment(Employee employee){
        double brutto = employee.getMonthPayment();
        double yearBrutto = 12*(brutto + MONTH_ZUS);
        return yearBrutto;
    }
}
