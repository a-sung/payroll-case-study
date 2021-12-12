public class AddHourlyEmployee extends AddEmployeeTransaction {

    private double itsHourlyRate;

    public AddHourlyEmployee(int empid, String name, String address, double hourlyRate) {
        super(empid, name, address);
        itsHourlyRate = hourlyRate;
    }

    @Override
    public PaymentClassification getClassification() {
        return new HourlyClassification(itsHourlyRate);
    }

    @Override
    public PaymentSchedule getSchedule() {
        return new WeeklySchedule();
    }

}