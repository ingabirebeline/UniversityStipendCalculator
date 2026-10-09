public class UndergraduateStudent extends Student {
    double gpa;

    UndergraduateStudent(String name, double gpa) {
        super(name);
        this.gpa = gpa;
    }

    @Override
    double calculateMonthlyStipend() {
        double total = 500;          
        if (gpa > 3.5) {            
            total = total + 150;     
        }
        return total;                
    }
}