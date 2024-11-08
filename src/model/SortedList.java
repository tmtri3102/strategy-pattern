package model;

import java.util.ArrayList;
import java.util.List;

public class SortedList {
    private SortStrategy strategy;
    private List<Integer> items = new ArrayList<>();

    public void setSortStrategy(SortStrategy strategy){
        this.strategy = strategy;
    }

    public void add(int number) {
        items.add(number);
    }

    public void sort(){
        strategy.sort(items);
    }
}
