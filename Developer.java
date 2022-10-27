public class Developer extends Employee {
private String grades;

    public Developer() {
    }

    @Override
    public String goToDayOff() {
        return  "По семейным обстоятельствам!!";
    }

    public Developer(String fio, int age, int salary, String grades) {
        super(fio, age, salary);
        this.grades = grades;
    }

    public String getGrades() {
        return grades;
    }

    public void setGrades(String grades) {
        this.grades = grades;
    }
    @Override
    public String goToVocation() {
        return "I am going to bootcamp";
    }
    @Override
    void info() {
        super.info();
        System.out.println("grade: " + getGrades() + "\n" + "Я пишу код !" + "\n" + "Причина выходного: " + goToDayOff()  +  "\n================");
    }


}


//+ "\n"+ "Куда в отпуск: " + goToVocation()


