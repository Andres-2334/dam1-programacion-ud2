import utilidades.Cancion;
import utilidades.Pelicula;

public class InstanciacionReferenciaYComparacion {
    public static void main(String[] args) {

        // ================================
        // EJERCICIO 1: Crear objetos con new
        // ================================
        // 1. Crea un objeto Cancion (c1) usando el constructor por defecto.
        // 2. Crea otro objeto Cancion (c2) usando el constructor parametrizado,
        // por ejemplo: "Clocks", "Coldplay".
        // 3. Muestra por consola ambas canciones con System.out.println().
        // 4. Observa qué valores se imprimen en cada caso.
        // ¿Qué diferencia hay entre el constructor por defecto y el parametrizado?

        // Tu código aquí ↓
        
        Cancion c1 = new Cancion();
        Cancion c2 = new Cancion("Clocks", "Coldplay");
        System.out.println(c1);
        System.out.println(c2);

        // Uno simplemente da un titulo y artista por defecto el cual seria "desconocido" y el otro uno personalizado



        // ================================
        // EJERCICIO 2: Comparación con ==
        // ================================
        // 1. Crea dos objetos Cancion (c3 y c4) distintos, con los mismos valores
        // (ejemplo: "Clocks", "Coldplay").
        // 2. Imprime el resultado de (c3 == c4).
        // 3. Piensa: ¿por qué da false aunque los datos sean iguales?
        // Tu código aquí ↓

        Cancion c3 = new Cancion("Clocks", "Coldplay");
        Cancion c4 = new Cancion("Clocks", "Coldplay");
        System.out.println(c3 == c4);

        // Da false porque consumen diferentes sitios en memoria a pesar de ser iguales en atributos

        // ================================
        // EJERCICIO 3: Comparación con equals()
        // ================================
        // 1. Usando los mismos objetos c3 y c4 del ejercicio anterior,
        // imprime el resultado de (c3.equals(c4)).
        // 2. ¿Qué diferencia hay con el resultado de (c3 == c4)?
        // 3. Explica por qué ahora sí devuelve true (pista: en Cancion equals está
        // sobrescrito).

        // Tu código aquí ↓

        System.out.println(c3.equals(c4));
        
        

        // ================================
        // EJERCICIO 4: Comparación en Pelicula
        // ================================
        // 1. Crea dos objetos Pelicula (p1 y p2) con el mismo título y año
        // (ejemplo: "Inception", 2010).
        // 2. Imprime ambas películas por consola.
        // 3. Imprime (p1 == p2).
        // 4. Imprime (p1.equals(p2)).
        // 5. Pregunta: ¿por qué en Pelicula equals no funciona como en Cancion?

        // Tu código aquí ↓

        Pelicula p1 = new Pelicula("Inception", 2010);
        Pelicula p2 = new Pelicula("Inception", 2010);
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));


        // ================================
        // EJERCICIO 5: Referencias
        // ================================
        // 1. Crea un objeto Cancion (c5) con el constructor parametrizado.
        // 2. Declara otra variable Cancion (c6) y haz que apunte al mismo objeto que
        // c5.
        // 3. Imprime (c5 == c6).
        // 4. Imprime (c5.equals(c6)).
        // 5. Cambia el título de la canción desde c6.
        // 6. Imprime c5 de nuevo. ¿Qué ha ocurrido?
        // (Pista: c5 y c6 apuntan al mismo objeto en memoria).

        // Tu código aquí ↓

        Cancion c5 = new Cancion("aaa", "eee");
        Cancion c6 = c5;
        System.out.println(c5 == c6);
        c6.setTitutlo("hola");
        System.out.println(c5);

        // Al inicio era ambas true ya que c6 apuntaba a c5 y luego ambas falsas porque c6 y c5 eran nuevos objetos con distintos sitios en memoria y distintas cualidades

        // ================================
        // EJERCICIO 6: null
        // ================================
        // 1. Declara una variable Pelicula (p3) y asígnale null.
        // 2. Imprime p3 por consola.
        // 3. Ahora intenta acceder a un método de p3, por ejemplo p3.get.
        // (Comenta esa línea después de probar, porque lanzará un error).
        // 4. ¿Qué error aparece en la consola?
        // 5. Explica: ¿qué significa realmente que una variable valga null?

        // Tu código aquí ↓
        
        Pelicula p3 = new Pelicula(null);
        System.out.println(p3.getTitulo());
        



    }
}
        
// ================================
// RESPUESTAS DE REFLEXIÓN
// ================================
// Ejercicio 1: ¿Qué diferencia hay entre el constructor por defecto y el parametrizado?
// Respuesta: el por defecto viene con un titulo y artista ya definido "desconocido" el otro es personalizable

// Ejercicio 2: ¿Por qué da false al comparar con == dos objetos con los mismos datos?
// Respuesta: porque son diferentes objetos a pesar de tener los mismos datos

// Ejercicio 3: ¿Qué diferencia hay entre == y equals()? ¿Por qué ahora sí devuelve true?
// Respuesta: == compara su valor en acceso a la memoria y equals sus caracteristicas

// Ejercicio 4: ¿Por qué en Pelicula equals no funciona como en Cancion?
// Respuesta: Porque en pelicula lo esta sobreescribiendo.

// Ejercicio 5: ¿Qué ocurre cuando modificas el objeto a través de c6? ¿Qué demuestra?
// Respuesta: cambia a c5 tambien ya que ambos apuntan a lo mismo.

// Ejercicio 6: ¿Qué error aparece al acceder a un método de p3 siendo null?
// ¿Qué significa realmente que una variable valga null?
// Respuesta: el constructor pelicula esta indefinido, que una varaible valga null es que no tenga ningun atributo o cualidad.
