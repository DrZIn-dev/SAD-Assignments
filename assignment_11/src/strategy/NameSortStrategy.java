package strategy;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NameSortStrategy implements SortStrategy {
    // YOU MAY ADD UP TO 5 LINES OF CODE BELOW THIS COMMENT !! A LINE OF CODE MAY CONTAIN UP TO ONE SEMI-COLON !!
    public void customSort(List<Person> people) {
        Collections.sort(people, Comparator.comparing(Person::getName));
    }
}
