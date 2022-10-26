public class Developer extends Employee {
private String grades;

    public Developer() {
    }

    @Override
    public String goToDayOff() {
        return  "Поеду в горы !!!";
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
    void info() {
        super.info();
        System.out.println("grade: " + getGrades() + "\n" + "Я пишу код !" + "\n" + "Причина отпуска: " + goToDayOff() +  "\n================");
    }
}





