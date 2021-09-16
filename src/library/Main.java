package library;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library myLibrary = new Library();
        Scanner scanner = new Scanner(System.in);
        int type, NumOfBook = 0, NumOfMember = 0, numOfAllBook = 0;


       outer: while (true) {
            System.out.println("type your operation\n Add book :1\n Add member :2\n Get book :3\n deliver book:4 \n stat book :5 \n member stat :6 \n exit :7 \n");
            type = scanner.nextInt();
            switch (type) {
                case (1): {
                    System.out.print("enter name of book : ");
                    String bookName = scanner.next();
                    System.out.print("enter number of book : ");
                    int indexBook  = scanner.nextInt();
                    myLibrary.addBook(bookName, indexBook);
                    break;
                }
                case (2): {
                    System.out.print("enter New member's name : ");
                    String memberName = scanner.next();
                    System.out.print("enter member's birthday EXP:1375'09'14 : ");
                    long birthday = scanner.nextInt();
                    myLibrary.addMember(memberName,birthday);
                    break;
                }
                case (3): {

                    System.out.println("enter Member's ID: ");
                    int memberID = scanner.nextInt();
                    System.out.println("Enter ID of Books : ");
                    int bookID = scanner.nextInt();
                    myLibrary.getBook(bookID, memberID);
                    break;
                }
                case (4): {
                    System.out.println("enter member's ID : ");
                    int memberID = scanner.nextInt();
                    System.out.println("enter ID of book  : ");
                    int bookID = scanner.nextInt();
                    myLibrary.deliverbook(bookID, memberID);
                   break;
                }
                case (5): {
                   myLibrary.displayBooks();
                    break;
                }
                case (6): {
                    myLibrary.displayMember();
                break;
                }
                case (7): {
                    break outer;
                }
                default: {
                    System.out.println("invalid code !");
                    break;

                }


            }
        }
    }
}