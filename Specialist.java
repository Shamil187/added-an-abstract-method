public class Specialist extends Employee {
    private int levels;

    public Specialist() {
    }

    @Override
    public String goToDayOff() {
        return  "Отпуск нужен потому что хочу на рыбалку!!!";
    }

    public Specialist(String fio, int age, int salary, int levels) {
        super(fio, age, salary);
        this.levels = levels;
    }

    public int getLevels() {
        return levels;
    }

    public void setLevels(int levels) {
        this.levels = levels;
    }

//    public void goToDayOff () {
//        System.out.println("Отпуск нужен!");
//    }



    @Override
    void info() {
        super.info();
        System.out.println("level: " + getLevels() + "\n" + "Я работаю с клиентами!!" + "\n"+ "Причина отпуска: " + goToDayOff()  + "\n==========");

    }
}


