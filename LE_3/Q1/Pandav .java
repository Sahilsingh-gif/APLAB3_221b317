class Pandav extends Bharatvanshi {

    public Pandav(String name) {
        super(name);
    }

    @Override
    public String fight() {
        return name + " is a skilled fighter!";
    }

    @Override
    public String obey() {
        return name + " is obedient.";
    }
}
