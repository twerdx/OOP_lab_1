import hw_first_five.Matrix;

public class Main {
    public static void main(String[] args) {
//        hw_first_five.Person person1 = new hw_first_five.Person();
//        hw_first_five.Person person = new hw_first_five.Person("anna", 19);
//        System.out.println(person.move());
//        System.out.println(person.talk());
//    }

//        Chef chef = new Chef(5);
//        Vegetable tomato = new Vegetable("Помидор", 200, 18);
//        Vegetable cucumber = new Vegetable("Огурец", 150, 15);
//        Vegetable carrot = new Vegetable("Морковь", 100, 35);
//        Vegetable potato = new Vegetable("Картофель", 200, 77);
//        Vegetable cabbage = new Vegetable("Капуста", 150, 27);
//        chef.addVegetable(tomato);
//        chef.addVegetable(cucumber);
//        chef.addVegetable(carrot);
//        chef.addVegetable(potato);
//        chef.addVegetable(cabbage);
//        System.out.println("Овощи для салата:");
//        chef.printVegetables();
//        System.out.println("Общая калорийность салата: " + chef.getTotalCalories() + " ккал");
//        System.out.println("Сортировка овощей по калорийности:");
//        chef.sortByCalories();
//        chef.printVegetables();
//        System.out.println();
//        chef.findVegetablesByCalories(15, 35);


//            Gift gift = new Gift(3);
//            gift.addCandy(new ChocolateCandy("Шоколадная", 50, 30, 100));
//            gift.addCandy(new Caramel("Карамель", 30, 20, 50));
//            gift.addCandy(new JellyCandy("Желейная", 40, 25, 70));
//            gift.getWeight();
//            gift.sortByWeight();
//            gift.findCandyBySugar();

//        Bouquet bouquet = new Bouquet(3, 2);
//        bouquet.addFlower(new Rose("Роза", 500, 50, 9));
//        bouquet.addFlower(new Tulip("Тюльпан", 300, 40, 7));
//        bouquet.addFlower(new Lily("Лилия", 600, 60, 8));
//        bouquet.addAccessory(new Accessory("Лента", 100));
//        bouquet.addAccessory(new Accessory("Упаковка", 200));
//        bouquet.sum();
//        bouquet.sortByFreshness();
//        bouquet.findFlowerByStemLength();
//        }

//
//        hw_first_five.Phone phone = new hw_first_five.Phone("0700111111", "Iphone", 150);
//        hw_first_five.Phone phone1 = new hw_first_five.Phone("0700222222", "Samsung", 145);
//        hw_first_five.Phone phone2 = new hw_first_five.Phone("0700333333", "Xiaomi", 142);
//        hw_first_five.Phone phone3 = new hw_first_five.Phone("0700333333","Xiaomi", 170);
//
//        System.out.println("First phone "+ phone.getModel()+ " " +
//                " "+ phone.getWeight()+ " " +phone.getNumber()+
//                " "+ phone.receiveCall("anna", "04654"));
//        phone1.sendMessage("0700111111","0700333333");
//        System.out.println("send message to:");
//        phone1.sendMessage(phone2.getNumber(), phone3.getNumber(), phone.getNumber());

        Matrix matrix = new Matrix();
        Matrix matrix1 = new Matrix();
        matrix.matrixFill();
        matrix1.matrixFill();
        matrix.matrixSum(matrix1.getMatrixIn());
    }}
//        hw_first_five.Reader reader = new hw_first_five.Reader(
//                "Иванов Иван Иванович",
//                10245,
//                "Факультет Информационных Технологий",
//                "15.05.2005",
//                "+7 (999) 123-45-67"
//        );
//        System.out.println(reader.takeBook());
//        System.out.println(reader.takeBook());
//        System.out.println(reader.takeBook());
//        System.out.println(reader.allBooks());
//        System.out.println(reader.returnBook());
        //        Driver driver = new Driver(
//                "Иванов Иван Иванович",
//                "5 лет"
//        );
//Engine engine = new Engine("150 л.с.", "Toyota");
//        Car car = new Car(
//                "Toyota Camry",
//                "Седан",
//                1500,
//                driver,
//                engine
//        );
//
//        System.out.println(car);
//
//        car.start();
//        car.turnRight();
//        car.turnLeft();
//        car.stop();
//        Biker biker = new Biker("Max", 3);
//        biker.addAmmunition(new Helmet("helmet",120,35 ));
//        biker.addAmmunition(new Jacket("jacket",122,40 ));
//        biker.addAmmunition(new Gloves("glove",100,45 ));
//        biker.sortByWeight();
//        biker.findAmmunitionByPrice();
//        biker.sum();

//        Playlist playlist = new Playlist();
//        playlist.fillFromConsole();
//        playlist.allTime();
//        playlist.sortByGenre();
//        playlist.findMusicByTime();



