public class MonthlySchedule implements PaymentSchedule {
    public String getSchedule(){
        return "last Friday of every month";
    }
}
