package library;

public class Book {

    private int bookID;
    private String nameBook;
    private int index, numOfBorrowed;
    private Member member;
    boolean landed = false;

    public Book(int bookID) {
        this.bookID = bookID;
    }

    public Book(int bookID, String nameBook, int index) {
        this.bookID = bookID;
        this.nameBook = nameBook;
        this.index = index;

    }


    public int getBookID() {
        return bookID;
    }

    public String getNameBook() {
        return nameBook;
    }

    public int getIndex() {
        return index;
    }

    public int getNumOfBorrowed() {
        return numOfBorrowed;
    }

    public Member getMember() {
        return member;
    }

    public boolean isLanded() {
        return landed;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setNumOfBorrowed() {
        this.numOfBorrowed++;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public void setLanded(boolean landed) {
        this.landed = landed;
    }

    public void deletedMember() {
        this.member = null;
    }

    public int getnumOfBorrowed() {
        return numOfBorrowed;
    }
}