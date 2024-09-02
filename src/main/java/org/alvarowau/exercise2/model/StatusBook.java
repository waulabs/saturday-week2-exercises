package org.alvarowau.exercise2.model;

/**
 * Enum que representa el estado de un libro en la biblioteca.
 * Indica si un libro está disponible o prestado.
 */
public enum StatusBook {
    AVAILABLE("El libro está disponible en la biblioteca."),
    BORROWED("El libro está actualmente prestado y no está disponible.");

    private final String description;

    /**
     * Constructor del enum StatusBook.
     *
     * @param description Descripción del estado del libro.
     */
    StatusBook(String description) {
        this.description = description;
    }

    /**
     * Obtiene la descripción del estado del libro.
     *
     * @return La descripción del estado.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Verifica si el libro está disponible.
     *
     * @return true si el libro está disponible, false si está prestado.
     */
    public boolean isAvailable() {
        return this == AVAILABLE;
    }

    /**
     * Verifica si el libro está prestado.
     *
     * @return true si el libro está prestado, false si está disponible.
     */
    public boolean isBorrowed() {
        return this == BORROWED;
    }

    @Override
    public String toString() {
        return description;
    }
}