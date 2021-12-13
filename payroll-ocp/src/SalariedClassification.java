public class SalariedClassification implements PaymentClassification {

    public double itsSalary;
    public String itsCode;

    public SalariedClassification(double salary){
        this.itsSalary = salary;
        this.itsCode = "Salary";
    }

    @Override
    public double calculatePay(){
        return itsSalary;
    }

    @Override
    public String getCode() {
        return itsCode;
    }

}