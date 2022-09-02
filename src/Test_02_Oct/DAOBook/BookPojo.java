package Test_02_Oct.DAOBook;

public class BookPojo {
    int id ;
    String name;
    String publisher;
    float price;
    String author;

    public BookPojo(int id, String name, String publisher, float price, String author) {
        this.id = id;
        this.name = name;
        this.publisher = publisher;
        this.price = price;
        this.author = author;
    }

    public BookPojo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "[" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", publisher='" + publisher + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                ']';
    }
}
