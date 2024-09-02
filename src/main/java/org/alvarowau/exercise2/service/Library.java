package org.alvarowau.exercise2.service;

import org.alvarowau.exercise2.model.Book;
import org.alvarowau.exercise2.model.StatusBook;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa una biblioteca donde se pueden agregar, eliminar, listar, buscar y prestar libros.
 */
public class Library {

    private final List<Book> library;

    /**
     * Constructor que inicializa la lista de libros de la biblioteca.
     */
    public Library() {
        this.library = new ArrayList<>();
    }

    /**
     * Agrega un libro a la biblioteca si su ISBN no existe ya en la biblioteca.
     *
     * @param book El libro a agregar.
     * @return true si el libro se agregó correctamente, false si el ISBN ya existe.
     */
    public boolean addBook(Book book) {
        if (!isbnExists(book.getISBN())) {
            library.add(book);
            return true;
        }
        return false;
    }

    /**
     * Elimina un libro de la biblioteca si está disponible.
     *
     * @param book El libro a eliminar.
     * @return true si el libro se eliminó correctamente, false si el libro está prestado o no existe.
     */
    public boolean removeBook(Book book) {
        if (book.getStatus().isAvailable()) {
            return library.remove(book);
        }
        return false;
    }

    /**
     * Lista todos los libros en la biblioteca.
     * Si no hay libros, imprime un mensaje indicando que la biblioteca está vacía.
     */
    public void listBooks() {
        if (library.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
        } else {
            System.out.println("Listado de libros en la biblioteca:");
            for (Book book : library) {
                System.out.println(book);
            }
        }
    }

    /**
     * Busca un libro en la biblioteca por su título.
     *
     * @param title El título del libro a buscar.
     * @return El libro si se encuentra, o null si no existe en la biblioteca.
     */
    public Book findBookByTitle(String title) {
        for (Book book : library) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    /**
     * Presta un libro de la biblioteca si está disponible.
     *
     * @param book El libro a prestar.
     * @return true si el libro fue prestado correctamente, false si el libro ya está prestado o no existe.
     */
    public boolean borrowBook(Book book) {
        if (isbnExists(book.getISBN()) && book.getStatus().isAvailable()) {
            book.setStatus(StatusBook.BORROWED);
            return true;
        }
        return false;
    }

    /**
     * Verifica si un ISBN ya existe en la biblioteca.
     *
     * @param ISBN El ISBN a verificar.
     * @return true si el ISBN ya existe, false en caso contrario.
     */
    private boolean isbnExists(String ISBN) {
        for (Book book : library) {
            if (book.getISBN().equals(ISBN)) {
                return true;
            }
        }
        return false;
    }
}