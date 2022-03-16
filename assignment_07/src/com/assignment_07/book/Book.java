package com.assignment_07.book;

import java.util.List;
import java.util.ListIterator;

public class Book implements IBook{
    private List<String> pages;
    private ListIterator<String> iterator;
    private String currentPage;

    public Book(List<String> pages) {
        this.pages = pages;
        iterator = pages.listIterator();
        if (iterator.hasNext()) {
            currentPage = iterator.next();
        } else {
            currentPage = null;
        }
    }

    public String getCurrentPage() {
        return currentPage;
    }

    public boolean turnToNextPage() {
        if (iterator.hasNext()) {
            currentPage = iterator.next();
            return true;
        } else {
            return false;
        }
    }
}
