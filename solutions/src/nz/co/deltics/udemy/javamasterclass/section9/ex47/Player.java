package nz.co.deltics.udemy.javamasterclass.section9.ex47;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {

    private String name;
    private int hitPoints;
    private int strength;
    private String weapon;


    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getWeapon() {
        return weapon;
    }


    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }


    public int getHitPoints() {
        return hitPoints;
    }


    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }


    public int getStrength() {
        return strength;
    }


    public void setStrength(int strength) {
        this.strength = strength;
    }


    public List<String> write() {
        List<String> result = new ArrayList<String>();

        result.add(this.name);
        result.add(String.valueOf(this.hitPoints));
        result.add(String.valueOf(this.strength));
        result.add(this.weapon);

        return result;
    }

    public void read(List<String> strings) {

        if ((strings == null) || strings.isEmpty())
            return;

        this.name = strings.get(0);

        if (strings.size() > 1)
            this.hitPoints = Integer.parseInt(strings.get(1));

        if (strings.size() > 2)
            this.strength = Integer.parseInt(strings.get(2));

        if (strings.size() > 3)
            this.weapon = strings.get(3);
    }


    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }
}
