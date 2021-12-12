public class AddSalariedEmployee extends AddEmployeeTransaction{

    private double itsSalary;

    public AddSalariedEmployee(int empid, String name, String address, double salary) {
        super(empid, name, address);
        itsSalary = salary;
    }

    public PaymentClassification getClassification(){
        return new SalariedClassification(itsSalary);
    }

    public PaymentSchedule getSchedule(){
        return new MonthlySchedule();
    }
}