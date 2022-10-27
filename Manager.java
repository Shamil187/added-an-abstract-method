public class Manager extends Employee {
    private boolean hasStocks;

    public Manager() {
    }

    @Override
    public String goToDayOff() {
        return  "Заболел";
    }

    public Manager(String fio, int age, int salary, boolean hasStocks) {
        super(fio, age, salary);
        this.hasStocks = hasStocks;
    }

    public boolean isHasStocks() {
        return hasStocks;
    }

    public void setHasStocks(boolean hasStocks) {
        this.hasStocks = hasStocks;
    }

    @Override
    void info() {
        super.info();
        System.out.println("Акции: " + isHasStocks() + "\n" + "Я разрабатываю процедуры!" + "\n" + "Причина выходного: " + goToDayOff()  + "\n================");
    }

    @Override
    public String goToVocation() {
        return "I am going to England";
    }
}


//+ "\n"+ "Куда в отпуск: " + goToVocation()






