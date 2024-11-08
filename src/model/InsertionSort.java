package model;

import java.util.List;

public class InsertionSort implements SortStrategy{
    @Override
    public void sort(List<Integer> items){
        System.out.println(items);
        System.out.println("After Insertion sorting: ");
        int pos, x;
        for (int i = 1; i < items.size(); i++) {
            x = items.get(i);
            pos = i;
            while (pos > 0 && x < items.get(pos - 1)) {
                items.set(pos, items.get(pos - 1));
                pos--;
            }
            items.set(pos, x);
        }
        System.out.println(items);
    }
}
