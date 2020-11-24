package ru.job4j.array;

public class SortSelected {

    public int[] sort(int[] data) {
        MinRange minimum = new MinRange();
        FindLoop searcher = new FindLoop();
        for (int i = 0; i < data.length; i++) {
            int min = minimum.findMin(data, i, data.length - 1);
            int index = searcher.indexOf(data, min, i, data.length - 1);
            if (i < index) {
                int temp = data[i];
                data[i] = data[index];
                data[index] = temp;
            }
        }
        return data;
    }
}
