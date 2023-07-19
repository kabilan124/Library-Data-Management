class libraryItem {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    String Title;
    private int year;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

class book extends libraryItem {
    String Author;


}
class magazine extends libraryItem{
    int issues;
}
public class librarydatamanagement {
    public static void main(String[] args) {


        magazine gill = new magazine();
        book boy = new book();
        gill.Title = "tiger";
        gill.setId(123);
        boy.Author = "kabilan";
        gill.setYear(2003);
        gill.issues = 6;
        System.out.println("\n" + gill.getId() + "\n" + gill.Title + gill.getYear() + "\n" + boy.Author + "\n" + gill.issues);

    }
}