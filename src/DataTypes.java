public class DataTypes {
    public static void main(String[] args) {
        int n = 1234567890;
        long nl = 1234567890L;

        double nD = 123.456;
        float nF = 123.456F;

        var salary = 1000;
        var pension = salary* 0.03;
        var totalSalary = salary - pension;
        System.out.println(salary);
        System.out.println(pension);
        System.out.println(totalSalary);

        var employeeName = "Anahí Salgado";
        System.out.println("EMPLOYEE: " + employeeName + " SALARY: " + totalSalary);
    }
}
