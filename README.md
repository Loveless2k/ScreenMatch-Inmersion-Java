# Screen Match
Imagina que estás trabajando en una empresa que gestiona una biblioteca de contenido digital como Netflix o Hulu. 
Tu tarea es crear una herramienta simple que permita a los empleados registrar nuevas películas en el sistema y consultar sus fichas técnicas. 
El programa debe ser fácil de usar y capaz de manejar entradas básicas de los usuarios a través de un menú interactivo.

### Enunciado del Problema
Desarrolla un programa en Java que funcione como un menú interactivo para un sistema de gestión de contenido multimedia. 
El programa deberá permitir al usuario registrar nuevas películas, mostrando detalles como el nombre, año de lanzamiento y duración. 
Además, el programa deberá permitir al usuario salir cuando lo desee.

### Paso a Paso para la Solución

1. **Creación de la Clase Principal**: Define una clase `Principal` que contenga todos los métodos necesarios para mostrar el menú, leer la entrada del usuario y
   registrar las películas.
   
3. **Método para Mostrar el Menú**:
   - Define un método estático `muestraElMenu` que imprime las opciones disponibles y maneja la entrada del usuario para diferentes acciones.
   - Utiliza un bucle `while` para permitir al usuario interactuar con el menú hasta que decida salir.

4. **Registrar Películas**:
   - Crea un método específico para registrar una nueva película. Este método deberá pedir al usuario el nombre, año de lanzamiento y duración de la película.
   - Valida las entradas para asegurar que los datos son correctos (p. ej., que el año y la duración no sean negativos).

5. **Clase `Pelicula`**:
   - Asegúrate de que la clase `Pelicula` tenga métodos adecuados para guardar los datos y mostrar la ficha técnica de la película.

6. **Clase `Main`**:
   - En la clase `Main`, simplemente llama al método `muestraElMenu` de la clase `Principal`.

7. **Pruebas**:
   - Finalmente, prueba el programa para asegurarte de que todos los componentes funcionan como se espera y que el programa maneja correctamente las entradas inválidas.
  
### Modificaciones a la clase `Película`

1. **Nombres de Variables Refinados:**
   - Cambié `fechaDeLanzamiento` a `anioLanzamiento` para aclarar que se refiere al año.
   - Cambié `incluidoEnElPlanBasico` a `incluidoEnPlanBasico` y `tiempoDeDuracionEnMinutos` a `duracionEnMinutos` para hacer los nombres más concisos y mantener la claridad.

2. **Comentarios y Documentación:**
   - Añadí comentarios de documentación de Java (`/** */`) para describir la funcionalidad de la clase y de cada método. Esto mejora la legibilidad y facilita el mantenimiento.

3. **Mejoras de Rendimiento y Prácticas:**
   - Mantuve la estructura básica y los métodos porque ya eran adecuados para las operaciones típicas de una clase de modelo.
   - Se podría considerar implementar validaciones dentro de los setters para asegurar la integridad de los datos
     (por ejemplo, que el año de lanzamiento o la evaluación estén dentro de un rango aceptable), pero esto dependería de requisitos específicos no mencionados en el código original.

Esta versión revisada del código es más limpia, clara y fácil de mantener, con una nomenclatura más consistente y una documentación adecuada que facilita 
su entendimiento y uso en un contexto profesional de desarrollo.

### Modificaciones a la clase `Serie`

1. **Documentación Añadida:**
   - Añadí comentarios Javadoc a la clase y a cada método para explicar su propósito y uso.
     Esto facilita la comprensión del código por otros desarrolladores y mejora la documentación de la clase.

2. **Validación en Setters:**
   - Introduje validaciones en los métodos setters para asegurar que no se asignen valores negativos a las propiedades
     `temporadas`, `episodiosPorTemporada`, y `duracionEnMinutosPorEpisodio`. Esto evita estados inválidos en los objetos de `Serie`.

3. **Excepciones para Valores Inválidos:**
   - Se lanzan excepciones del tipo `IllegalArgumentException` si se intenta establecer un valor no permitido.
     Esto garantiza que la instancia de `Serie` siempre esté en un estado consistente y válido.

Estos cambios mejoran la robustez del código y aseguran que los objetos de la clase `Serie` se manejen de manera correcta, 
con todos los datos validados apropiadamente. Además, la documentación añadida facilita el mantenimiento y escalabilidad del código en proyectos más grandes.

### Modificaciones a la clase `Título`

1. **Nombres de Variables Refinados:**
   - Cambié `fechaDeLanzamiento` a `anioLanzamiento` y `tiempoDeDuracionEnMinutos` a `duracionEnMinutos` para mayor claridad y consistencia con convenciones
     comunes en modelado de datos.

2. **Validación y Prácticas de Codificación:**
   - Mantuve la simplicidad en la lógica dado que es una clase modelo.
     Sin embargo, podrían añadirse validaciones en los setters para asegurar que los datos son razonables (como no permitir años de lanzamiento futuros o valores negativos).

3. **Documentación con Javadoc:**
   - Añadí comentarios Javadoc en la clase y cada método para mejorar la comprensión del código y su propósito.
     Esto es crucial en ambientes de desarrollo profesional donde múltiples desarrolladores pueden trabajar con el mismo código.

4. **Mejora en la Legibilidad y Mantenimiento del Código:**
   - Los nombres de variables más descriptivos y los comentarios claros facilitan el mantenimiento y la extensión futura de la clase.
     Además, hacer el código más legible y consistente ayuda a evitar errores y mejora la colaboración en equipos.

Estos cambios hacen que el código sea más profesional, claro y fácil de mantener, alineándose con buenas prácticas en el desarrollo de software.

## Clase Main

- **`public class Main`**: Define la clase `Main`.
- **`public static void main(String[] args)`**: Método principal que Java utiliza como punto de entrada para cualquier aplicación.
- **`Principal.muestraElMenu();`**: Llama al método `muestraElMenu` de la clase `Principal`. Dado que es un método estático, no es necesario instanciar la clase `Principal`.

Este código es extremadamente simple, sirviendo como punto de lanzamiento para el programa, que maneja interacciones más complejas dentro de la clase `Principal`.
