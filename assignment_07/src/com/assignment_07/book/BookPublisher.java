package com.assignment_07.book;


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class BookPublisher extends Book implements IPublisher{
    private String title;

    public BookPublisher(String title, List<String> pages) {
        super(pages);
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void printToFile() {
        boolean isEven = false;
        String previousPage = "";
        try {
            FileWriter fileWriter = new FileWriter(this.getTitle() + ".txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);
            do {
                if (isEven) {
                    previousPage = this.getCurrentPage();
                    isEven = false;
                } else {
                    printWriter.printf("%-25s : %25s%n", previousPage, this.getCurrentPage());
                    isEven = true;
                }
            } while (this.turnToNextPage());
            printWriter.close();
        } catch (IOException ex) {
            System.out.println("Cannot print this book due to IOException");
        }
    }

    public static void main(String[] args) {
        BookPublisher book = new BookPublisher("Tyland2", List.of("I", "moved", "here", "recently", "tood fdf"));
        book.printToFile();
    }
}
