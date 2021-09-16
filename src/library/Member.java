package library;

public class Member {
    private String memberName;
    private int memberID;
    private long memberBirthday;
    int numOfBorrowed,numOfMember;
    Book [] bookBorrowed= new Book[5];
    int bookborrowed_ID = -1;

    public Member(int index ){
        this.memberID= index;
    }
    public Member(String memberName, long memberBirthday,int numOfMember) {
        this.memberName = memberName;
        this.memberBirthday = memberBirthday;
        this.memberID= numOfMember;
        for (int i=0 ; i<5 ;i++){
            bookBorrowed[i]= new Book(-1);
        }
        numOfBorrowed =0 ;
        }
    public int getMemberID() {
        return memberID;
    }
    public String getMemberName() {
        return memberName;
    }
    public long getMemberBirthday() {
        return memberBirthday;
    }

    public int getNumOfBorrowed() {
        return numOfBorrowed;
    }

    public Book getBookBorrowded(int index ){
        return bookBorrowed[index];
    }

    public Book[] getAllBookBorrowed() {
        return bookBorrowed;
    }

    public Book getBookBorrowed(int index ) {
        return  bookBorrowed[index];
    }

    public int getBookborrowed_ID() {
        return bookborrowed_ID;
    }

    public void setBookborrowed_ID(int bookborrowed_ID) {
        this.bookborrowed_ID = bookborrowed_ID;
    }

    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public void setMemberBirthday(long memberBirthday) {
        this.memberBirthday = memberBirthday;
    }

    public void setBookBorrowed(Book book, int index) {
        bookBorrowed [index ]=book ;
    }

    public void setNumOfBorrowed(int numOfBorrowed) {
        this.numOfBorrowed = numOfBorrowed;
    }

    public Integer searchBookBorowded(int bookID) {
        Integer index =null;
        for (int i = 0; i <= numOfBorrowed; i++) {
            if (bookBorrowed[i].getBookID() == bookID)
              index = i;
            break;
        }
            return index;
    }
    public boolean deleteBookBorrowed (int bookID) {
        Integer index = searchBookBorowded(bookID);
        if (index == null ) return false;
        else{
                bookBorrowed[index].setBookID(0);
        return true;
            }
    }


}
