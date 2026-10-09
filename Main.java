public class Main {
    public static void main(String[] args) {


        Student[] students = new Student[6];

        students[0] = new UndergraduateStudent("Amina", 3.7);
        students[1] = new UndergraduateStudent("Eric", 3.5);
        students[2] = new GraduateStudent("Grace", 40, 24000);
        students[3] = new PostDoctoralFellow("Dr. Paul", 36000);
        students[4] = new ExchangeStudent("Marie", true);
        students[5] = new StudentAthlete("Jean", 2);

        double totalPayroll = 0;

        for (int i = 0; i < students.length; i++) {
            double pay = students[i].calculateMonthlyStipend();   
            System.out.println(students[i].name + " gets $" + pay);
            totalPayroll = totalPayroll + pay;
        }

        System.out.println("Total payroll: $" + totalPayroll);
    }
}