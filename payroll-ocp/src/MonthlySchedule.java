import java.util.Calendar;
import java.util.Date;

public class MonthlySchedule implements PaymentSchedule {
    public String getSchedule(){
        return "last Friday of every month";
    }

//    @Override
//    public boolean isPayDate(Calendar date) {
//        // 월의 마지막날을 반환
////        System.out.println("isPayDate");
//        return isLastDayOfMonth(date);
//    }
//
//    public boolean isLastDayOfMonth(Calendar date){
////        System.out.println("isLastDayOfMonth");
//        Date d = date.getTime();
//        Calendar c = Calendar.getInstance();
//        c.setTime(d);
//        int m1 = c.get(Calendar.DAY_OF_MONTH);
//        c.add(Calendar.DAY_OF_MONTH, 1);
//        int m2 = c.get(Calendar.DAY_OF_MONTH);
//        return (m1 != m2);
//    }

//    @Override
//    public Calendar getPayPeriodStartDate(Calendar payPeriodEndDate) {
//        System.out.println("getPayPeroidStartDate");
//        Date d = payPeriodEndDate.getTime();
//        Calendar c = Calendar.getInstance();
//        c.setTime(d);
//        int lastDayOfMonth = c.getTime().getDate();
//        c.add(Calendar.DAY_OF_MONTH, -(lastDayOfMonth -1));
//        return c;
//    }

}
