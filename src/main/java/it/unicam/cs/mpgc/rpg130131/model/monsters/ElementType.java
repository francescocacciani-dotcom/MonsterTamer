package it.unicam.cs.mpgc.rpg130131.model.monsters;

import java.util.Objects;

/**
 * Identifies an elemental type (e.g. "fire", "water").
 *
 * <p>Types are data, not code: a new type can be introduced from the content files
 * without touching any class.</p>
 */
public record ElementType(String id) {

    public ElementType {
        Objects.requireNonNull(id, "id must not be null");
        id = id.trim().toLowerCase();
        if (id.isEmpty()) {
            throw new IllegalArgumentException("Type id must not be blank");
        }
    }
}
