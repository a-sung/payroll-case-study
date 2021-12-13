public abstract class AddEmployeeTransaction implements Transaction {

    private int itsEmpid;
    private String itsName;
    private String itsAddress;

    public AddEmployeeTransaction(int empid, String name, String address) {
        itsEmpid = empid;
        itsName = name;
        itsAddress = address;
    }

    public abstract PaymentClassification getClassification();

    public abstract PaymentSchedule getSchedule();

    // 이 Transaction의 동작에는 위의 두 가지 abstract method의 구현이 필요
    // 의존성을 이용한, 확장에 용이하고 변경에는 닫혀있는 Template method pattern

    @Override
    public void execute() {
        System.out.println("Add Employee: " + itsEmpid + ", " + itsName);
        PaymentClassification pc = getClassification();
        PaymentSchedule ps = getSchedule();
        PaymentMethod pm = new HoldMethod();

        Employee e = new Employee(itsEmpid, itsName, itsAddress);

        e.setClassification(pc);
        e.setSchedule(ps);
        e.setMethod(pm);

        PayrollDatabase.addEmployee(e);

    }

}
