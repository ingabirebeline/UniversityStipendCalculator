public class PostDoctoralFellow extends Student {
    double yearlyResearchGrant;

    PostDoctoralFellow(String name, double yearlyResearchGrant) {
        super(name);
        this.yearlyResearchGrant = yearlyResearchGrant;
    }

    @Override
    double calculateMonthlyStipend() {
        return 3000 + (yearlyResearchGrant / 12);
    }
}