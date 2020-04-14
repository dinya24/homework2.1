package ru.geekbrains.homeworks;


public class Team {
    private String name;
    private Ucastniki[] ucastnikis;
    private StringBuilder results;

    public Team(String name, Ucastniki... ucastnikis) {
        this.name = name;
        this.ucastnikis = ucastnikis;
        this.results = new StringBuilder();
    }




    public void setResult(String result) {
        results.append(result).append("\n");
    }

    public String getName() {
        return name;
    }

    public Ucastniki[] getUcastnikis() {
        return ucastnikis;
    }

    public void showResults() {
        System.out.println("Результаты команды: " + name);
        System.out.println("------------------------");
        System.out.print(results);
    }
}
