package start.oop.gb;

import java.util.Scanner;

/*
Определить класс Reader, хранящий такую информацию о пользователе библиотеки:
ФИО,
номер читательского билета,
факультет,
дата рождения,
телефон.

Методы (экземпляра, без слова static) takeBook(), returnBook().

Разработать программу, в которой создается массив объектов данного класса.

Перегрузить методы takeBook(), returnBook():
takeBook, который будет принимать количество взятых книг.
Выводит на консоль сообщение "Петров В. В. взял 3 книги".

takeBook, который будет принимать переменное количество названий книг.
Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".

takeBook, который будет принимать переменное количество
(Тип... parameterName) объектов класса Book (создать новый класс, содержащий имя и автора книги).
Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".

Аналогичным образом перегрузить метод returnBook().
Выводит на консоль сообщение "Петров В. В. вернул книги: Приключения, Словарь, Энциклопедия".
Или "Петров В. В. вернул 3 книги".
 */
public class Reader {

    String name;
    String readerTicket;
    String faculty;
    String dateOfBirth;
    String telefonNumber;

    public Reader(String name, String readerTicket, String faculty, String dateOfBirth, String telefonNumber) {
        this.name = name;
        this.readerTicket = readerTicket;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.telefonNumber = telefonNumber;
    }

    @Override
    public String toString() {
        return "Читатель {" +
                "ФИО:'" + name + '\'' +
                ", Читательский билет:'" + readerTicket + '\'' +
                ", Факультет:'" + faculty + '\'' +
                ", Дата рождения:'" + dateOfBirth + '\'' +
                ", Номер телефона:'" + telefonNumber + '\'' +
                '}';
    }

    public void takeBook() {

    }

    public void returnBook() {

    }

    public void takeBook(int quantity) {
        System.out.println("Петров В.В. взял " + quantity + " книги");
    }

    public void takeBook(String genre) {
        System.out.println("Петров В.В. взял книги: " + genre);
    }

    public void returnBook(String genre) {
        System.out.println("Петров В.В. вернул книги: " + genre);
    }

    public void returnBook(int quantity) {
        System.out.println("Петров В.В. вернул " + quantity + " книги");
    }


    public static void main(String[] args) {
        Reader reader1 = new Reader("Петров В.В.", "111111", "econom", "19.01.1990", "89091111111");
        System.out.println(reader1);
        System.out.println();

        Scanner sc = new Scanner(System.in);

        reader1.takeBook(3);
        reader1.takeBook("Приключения, Словарь, Энциклопедия");
        System.out.println("Введите число взятых читателем книг: ");
        int bufTakeBook = sc.nextInt();
        System.out.println();

        reader1.returnBook("Приключения, Словарь");
        reader1.returnBook(2);
        System.out.println("Введите число возвращенных читателем книг: ");
        int bufReturnBook = sc.nextInt();

        int resultBook = bufTakeBook - bufReturnBook;
        if (resultBook >= 1) {
            System.out.println("Петров В.В. должен вернуть " + resultBook + " книгу");
        }
    }
}