package it.unicam.cs.mpgc.rpg130131.model.moves;

import it.unicam.cs.mpgc.rpg130131.model.monsters.ElementType;

import java.util.Objects;

/**
 * A move a creature can use in battle. A power of zero denotes a non-damaging move.
 *
 * @param accuracy hit probability as a percentage, from 1 to 100
 */
public record Move(String id, String name, ElementType type, int power, int accuracy) {

    public Move {
        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("id must not be blank");
        }
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("name must not be blank");
        }
        Objects.requireNonNull(type, "type must not be null");
        if (power < 0) {
            throw new IllegalArgumentException("power must not be negative");
        }
        if (accuracy < 1 || accuracy > 100) {
            throw new IllegalArgumentException("accuracy must be between 1 and 100");
        }
    }
}
