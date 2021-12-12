public class CommissionedClassification implements PaymentClassification {

    private String itsCode;
    private double itsSalary;
    private double itsCommissionRate;

    public CommissionedClassification(double salary, double commissionRate){
        this.itsSalary = salary;
        this.itsCommissionRate = commissionRate;
        this.itsCode = "Commission";
    }

    @Override
    public double calculatePay() {
        // 계산 생략
        double commission = itsCommissionRate;
        return itsSalary + commission;
    }

    public double getSalary(){
        return itsSalary;
    }

    public double getRate(){
        return itsCommissionRate;
    }

    @Override
    public String getCode() {
        return itsCode;
    }

}
