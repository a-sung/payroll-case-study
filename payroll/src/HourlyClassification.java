public class HourlyClassification implements PaymentClassification {

    private double itsRate;
    private String itsCode;

    public HourlyClassification(double hourlyRate){
        this.itsRate = hourlyRate;
        this.itsCode = "Hourly Rate";
    }

    public double getRate(){
        return itsRate;
    }

    @Override
    public double calculatePay() {
        double totalPay = 0;

        // 타임카드 생략...
        // 임의로 8시간 주5일 근무 기준 계산...
        totalPay = itsRate * 8 * 5;

        return totalPay;
    }

    @Override
    public String getCode() {
        return itsCode;
    }

}