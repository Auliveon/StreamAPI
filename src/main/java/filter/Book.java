package filter;

public class Book {
    private String bookName;
    private int count;
    private long price;

    public Book(String bookName, int count, long price) {
        this.bookName = bookName;
        this.count = count;
        this.price = price;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", count=" + count +
                ", price=" + price +
                '}';
    }
}
