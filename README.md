# Screen Match
Imagina que estás trabajando en una empresa que gestiona una biblioteca de contenido digital como Netflix o Hulu. 
Tu tarea es crear una herramienta simple que permita a los empleados registrar nuevas películas en el sistema y consultar sus fichas técnicas. 
El programa debe ser fácil de usar y capaz de manejar entradas básicas de los usuarios a través de un menú interactivo.

https://github.com/Loveless2k/ScreenMatch-Inmersion-Java/assets/130776120/465925cc-2009-4c73-8577-5c04f8cefa26

### Enunciado del Problema
Desarrolla un programa en Java que funcione como un menú interactivo para un sistema de gestión de contenido multimedia. 
El programa deberá permitir al usuario registrar nuevas películas, mostrando detalles como el nombre, año de lanzamiento y duración. 
Además, el programa deberá permitir al usuario salir cuando lo desee.

## Para resolver el problema se aplicará POO (Programación Orientada a Objetos)
¿Qué es la programación orientada a objetos?

![miniatura](https://github.com/Loveless2k/ScreenMatch-Inmersion-Java/assets/130776120/2a8293ef-d9a0-4ad0-93bc-fec1be3ea89e)

La programación orientada a objetos (POO) es un paradigma de programación que utiliza "objetos" para diseñar aplicaciones y programas. 
Los objetos son entidades que combinan estado (datos) y comportamiento (funciones o métodos). 
La POO facilita el desarrollo y mantenimiento de software complejo al permitir que los desarrolladores se centren en el alto nivel de abstracción de los datos.

### Conceptos Clave de la POO

1. **Clase**
   - Una clase es un "blueprint" o plantilla para crear objetos. Define un tipo de datos por medio de atributos (datos) y métodos (funciones asociadas a esos datos).
   - **Ejemplo**: Una clase `Perro` podría tener atributos como `nombre`, `edad` y métodos como `ladrar()` o `caminar()`.

2. **Objeto**
   - Una instancia de una clase. Un objeto en POO encapsula estado y comportamiento que están definidos por su clase.
   - **Ejemplo**: Si `Perro` es una clase, entonces un objeto podría ser `miPerro` que representa un perro específico como un Labrador llamado "Max".

3. **Herencia**
   - La herencia permite que una clase herede características (atributos y métodos) de otra clase. La clase que hereda es conocida como subclase o clase derivada, y la clase de la que se hereda es conocida como superclase o clase base.
   - **Ejemplo**: La clase `Labrador` podría heredar de la clase `Perro`, obteniendo así todos sus métodos y atributos.

4. **Polimorfismo**
   - Polimorfismo significa "muchas formas" y permite que un método se comporte de manera diferente en función de la instancia de la clase que lo está utilizando. Esto se puede lograr a través de sobrecarga de métodos (mismo método, diferentes parámetros) o sobreescritura de métodos (redefinir un método en una subclase).
   - **Ejemplo**: `miPerro.ladrar()` podría producir un sonido diferente si `miPerro` es un `Labrador` y otro si es un `Chihuahua`.

5. **Encapsulamiento**
   - El encapsulamiento es el principio de esconder los detalles internos del funcionamiento de una clase y exponer solo aquellos componentes que sean seguros para el uso externo. Esto se logra utilizando modificadores de acceso como `public`, `private` y `protected`.
   - **Ejemplo**: Los atributos de la clase `Perro` podrían ser privados (`private`), lo que significa que solo se pueden modificar a través de métodos públicos (`public`) como `setEdad(int edad)`.

6. **Abstracción**
   - La abstracción implica identificar qué características son comunes y esenciales entre objetos, definiéndolas en una clase que puede ser extendida o implementada. En muchas ocasiones, se utiliza en conjunto con interfaces y clases abstractas.
   - **Ejemplo**: Una clase abstracta `Animal` podría definir un método abstracto `mover()` que debe ser implementado por todas las subclases derivadas como `Perro`, `Gato`, etc.

### Composición sobre Herencia
La composición y la herencia son dos técnicas que permiten a los desarrolladores definir nuevas clases en POO, pero la composición suele ser preferida sobre la herencia por varias razones:

![22](https://github.com/Loveless2k/ScreenMatch-Inmersion-Java/assets/130776120/096c5c59-9da6-4fc8-b46d-73d281d5d6f5)

- **Acoplamiento Menor**: La composición permite crear sistemas más flexibles con objetos que utilizan funcionalidades de otros objetos a través de sus interfaces sin necesitar heredar de ellos. Esto reduce el acoplamiento entre clases.
  
- **Mayor Flexibilidad**: Con la composición, es fácil cambiar el comportamiento en tiempo de ejecución agregando y removiendo componentes, mientras que la herencia es estática y no permite cambiar la herencia de un objeto una vez creado.

- **Evita la Fragilidad de la Base de Clase**: En la herencia, cambios en la superclase pueden tener efectos imprevistos en las subclases, lo que puede llevar a errores. La composición minimiza este riesgo al encapsular los comportamientos.

- **Principio de Responsabilidad Única**: La composición permite adherirse más fácilmente al principio de responsabilidad única, donde una clase debería tener una, y solo una, razón para cambiar. La herencia, por otro lado, puede llevar a situaciones donde una clase base tiene múltiples responsabilidades a través de sus sub

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

## Diseño de la Solución
La solución utiliza clases dentro de un modelo de herencia para representar títulos generales (`Titulo`) y especializaciones para `Pelicula` y `Serie`. Además, se incorporan utilidades para manejar la entrada de datos del usuario y se estructura un menú interactivo para facilitar la gestión.

### Estructura de Clases
- `Titulo`: Clase base que define los atributos y métodos comunes.
- `Pelicula`: Subclase de `Titulo` que añade atributos específicos de películas.
- `Serie`: Subclase de `Titulo` que maneja características específicas de series, como temporadas y episodios.
- `InputHelper`: Clase de utilidad para manejar la entrada de datos desde la consola.
- `Principal`: Contiene la lógica principal del negocio y el menú interactivo.
- `Main`: Punto de entrada de la aplicación que llama al método para mostrar el menú.

## Implementación del Diseño
La aplicación se desarrolla en Java, utilizando encapsulamiento para proteger y organizar los datos, herencia para reducir redundancias y mejorar la mantenibilidad, y control de excepciones para manejar entradas de usuario no válidas.

### Detalles del Código
- **Clase `Titulo`**: Define atributos comunes y métodos para mostrar información.
- **Clase `Pelicula` y `Serie`**: Extienden `Titulo` y añaden particularidades.
- **Clase `InputHelper`**: Provee métodos estáticos para leer diferentes tipos de datos.
- **Clase `Principal`**: Gestiona la interacción con el usuario y coordina la funcionalidad de la aplicación.
- **Clase `Main`**: Inicia la ejecución del programa.

## Buenas Prácticas y Metodologías Aplicadas
- **Encapsulamiento**: Uso de modificadores de acceso para proteger los datos.
- **Herencia**: Para evitar duplicación y fomentar la reutilización del código.
- **Principio de responsabilidad única**: Cada clase tiene una clara responsabilidad y propósito.
- **Manejo de excepciones**: Control robusto de errores para evitar fallos en tiempo de ejecución.
- **Uso de métodos estáticos cuando es adecuado**: Para utilidades que no mantienen estado.

## Instrucciones de Uso
1. Clone el repositorio a su máquina local.
2. Compile y ejecute la clase `Main`.
3. Siga las instrucciones en la consola para interactuar con el programa.

## Autor
Jorge Salgado