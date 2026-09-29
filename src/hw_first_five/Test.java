package hw_first_five;

import hw_second_five.Appliance;
import hw_second_five.Candy;

public class Test {
    public static void main(String[] args) {
//        /*задание 1*/
//        hw_first_five.Phone phone = new hw_first_five.Phone("0700111111", "Iphone", 150);
//        hw_first_five.Phone phone1 = new hw_first_five.Phone("0700222222", "Samsung", 145);
//        System.out.println("First phone "+ phone.getModel()+ " " +
//              " "+ phone.getWeight()+ " " +phone.getNumber()+
//             " "+ phone.receiveCall("Папа", "07000000"));
//      phone1.sendMessage("07000000","0700333333");
//        /*задание 2*/
//        Person person1 = new hw_first_five.Person();
//        Person person = new hw_first_five.Person("Адела", 19);
//        System.out.println(person.move());
//        System.out.println(person.talk());
//        /*задание 3*/
//        Matrix matrix1 = new Matrix(2, 2);
//        matrix1.setElement(0, 0, 1);
//        matrix1.setElement(0, 1, 2);
//        matrix1.setElement(1, 0, 3);
//        matrix1.setElement(1, 1, 4);
//        Matrix matrix2 = new Matrix(2, 2);
//        matrix2.setElement(0, 0, 5);
//        matrix2.setElement(0, 1, 6);
//        matrix2.setElement(1, 0, 7);
//        matrix2.setElement(1, 1, 8);
//
//        System.out.println("Первая матрица:");
//        matrix1.print();
//
//        System.out.println("Вторая матрица:");
//        matrix2.print();
//
//        Matrix sum = matrix1.sum(matrix2);
//
//        System.out.println("Сумма матриц:");
//        sum.print();
//
//        Matrix multiplied = matrix1.multiply(2);
//
//        System.out.println("Матрица, умноженная на 2:");
//        multiplied.print();

//      /*задание 4*/
//        Reader reader1 = new Reader("Иванов Иван Иванович", "1238",
//                "Бизнес", "01.01.2000", "07000000");
//        Reader reader2 = new Reader("Петров Петр Петрович", "48651",
//                "Экономика", "02.02.2001", "071111111");
//        Reader reader3 = new Reader("Сидорова Анна Сергеевна", "894651",
//                "Педиатрия", "03.02.2005", "07010101");
//        reader1.printInfo();
//        reader2.printInfo();
//        reader3.printInfo();
//        reader1.takeBook();
//        reader1.returnBook();
//        reader2.takeBook();
//        reader2.returnBook();
//        reader3.takeBook();
//        reader3.returnBook();
//
//        /*задание 5*/
//        Driver driver = new Driver("Иванов Иван Иванович",
//                "5 лет");
//        Engine engine = new Engine("150", "Toyota");
//        Car car = new Car("Toyota Camry", "Седан",
//                1500, driver, engine);
//        System.out.println(car);
//        car.start();
//        car.turnRight();
//        car.turnLeft();
//        car.stop();
//*задание 7*/
//
//        Candy[] gift = {
//                new Candy("Шоколадная", 50, 25),
//                new Candy("Карамелька", 20, 15),
//                new Candy("Ириска", 30, 12)
//        };
//
//        System.out.println("Конфеты в подарке:");
//        Candy.printAll(gift);
//
//        double totalWeight = Candy.calculateWeight(gift);
//
//        System.out.println("Общий вес подарка: "
//                + totalWeight + " г");
//
//        Candy.sortByWeight(gift);
//
//        System.out.println("Конфеты после сортировки по весу:");
//        Candy.printAll(gift);
//
//        System.out.println("Конфеты с содержанием сахара");
//
//        Candy.findBySugar(gift, 12, 20);
        Appliance[] appliances = {
                new Appliance("Телевизор", 120, true),
                new Appliance("Холодильник", 300, true),
                new Appliance("Микроволновка", 1000, true),
                new Appliance("Лампа", 60, false),
                new Appliance("Пылесос", 1500, false)
        };

        System.out.println("Электроприборы:");
        Appliance.printAll(appliances);


        System.out.println("Общая потребляемая мощность: "
                + Appliance.calculatePower(appliances) + " Вт");

        Appliance.sortByPower(appliances);

        System.out.println("Приборы после сортировки по мощности:");
        Appliance.printAll(appliances);

        System.out.println("Приборы с мощностью:");
        Appliance.findByPower(appliances, 100, 1000);
    }
}
