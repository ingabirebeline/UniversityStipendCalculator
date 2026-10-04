class StudentAthlete extends Student {

    int seasonsPlayed;

    StudentAthlete(String name, int seasonsPlayed) {
        super(name);
        this.seasonsPlayed = seasonsPlayed;
    }

    @Override
    double calculateMonthlyStipend() {
        return 800 + (seasonsPlayed * 100);
    }
}