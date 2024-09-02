package org.alvarowau.exercise2.service;

import org.alvarowau.exercise2.model.Book;
import org.alvarowau.exercise2.model.StatusBook;

import java.util.List;

/**
 * Servicio que proporciona una interfaz para interactuar con la biblioteca,
 * permitiendo agregar, listar, prestar, devolver y eliminar libros.
 */
public class LibraryService {

    private final Library library;

    /**
     * Constructor que inicializa el objeto Library.
     */
    public LibraryService() {
        this.library = new Library();
    }

    /**
     * Agrega una lista de libros a la biblioteca.
     *
     * @param books Lista de libros a agregar.
     */
    public void addBooks(List<Book> books) {
        for (Book book : books) {
            if (library.addBook(book)) {
                System.out.println("Libro agregado: " + book.getTitle());
            } else {
                System.out.println("No se pudo agregar el libro: " + book.getTitle());
            }
        }
    }

    /**
     * Lista todos los libros en la biblioteca.
     */
    public void listBooks() {
        library.listBooks();
    }

    /**
     * Presta un libro de la biblioteca por su título.
     *
     * @param title El título del libro a prestar.
     */
    public void borrowBookByTitle(String title) {
        Book book = library.findBookByTitle(title);
        if (book != null) {
            if (library.borrowBook(book)) {
                System.out.println("El libro '" + book.getTitle() + "' se ha prestado correctamente.");
            } else {
                System.out.println("El libro '" + book.getTitle() + "' ya está prestado.");
            }
        } else {
            System.out.println("No se encontró el libro con el título: " + title);
        }
    }

    /**
     * Devuelve un libro a la biblioteca por su título.
     *
     * @param title El título del libro a devolver.
     */
    public void returnBook(String title) {
        Book book = library.findBookByTitle(title);
        if (book != null) {
            book.setStatus(StatusBook.AVAILABLE);
            System.out.println("El libro '" + book.getTitle() + "' ha sido devuelto y está disponible nuevamente.");
        } else {
            System.out.println("No se encontró el libro con el título: " + title);
        }
    }

    /**
     * Elimina un libro de la biblioteca por su título.
     *
     * @param title El título del libro a eliminar.
     */
    public void removeBookByTitle(String title) {
        Book book = library.findBookByTitle(title);
        if (book != null) {
            if (library.removeBook(book)) {
                System.out.println("El libro '" + book.getTitle() + "' se eliminó satisfactoriamente.");
            } else {
                System.out.println("El libro '" + book.getTitle() + "' no se puede borrar hasta que sea devuelto.");
            }
        } else {
            System.out.println("No se encontró el libro con el título: " + title);
        }
    }
}