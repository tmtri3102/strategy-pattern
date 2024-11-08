package view;

import model.*;

public class Main {
    public static void main(String[] args) {
        SortedList sortedList = new SortedList();
        sortedList.add(2);
        sortedList.add(8);
        sortedList.add(5);
        sortedList.add(1);
        sortedList.add(4);

//        sortedList.setSortStrategy(new InsertionSort());
        sortedList.setSortStrategy(new InsertionSort());
        sortedList.sort();
    }


}
