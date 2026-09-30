package it.unicam.cs.mpgc.rpg130131.model.monsters;

import java.util.List;
import java.util.Objects;

/**
 * Static description of a kind of creature (the "template"); individual creatures
 * are represented by {@link Creature}.
 */
public record Species(String id, String name, List<ElementType> types, Stats baseStats) {

    public static final int MAX_TYPES = 2;

    public Species {
        requireNotBlank(id, "id");
        requireNotBlank(name, "name");
        types = List.copyOf(Objects.requireNonNull(types, "types must not be null"));
        if (types.isEmpty() || types.size() > MAX_TYPES) {
            throw new IllegalArgumentException("A species must have 1 to " + MAX_TYPES + " types");
        }
        Objects.requireNonNull(baseStats, "baseStats must not be null");
    }

    private static void requireNotBlank(String value, String field) {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException(field + " must not be blank");
        }
    }
}
