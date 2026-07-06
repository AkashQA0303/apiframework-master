package entities;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;


public class getBooksResponse {

    private List<books> books;
    
    public List<books> getBooks() {
        return books;
    }

    public void setBooks(List<books> books) {
        this.books = books;
    }

//    @Getter
//    @Setter
//    private static class Book {
//        private String isbn;
//        private String title;
//        private String subTitle;
//        private String author;
//        private Date publish_date;
//        private String publisher;
//        private int pages;
//        private String description;
//        private String website;
//    }
}
