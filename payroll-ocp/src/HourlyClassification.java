import java.util.Calendar;

public class HourlyClassification implements PaymentClassification {

    private double itsRate;
    private String itsCode;
//    Map<Calendar, TimeCard> itsTimeCards = new HashMap<Calendar, TimeCard>();

    public HourlyClassification(double hourlyRate){
        this.itsRate = hourlyRate;
        this.itsCode = "Hourly Rate";
    }

    public double getRate(){
        return itsRate;
    }

//    public void addTimeCard(TimeCard tc){
//        itsTimeCards.put(tc.getDate(), tc);
//    }
//
//    public TimeCard getTimeCard(Calendar date){
//        return itsTimeCards.get(date);
//    }
//
//    private double calculatePayForTimeCard(TimeCard tc){
//        double hours = tc.getHours();
//        double overtime = Math.max(0.0, hours - 8.0);
//        double straightTime = hours - overtime;
//        return straightTime * itsRate + overtime * itsRate * 1.5;
//    }


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