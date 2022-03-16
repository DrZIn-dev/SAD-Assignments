package com.assignment_07.book;


import java.util.List;

public class BookReader extends Book implements IReader{

    public BookReader(List<String> pages) {
        super(pages);
    }

    public void printToScreen() {
        do {
            System.out.println(this.getCurrentPage());
        } while (this.turnToNextPage());
    }

    public static void main(String[] args) {
        BookReader book = new BookReader(List.of("I", "moved", "here", "recently", "too"));
        book.printToScreen();
    }
}
