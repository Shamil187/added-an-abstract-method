public class Ceo extends Manager{
    private boolean hasCompanyCar;

    public Ceo() {
    }
    public Ceo(String fio, int age, int salary, boolean hasStocks, boolean hasCompanyCar) {
        super(fio, age, salary, hasStocks);
        this.hasCompanyCar = hasCompanyCar;
    }

    public boolean isHasCompanyCar() {
        return hasCompanyCar;
    }

    public void setHasCompanyCar(boolean hasCompanyCar) {
        this.hasCompanyCar = hasCompanyCar;
    }
    @Override
    public String goToDayOff() {
        return  "Встречи вне офиса!!";
    }
    @Override
    public String goToVocation() {
        return "I am going to Los Angeles";
    }
    public String toString() {
        return "name: " + getFio() + "\n" +
                "age: " + getAge() + "\n" +
                "salary: " + getSalary() + "\n" + "Акции: " + isHasStocks() + "\n" +  "Халявная машина: " + isHasCompanyCar() + "\n" + "Я работаю над IPO"+ "\n" + "Причина выходного: "  + goToDayOff() ;
    }


}

// + "\n"+ "Куда в отпуск: " + goToVocation()