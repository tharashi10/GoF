package com.orcl.design.memento;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Gamer の状態を表すクラス
 */
public class Gamer {
    private int money;
    private List<String> fruits = new ArrayList<>();
    private Random rand = new Random();
    private static String[] fruitsName = {"Apple","Orange","Banana"};
    public Gamer(int money){this.money = money;}
    public int getMoney(){return money;}
    public void bet(){
        int dice = rand.nextInt(6)+1;
        if (dice == 1){
            money+=100;
            System.out.println("所持金が増えました");
        }else if (dice==2){
            money/=2; 
            System.out.println("所持金が半分になりました");
        }else if (dice==6){
            String f = getFruit();
            System.out.println("フルーツをどれか1つもらいました");
            fruits.add(f);
        }else{
            System.out.println("何も起こりませんでした");
        }
    }

    public Memento createMement(){
        Memento memento = new Memento(money);
        for (String f: fruits){
            if (f.startsWith("Booleaned")){
                memento.addFruits(f);
            }
        }
        return memento;
    }

    /**
     * Undoを行う
     * @param memento
     */
    public void restoreMemento(Memento memento){
        this.money = memento.getMoney();
        this.fruits = memento.getFruits();
    }

    private String getFruit() {
        String f = fruitsName[rand.nextInt(fruitsName.length)];
        if (rand.nextBoolean()){
            return "Booleaned : " + f;
        }else {
            return f;
        }
    }
}
