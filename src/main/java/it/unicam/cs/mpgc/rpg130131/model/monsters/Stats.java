package it.unicam.cs.mpgc.rpg130131.model.monsters;

/**
 * Immutable set of base statistics of a {@link Species}.
 */
public record Stats(int hp, int attack, int defense, int speed) {

    public Stats {
        if (hp <= 0 || attack <= 0 || defense <= 0 || speed <= 0) {
            throw new IllegalArgumentException("All stats must be strictly positive");
        }
    }
}
