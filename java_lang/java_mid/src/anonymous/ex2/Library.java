package anonymous.ex2;

import java.awt.print.Book;

public class Library {
    private Book[] books;
    private int bookCount;

    public Library(int size) {
        books = new Book[size];
        bookCount = 0;
    }

    public void addBook(String book, String author) {
        if (books.length <= bookCount) {
            System.out.println("도서관 저장 공간이 부족합니다.");
        } else {
            books[bookCount++] = new Book(book, author);
        }
    }

    public void showBooks() {
        System.out.println("== 책 목록 출력 ==");
        for (int i = 0;  i < bookCount; i++) {
            System.out.println("도서 목록 : " + books[i].book + "저자 : " + books[i].author);
        }
    }

    private static class Book {
        private String book;
        private String author;

        public Book(String book, String author) {
            this.book = book;
            this.author = author;
        }
    }
}
