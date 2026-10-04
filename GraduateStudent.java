double taHours;
    double yearlyResearchGrant;

    GraduateStudent(String name, double taHours, double yearlyResearchGrant) {
        super(name);
        this.taHours = taHours;
        this.yearlyResearchGrant = yearlyResearchGrant;
    }

    @Override
    double calculateMonthlyStipend() {
        double taPay = taHours * 25;                     
        double monthlyGrant = yearlyResearchGrant / 12;  
        double total = 1200 + taPay + monthlyGrant;     
        return total;                                    
    }
}