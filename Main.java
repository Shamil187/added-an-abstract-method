public class Main {
    public static void main(String[] args) {
        Specialist Harry = new Specialist();
        Harry.setFio("Harry");
        Harry.setAge(32);
        Harry.setLevels(50000);
        Harry.setLevels(2);

        Specialist Olive = new Specialist("Olive", 24, 55000,3);
        Specialist Amelia = new Specialist("Amelia", 30, 60000,4);

        Developer Jack = new Developer("Jack", 45, 40000,"midl");
        Developer Thomas = new Developer("Thomas", 49, 45000,"midl");
        Developer Jacob = new Developer("Jacob", 47, 54000,"midl");
        Developer Jessica = new Developer("Jessica", 23, 60000, "senior");

        Manager William = new Manager("William", 54, 32232000,true);
        Manager Sophie = new Manager("Sophie", 45, 77232000,false);

        Ceo James = new Ceo("James",35,990000,true,true);
        Harry.goToDayOff();
        Harry.info();
        Olive.info();
        Amelia.info();
        Jack.info();
        Thomas.info();
        Jacob.info();
        Jessica.info();
        William.info();
        Sophie.info();
        System.out.println(James);

    }
}

//Задание
//        Программа должна содержать классы Employee,Specialist,Developer,Manager,CEO,
//        которые должны быть наследованы определенным образом.
//        У каждого сотрудника есть ФИО,возраст и заработная плата.
//        У специалистов есть уровни(int levels),у
//        разработчиков есть ранги (String grades="Middle"),
//        у менеджеров есть акции(boolean hasStocks),
//        у исполнительного директора есть служебная машина(boolean hasCompanyCar).
//        Исполнительный директор является менеджером!
//        В каждом классе кроме Main должны быть все геттеры и сеттеры,
//        2конструктора(пустой и со всеми полями)и метод print()который распечатывает все поля класса.
//        Также необходимо реализовать следующие методы,которые распечатывают соответствующую фразу
//        работника на ваше усмотрение:
//        1)Специалисты могут работать с клиентами-метод workWithClients();
//        2)Разработчики пишут код-метод writeCode();
//        3)Менеджеры разрабатывают процедуры-метод writeProcedures();
//        4)CEO работает над IPO-метод goPublic();
//        Пример распечатки фразы работника:"I am writing my awesome algorithm!"
//        В классе Main необходимо создать 3-х,специалистов,4-х разработчиков,
//        2-х менеджеров и 1-го CEO,распечатать все поля каждого объекта(print)и
//        вызвать уникальные методы каждого объекта.