public class SalariedClassification implements PaymentClassification {
    public double itsSalary;
    public String itsCode;

    public SalariedClassification(double salary){
        this.itsSalary = salary;
        this.itsCode = "Salary";
    }

    public double calculatePay(){
        return itsSalary;
    }

    public String getCode() {
        return itsCode;
    }
}
