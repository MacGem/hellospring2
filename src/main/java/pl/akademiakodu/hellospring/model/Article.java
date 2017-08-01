package pl.akademiakodu.hellospring.model;

/**
 * Created by Admin on 27.07.2017.
 */
public class Article {

    private String title;
    private String body;
    private String category;

    public Article() {}

    public Article (String title,String body, String category){
        this.title = title;
        this.body = body;
        this.category= category;


    }

    @Override
    public String toString() {
        return  title + " " + body + " " + category ;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
