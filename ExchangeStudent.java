boolean highCostCountry;

    ExchangeStudent(String name, boolean highCostCountry) {
        super(name);
        this.highCostCountry = highCostCountry;
    }

    @Override
    double calculateMonthlyStipend() {
        double total = 700;
        if (highCostCountry) {
            total = total + 100;
        }
        return total;
    }
}