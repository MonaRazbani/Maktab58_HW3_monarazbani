package library;
import java.util.Scanner;

public class Library {

    private Book[] listOfBook = new Book[50];
    private Member[] listOfMember = new Member[50];
    private int  numOfBook , numOfMember, numOfAllBook ;


    public void addBook(String bookName, int index) {
        if (numOfAllBook < 50) {
            listOfBook[numOfBook] = new Book(numOfBook, bookName, index);
            numOfAllBook = numOfAllBook + index;
            System.out.println("Done! : book name :  " + listOfBook[numOfBook].getNameBook() + "  ID :" + listOfBook[numOfBook].getBookID() + "\n *******\n ");
            numOfBook++;
        } else {
            System.out.println("sorry we can not insert new book in library :(");
        }
    }

    public void addMember(String memberName, long birthday) {
        if (numOfMember < 50) {
            listOfMember[numOfMember] = new Member(memberName, birthday,numOfMember);
            System.out.println("Done! : member name :  " + listOfMember[numOfMember].getMemberName() + "  ID :" + listOfMember[numOfMember].getMemberID() + "\n *******\n ");
            numOfMember++;
        } else System.out.println("sorry We can not register a new member :(");
    }

    public void getBook(int bookID, int memberID) {
        if (listOfMember[memberID].getNumOfBorrowed()<5) {
            if (listOfBook[bookID].getIndex() > listOfBook[bookID].getNumOfBorrowed() || listOfBook[bookID].getMember() == null) {
                boolean isExisted = true;
                for (int j = 0; j < listOfMember[memberID].getNumOfBorrowed(); j++) {
                    if (listOfMember[memberID].getBookBorrowded(j).getBookID() == bookID) {
                        isExisted = false;
                    }
                }
                if (isExisted) {
                    listOfBook[bookID].setMember(listOfMember[memberID]);
                    int index = 0;Integer count=0 ;
                    while (count<5 ){
                        if (listOfMember[memberID].bookBorrowed[count].getNameBook() == null){
                            index = count ;
                        break; }
                        else count++;
                    }
                    listOfMember[memberID].setNumOfBorrowed(listOfMember[memberID].getNumOfBorrowed()+1);
                    listOfMember[memberID].setBookBorrowed(listOfBook[bookID], index);
                    listOfBook[bookID].setNumOfBorrowed();
                    listOfBook[bookID].setMember(listOfMember[memberID]);
                    System.out.println("Done!" + listOfMember[memberID].getMemberName() + "  borrows : " + listOfBook[bookID].getNameBook());

                } else System.out.println("you Already borrowed this book ! ");
            } else
                System.out.println("NotAvailable :book  " + listOfBook[bookID].getNameBook() + " ID: " + listOfBook[memberID].getBookID() + "\n");
        }

        else
            System.out.println("MaxReached :  member: " + listOfMember[memberID].getMemberName() + " ID: " + listOfMember[memberID].getMemberID());

    }

    public void deliverbook(int bookID, int memberID) {

        if (listOfMember[memberID].deleteBookBorrowed(bookID)) {
            listOfBook[bookID].deletedMember();
            System.out.println("Done! " + listOfMember[memberID].getMemberName() + "  delivers : " + listOfBook[bookID].getNameBook());
        } else
            System.out.println(listOfMember[memberID].getMemberName() + "  has not borrowed  : " + listOfBook[bookID].getNameBook());

    }

    public void displayBooks() {
        for (int i = 0; i < numOfBook; i++) {
            System.out.println("book : [" + listOfBook[i].getNameBook() + "]    [" + listOfBook[i].getBookID() + "]   count: [" + listOfBook[i].getIndex() + "]\n");
        }
    }

    public void displayMember() {
        for (int i = 0; i < numOfMember; i++) {
            System.out.println("Member Name : [" + listOfMember[i].getMemberName() + "] Member ID:  [" + listOfMember[i].getMemberID() + "]   books : ");
            for (int j = 0; j < 5; j++) {
                if (listOfMember[i].bookBorrowed[i].getNameBook()!=null) {
                    System.out.println(" [" + listOfMember[i].bookBorrowed[j].getNameBook() + "] [" + listOfMember[i].bookBorrowed[j].getBookID() + "]");
                } else
                    System.out.println("     ------");
            }
        }
    }
}

