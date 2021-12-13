public class Employee {

    private int itsEmpid;
    private String itsName;
    private String itsAddress;
    private PaymentClassification itsClassification;
    private PaymentSchedule itsSchedule;
//    private PaymentMethod itsPaymentMethod;

    public Employee(int empid, String name, String address){
        itsEmpid = empid;
        itsName = name;
        itsAddress = address;
    }

    public void setName(String name){
        this.itsName = name;
    }

    public void setAddress(String address){
        this.itsAddress = address;
    }

    public void setSchedule(PaymentSchedule schedule){
        this.itsSchedule = schedule;
    }

    public void setClassification(PaymentClassification classification){
        this.itsClassification = classification;
    }

    public int getEmpid(){
        return itsEmpid;
    }

    public String getName(){
        return itsName;
    }

    public String getAddress(){
        return itsAddress;
    }

    public PaymentClassification getClassification(){
        return itsClassification;
    }

    public PaymentSchedule getSchedule(){
        return itsSchedule;
    }

}