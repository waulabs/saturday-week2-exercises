package org.alvarowau.exercise2;


import org.alvarowau.exercise2.model.Book;
import org.alvarowau.exercise2.service.LibraryService;

import java.util.ArrayList;
import java.util.List;

/**
 * Ejercicio Práctico: Sistema de Gestión de Biblioteca (20 minutos)
 * Crea un sistema simple de gestión de biblioteca utilizando clases en Java.
 * Descripción de la Tarea:
 * Crea una clase Book con propiedades como title, author y ISBN.
 * Crea una clase Library que pueda agregar libros, eliminar libros y mostrar todos los libros.
 * Usa modificadores de acceso, constructores y métodos adecuados.
 * En el método main, demuestra el uso de tus clases agregando libros a la biblioteca, eliminando un libro y mostrando el contenido de la biblioteca.
 * Desafíos Adicionales (si el tiempo lo permite):
 * Implementa un método searchBooks en la clase Library que pueda buscar libros por título o autor.
 * Agrega un método borrowBook que marque un libro como prestado y evite que se preste nuevamente hasta que sea devuelto.
 * Recuerda aplicar los conceptos de encapsulación, constructores y diseño de métodos que hemos discutido. ¡Buena suerte!
 */
public class Exercise2 {
    public static void main(String[] args) {
        LibraryService libraryService = new LibraryService();
        List<Book> books = createBookExample();

        // Agregar libros
        libraryService.addBooks(books);

        // Intentar agregar un libro con un ISBN ya existente
        System.out.println("\nIntentar agregar un libro con un ISBN ya existente:");
        libraryService.addBooks(List.of(
                new Book("978-84-376-0494-3", "Gabriel García Márquez", "Cien años de soledad")
        ));

        // Listar libros
        System.out.println("\nListado de libros tras intento de agregar duplicado:");
        libraryService.listBooks();

        // Prestar un libro
        System.out.println("\nPrestar un libro por título 'Cien años de soledad':");
        libraryService.borrowBookByTitle("Cien años de soledad");

        // Intentar prestar el mismo libro nuevamente
        System.out.println("\nIntentar prestar el mismo libro 'Cien años de soledad' nuevamente:");
        libraryService.borrowBookByTitle("Cien años de soledad");

        // Intentar eliminar un libro que está prestado
        System.out.println("\nIntentar eliminar el libro prestado 'Cien años de soledad':");
        libraryService.removeBookByTitle("Cien años de soledad");

        // Devolver el libro
        System.out.println("\nDevolver el libro 'Cien años de soledad':");
        libraryService.returnBook("Cien años de soledad");

        // Ahora intentar eliminar el libro nuevamente, debería tener éxito
        System.out.println("\nEliminar el libro 'Cien años de soledad' después de devolverlo:");
        libraryService.removeBookByTitle("Cien años de soledad");

        // Intentar eliminar un libro que no existe
        System.out.println("\nIntentar eliminar un libro que no existe 'Libro Fantasma':");
        libraryService.removeBookByTitle("Libro Fantasma");

        // Listar libros nuevamente para ver el estado final
        System.out.println("\nListado de libros final:");
        libraryService.listBooks();
    }

    private static List<Book> createBookExample(){
        List<Book> books = new ArrayList<>();

        books.add(new Book("978-84-376-0494-3", "Gabriel García Márquez", "Cien años de soledad"));
        books.add(new Book("978-84-670-5463-8", "Miguel de Cervantes", "Don Quijote de la Mancha"));
        books.add(new Book("978-84-376-0495-0", "Mario Vargas Llosa", "La ciudad y los perros"));
        books.add(new Book("978-84-9786-112-8", "Isabel Allende", "La casa de los espíritus"));
        books.add(new Book("978-84-376-1556-7", "Julio Cortázar", "Rayuela"));
        books.add(new Book("978-84-329-7680-4", "Luis Sepúlveda", "Un viejo que leía novelas de amor"));
        books.add(new Book("978-84-9032-407-1", "Carlos Ruiz Zafón", "La sombra del viento"));
        books.add(new Book("978-84-291-5115-8", "Pablo Neruda", "Veinte poemas de amor y una canción desesperada"));
        books.add(new Book("978-84-329-1305-1", "Laura Esquivel", "Como agua para chocolate"));
        books.add(new Book("978-84-376-2520-2", "Jorge Luis Borges", "Ficciones"));

        return books;
    }
}

