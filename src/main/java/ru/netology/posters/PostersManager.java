package ru.netology.posters;

public class PostersManager {
    private String[] posters = new String[0];
    private int limit;

    public PostersManager() {
        this.limit = 10;

    }

    public PostersManager(int limit) {
        this.limit = limit;

    }

    public void add(String poster) {
        String[] tmp = new String[posters.length + 1];
        for (int i = 0; i < posters.length; i++) {
            tmp[i] = posters[i];

        }
        tmp[tmp.length - 1] = poster;
        posters = tmp;

    }

    public String[] findAll() {
        return posters;

    }

    public String[] findLast() {
        int resultLength;
        if (posters.length < limit) {
            resultLength = posters.length;
        } else {
            resultLength = limit;
        }
        String[] tmp = new String[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = posters[posters.length - 1 - i];

        }
        return tmp;
    }
}
