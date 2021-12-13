public class CommissionedClassification implements PaymentClassification {

    private String itsCode;
    private double itsSalary;
    private double itsCommissionRate;
//    Map<Calendar, SalesReceipt> itsReceipts = new HashMap<Calendar, SalesReceipt>();

    public CommissionedClassification(double salary, double commissionRate){
        this.itsSalary = salary;
        this.itsCommissionRate = commissionRate;
        this.itsCode = "Commission";
    }

    @Override
    public double calculatePay() {
        // 계산 생략
        double commission = itsCommissionRate;

//        Set<Calendar> keys = itsReceipts.keySet();
//        Iterator<Calendar> iter = keys.iterator();
//
//        while(iter.hasNext()){
//            Calendar key = (Calendar)iter.next();
//            SalesReceipt receipt = itsReceipts.get(key);
//
//            Calendar dt1, dt2;
//            dt1 = pc.getPayPeriodStartDate();
//            dt2 = pc.getPayPeriodEndDate();
//            if(key.compareTo(dt1)>0 && key.compareTo(dt2)<0){
//                commission += receipt.getAmount() * itsCommissionRate;
//            }
//        }

        return itsSalary + commission;
    }

    public double getSalary(){
        return itsSalary;
    }

    public double getRate(){
        return itsCommissionRate;
    }

//    public SalesReceipt getReceipt(Calendar saleDate){
//        return itsReceipts.get(saleDate);
//    }
//
//    public void addReceipt(SalesReceipt receipt){
//        itsReceipts.put(receipt.getSaleDate(), receipt);
//    }

    @Override
    public String getCode() {
        return itsCode;
    }

}
