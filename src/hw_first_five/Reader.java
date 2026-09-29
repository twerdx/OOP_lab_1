package hw_first_five;

public class Reader {
    private String fullName;
    private String ticketNumber;
    private String faculty;
    private String birthDate;
    private String phone;
    public Reader(String fullName, String ticketNumber, String faculty,
                  String birthDate, String phone) {
        this.fullName = fullName;
        this.ticketNumber = ticketNumber;
        this.faculty = faculty;
        this.birthDate = birthDate;
        this.phone = phone;
    }
    public void takeBook() {
        System.out.println(fullName + " взял книгу в библиотеке.");
    }
    public void returnBook() {
        System.out.println(fullName + " вернул книгу в библиотеку.");
    }
    public void printInfo() {
        System.out.println("ФИО: " + fullName);
        System.out.println("Номер читательского билета: " + ticketNumber);
        System.out.println("Факультет: " + faculty);
        System.out.println("Дата рождения: " + birthDate);
        System.out.println("Телефон: " + phone);
    }
}