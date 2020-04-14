package ru.geekbrains.homeworks;



public class Ucastniki implements Deistvia {
    private String type;
    private String name;
    private int maxRunDistance;
    private int maxJumpHeigth;
    private boolean onDistance;

    public Ucastniki(String type, String name, int maxRunDistance, int maxJumpHeigth) {
        this.type = type;
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeigth = maxJumpHeigth;
        this.onDistance = true;
    }

    @Override
    public String run(int dist) {
        if (dist <= maxRunDistance){
            return (type + "  " + name + "  Пробежал");
        }else{
            onDistance = false;
        return (type + "  " + name + "  Не пробежал");
        }
    }

    @Override
    public String jump(int height) {
        if(height <= maxJumpHeigth){
            return (type + " " + name + "Перепрыгнул");
        }else {
            onDistance = false;
            return (type + " " + name + "Не перепрыгнул");
        }
    }

    @Override
    public boolean isOnDistance() {
        return onDistance;
    }

    @Override
    public void inf() {
        System.out.println(type + " " +  name + " " + onDistance);
    }
}
