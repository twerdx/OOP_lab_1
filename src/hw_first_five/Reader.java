package hw_first_five;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reader {
    String FIO;
    int reader_Id;
    String faculty;
    String birth_Date;
    String phone_Number;
    List<String> books;
    String book;

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getBirth_Date() {
        return birth_Date;
    }

    public void setBirth_Date(String birth_Date) {
        this.birth_Date = birth_Date;
    }

    public String getPhone_Number() {
        return phone_Number;
    }

    public void setPhone_Number(String phone_Number) {
        this.phone_Number = phone_Number;
    }

    public int getReader_Id() {
        return reader_Id;
    }

    public void setReader_Id(int reader_Id) {
        this.reader_Id = reader_Id;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }


    public Reader(String FIO, int reader_Id,
                  String faculty, String birth_Date,
                  String phone_Number){
        this.FIO = FIO;
        this.reader_Id = reader_Id;
        this.faculty = faculty;
        this.birth_Date = birth_Date;
        this.phone_Number = phone_Number;
        this.books = new ArrayList<>();
    }
//    private String[] fillBooks(){
//        String[] booksArray = new String[books.size()];
//        for (int i = 0; i < books.size(); i++) {
//            booksArray[i] = books.get(i);
//        }
//        return booksArray;
//    }
    public String takeBook(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name the book youre taking ");
        book = scanner.nextLine();
        if (book != null){
            System.out.println("You took "+book+" book");
            books.add(book);
        }else{
            System.out.println("You must name the book");
        }
        return book;
    }
    public List<String> allBooks(){
        return books;
    }

    public String returnBook(){
        Scanner scanner = new Scanner(System.in);
        String bookToReturn = scanner.nextLine();
        if (books.contains(bookToReturn)){
            books.remove(bookToReturn);
            System.out.println("Youve returned "+ bookToReturn + " book");
        }else{
            System.out.println("You didnt took this book");
        }

        return bookToReturn;
    }
}
