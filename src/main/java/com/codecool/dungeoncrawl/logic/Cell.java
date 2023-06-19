package com.codecool.dungeoncrawl.logic;

import com.codecool.dungeoncrawl.logic.actors.*;
import com.codecool.dungeoncrawl.logic.items.*;

public class Cell implements Drawable {
    private CellType type;
    private Actor actor;
    private Item item;
    private GameMap gameMap;
    private int x, y;

    public Cell(GameMap gameMap, int x, int y, CellType type) {
        this.gameMap = gameMap;
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public CellType getType() {
        return type;
    }
    public void setType(CellType type) {
        this.type = type;
    }

    public Actor getActor() {
        return actor;
    }
    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Item getItem() {
        return item;
    }
    public void setItem(Item item) {
        this.item = item;
    }


    //element sąsiedni na planszy
    public Cell getNeighbor(int dx, int dy) {
        return gameMap.getCell(x + dx, y + dy);
    }

    @Override
    public String getTileName() {
        return type.getTileName();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


    //czy można wejść na ten element
    public boolean isAvailable() {
        return this.isItem() || this.getType().equals(CellType.FLOOR);}

    //jeżeli typ elementu na planszy to drzwi
    public boolean isDoor() {
        return this.type.equals(CellType.DOOR);
    }

    //jeżeli typ elementu na planszy to przejście
    public boolean isExit() {
        return this.type.equals(CellType.EXIT);
    }

    //sprawdzenie, czy dany element planszy to gracz
    public boolean isPlayer() {return this.actor instanceof Player;}

    //sprawdzenie, czy dany element to przeciwnik
    public boolean isEnemy() {return this.actor instanceof Enemies;}

    public boolean isItem() {
        return this.type.equals(CellType.DIAMOND) || this.type.equals(CellType.HEART)
                || this.type.equals(CellType.POTION) || this.type.equals(CellType.KEY)
                || this.type.equals(CellType.SHIELD) || this.type.equals(CellType.SWORD)
                || this.type.equals(CellType.GRASS);
    }
}
