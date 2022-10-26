public abstract class Employee {
    private String fio;
    private int age;
    private int salary;

    public Employee() {
    }

    public Employee(String fio, int age, int salary) {
        this.fio = fio;
        this.age = age;
        this.salary = salary;
    }
      public abstract String goToDayOff ();

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    void info() {
        System.out.println("name: " + getFio() + "\n" + "age: " + getAge() + "\n" + "salary: " + getSalary ());

    }

}




