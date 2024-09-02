# Ejercicio 1: Calculadora Simple

### Descripción
Este ejercicio consiste en crear un programa de calculadora simple que incluye métodos para sumar, restar, multiplicar y dividir.

### Características Implementadas
- Métodos básicos: `add`, `subtract`, `multiply`, `divide` que aceptan dos parámetros enteros o double y devuelven el resultado.
- Sobrecarga de métodos para manejar operaciones con punto flotante (double).
- Validación de entradas para asegurar que los números no sean negativos.
- Manejo de división por cero.
- Ejemplos de uso de cada método en el `main`.

### Camino Tomado
- Se implementaron métodos para operaciones básicas (suma, resta, multiplicación, división) para tipos `int` y `double`.
- Se añadió validación de entradas para evitar números negativos.
- Se manejó el caso especial de división por cero con una validación adicional.
- Se realizaron pruebas con múltiples casos para asegurar el correcto funcionamiento.

### Desafíos Adicionales
- Se implementaron validaciones de entradas y sobrecarga de métodos.
- Pruebas exhaustivas de los métodos con entradas esperadas e inesperadas.

---

# Ejercicio 2: Sistema de Gestión de Biblioteca

### Descripción
Este ejercicio consiste en crear un sistema simple de gestión de biblioteca utilizando clases en Java.

### Clases Principales
- **Book**: Representa un libro con propiedades como título, autor, ISBN y estado (disponible o prestado).
- **Library**: Permite agregar, eliminar, listar, buscar y prestar libros.
- **LibraryService**: Proporciona una interfaz para interactuar con la biblioteca.

### Características Implementadas
- **Book**: Propiedades `title`, `author`, `ISBN`, y `status`. Métodos para obtener y establecer estos valores.
- **Library**:
    - Métodos para agregar y eliminar libros.
    - Métodos para listar todos los libros.
    - Método para buscar libros por título.
    - Método para prestar libros.
- **LibraryService**:
    - Métodos para agregar, listar, prestar, devolver y eliminar libros por título.
    - Validación de ISBN para evitar duplicados.
    - Manejo de libros prestados y restricciones para su eliminación.

### Camino Tomado
- Se creó una clase `Book` con las propiedades necesarias, incluyendo un estado que indica si el libro está disponible o prestado.
- Se desarrolló la clase `Library` para manejar la colección de libros con métodos para agregar, eliminar, listar, buscar y prestar libros.
- Se implementó la clase `LibraryService` como una interfaz de alto nivel para interactuar con la biblioteca.
- Se añadieron validaciones para evitar duplicados de ISBN y para manejar correctamente los préstamos y devoluciones.

### Desafíos Adicionales
- Implementación de un sistema para evitar prestar libros ya prestados.
- Manejo de estado de los libros, evitando eliminaciones incorrectas.

---

**¡Gracias por visitar este repositorio!** 🚀

Si te ha interesado este proyecto, te invito a explorar más repositorios y recursos en el perfil de [alvarowau en GitHub](https://github.com/alvarowau). Allí encontrarás una variedad de proyectos interesantes y útiles que pueden ayudarte a mejorar tus habilidades en programación y más.

**Recuerda: "Si puedes imaginarlo, puedes programarlo" - ÁlvaroWau. ¡No te lo pierdas!**

**Síguelo para descubrir más proyectos innovadores y aprender de su experiencia en el mundo del desarrollo de software. ¡Tu curiosidad y entusiasmo son bienvenidos!** 😊
