# JAVA

### Notas

- var se usa para declarar variables flexibles, es decir, el tipo de variable cambia de acuerdo al dato que se almacena
- AND tiene prioridad sobre OR
- Nombramiento de paquetes: `org.nombredelpaquete.nombredelproyecto`

## Tipos de valores

### Números

```jsx
int numeroBinario = 0b1111111111; //Al colocar el 0b adelante, el compilador interpreta que es un número binarioint 
numeroOctal = 0764; //Anteponer el 0 significa que es octalint 
numeroHex = 0xB;
//Si al final le agregamos d pasa a ser double, f float y l long
var varFlotante = 3.1416d

//Ejemplo de números aleatorios en el rango de 15 a 25
Random randomObj = new Random();
int randomInt = 15 + randomObj.nextInt(25-15+1);
```

### Strings

```jsx
/*.append es mucho más rápido que concata o que concatenar de forma tradicional*/
for (int i = 0; i < 10000; i++){
    //c = c.concat(a).concat(b).concat("\n");
    //c += a + b + "\n";
    sb.append(a).append(b).append("\n");
		sb.isBlank(); //sirve para verificar si es nulo.
}
```

### Arrays

Número de filas y columnas

```jsx
int[][] numeros = new int [2][3];
System.out.println("Número de filas =" + numeros.length);
System.out.println("Número de columnas =" + numeros[0].length);
```

```jsx
for (int i = 0; i <= count-1; i++) { //<= count-1 // -1 porque si bien el arreglo es de ese tamaño (8), el arreglo inicia desde 0 , lo que quiere decir que el último elemento será 7 (el tamaño - 1)
            if (nombres[i].toLowerCase().contains("ANDRES".toLowerCase()) ||
                    nombres[i].toLowerCase().contains("pepa".toLowerCase())) {
                continue; //sirve para el ciclo siga iterando sin necesidad de hacer nada cada vez que itere
            }
            System.out.println(i + ".-" + nombres[i]);
        }
```

Otra forma de agregar items a Arrays (optimizada)

![Untitled](JAVA%2080de9335da55424e9b91887cf9d4b247/Untitled.png)

### Etiquetas en Java

```jsx
salir: while (i < matriz.length){
	j = 0;
	while (j < i ){
		if(matriz[i][j] != matriz[j][i]{
			simetrica = false;
			break salir;
		}
		j++;
	}
	i++;
}
/*salir es la etiqueta y sirve para identificar, en este caso, el bucle while cosa que 
así se puede llamar desde otro lado rápidamente*/
```

### Operador instanceOf

```jsx
//instanceof devuelve si el valor es del tipo de referencia indicado. 
//Los ancestros son instance of de hijos, pero no puede
String text = "Probando, 1, 2 ,3";
Integer num = 4;

boolean b1 = text instanceof String;
System.out.println("Texto es del tipo String = "+ b1);
True pq Object es el anscentro de todos los elementos
b1 =num  instanceof Object;
System.out.println("num es del tipo Object = "+ b1);
//True pq String e Integer comparten al Object como anscentro
b1= num instanceof Integer;
System.out.println("num es del tipo Integer "+ b1);
//b1= num instanceof Short; sale error pq no tienen  ningún ancestro en común
```

### For each

```jsx
String[] nombres = {"Andres", "Pepe", "María", "Paco", "Lalo", "Bea", "Pato", "Pepa"};
        
/*
variable de turno : variable del array. Parece un map de React
for each solo se usa sobre arrays u objetos de colección de Java
*/        

for (String nombre : nombres){
	System.out.println("nombre = " + nombre);
}
```

### [Class SimpleDateFormat](https://docs.oracle.com/javase/8/docs/api/java/text/SimpleDateFormat.html)

### Sobrecarga de métodos

- La sobrecarga de métodos es tener diferentes métodos de diferente tipo y diferentes argumentos (esto último obligatorio) y/o cantidad de argumentos pero con el mismo nombre.

Varargs

```java
public float sumar(float a, int... argumentos){
        float total = a;
        for(int i: argumentos){
            total+=i;
        }
        return total;
    }
/*int ... argumentos significa que puedo ingresar la cnatidad de argumentos que quiera
1,2,3, infinitos
*/
```

### Herencia

- A los elementos de las clases es buena idea ponerles protected para que no se puedan modificar directamente, tipo alumno.nombre = "Paco", si no usar alumno.setNombre("Paco")
- Sobreescritura de métodos en la herencia —parte del método del padre reutilizado

![Untitled](JAVA%2080de9335da55424e9b91887cf9d4b247/Untitled%201.png)

![Untitled](JAVA%2080de9335da55424e9b91887cf9d4b247/Untitled%202.png)

- Si se coloca final en clases es para evitar que esta clase tenga herencia y si se coloca en métodos es para evitar que se pase a través de la herencia

![Untitled](JAVA%2080de9335da55424e9b91887cf9d4b247/Untitled%203.png)

![Untitled](JAVA%2080de9335da55424e9b91887cf9d4b247/Untitled%204.png)

### Interfaces

![Untitled](JAVA%2080de9335da55424e9b91887cf9d4b247/Untitled%205.png)

![Untitled](JAVA%2080de9335da55424e9b91887cf9d4b247/Untitled%206.png)

Ejemplo:

![Untitled](JAVA%2080de9335da55424e9b91887cf9d4b247/Untitled%207.png)

![Untitled](JAVA%2080de9335da55424e9b91887cf9d4b247/Untitled%208.png)

![Untitled](JAVA%2080de9335da55424e9b91887cf9d4b247/Untitled%209.png)

Datos genéricos:

```java
package generics;

import org.aguzman.poointerfaces.modelo.Cliente;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploGenericos {
    public static void main(String[] args) {
        List clientes = new ArrayList();
        clientes.add(new Cliente("Andres", "Guzmán"));

        Cliente andres = (Cliente) clientes.get(0);

        Cliente[] clientesArreglo = {new Cliente("Luci", "Martínez"),
        new Cliente("Andres", "Guzmán")};

        Integer[] enterosArreglo = {1, 2, 3};

        List<Cliente> clientesLista = fromArrayToList(clientesArreglo);
        List<Integer> enterosLista = fromArrayToList(enterosArreglo);

        clientesLista.forEach(System.out::println);
        enterosLista.forEach(System.out::println);

        List<String> nombres = fromArrayToList(new String[]{"Andrés", "Pepe", "Luci", "Bea", "John"}, enterosArreglo);
        nombres.forEach(System.out::println);

        List<ClientePremium> clientesPremiumList = fromArrayToList(
                new ClientePremium[]{new ClientePremium("Paco", "Fernáncez")});
    }

    /*T se usa para trabajar con Arrays, esto permite convertir al método en uno genérico,
    * ya que este recibe a cualquier tipo de arrays*/
    public static <T> List<T> fromArrayToList(T[] c){
        return Arrays.asList(c);
    }
    //El extends sirve para que solo reciba un tipo de dato
    public static <T extends Number> List <T> fromArrayToList(T[] c){
        return Arrays.asList(c);
    }

    public static <T extends Cliente> List <T> fromArrayToList(T[] c){
        return Arrays.asList(c);
    }

    public static <T, G> List<T> fromArrayToList(T [] c, G[] x){
        for ( G elemento : x){
            System.out.println(elemento);
        }
        return Arrays.asList(c);
    }
    //Recibe cualquier elemento Cliente como argumento, ya sean padres o hijos
    public static void imprimirClientes(List <? extends Cliente> clientes){
        clientes.forEach(System.out::println);
    }
}
```

### [Exceptions](https://www.geeksforgeeks.org/types-of-exception-in-java-with-examples/?ref=lbp)

- Las validaciones se pueden realizar, por ejemplo, cuando quiero hacer validaciones para evitar el uso repetitivo de if else, if else.

### Estructura de datos

![Untitled](JAVA%2080de9335da55424e9b91887cf9d4b247/Untitled%2010.png)

- Los ArrayList permiten elementos repetidos, mientras que los Set no.

### Ejemplo ArrayList Comparable y Comparator

```java
package org.aguzman.ejemplos.set;

import org.aguzman.ejemplos.modelo.Alumno;

import java.util.*;

public class EjemploListComparableComparator {
    public static void main(String[] args) {
        List<Alumno> sa = new ArrayList<>();
        sa.add(new Alumno("Pato", 5));
        sa.add(new Alumno("Cata", 6));
        sa.add(new Alumno("Luci", 3));
        sa.add(new Alumno("Joaquin", 10));
        sa.add(new Alumno("Patricio", 6));
        sa.add(new Alumno("Patricio", 6));
        //Forma 1: Collections.sort(sa, (a, b) -> b.getNota().compareTo(a.getNota()));
        //Forma 2: sa.sort((a,b) -> a.getNota().compareTo(b.getNota()));

        //Forma simplificada
        sa.sort(Comparator.comparing(Alumno::getNota));

        System.out.println(sa);
    }
}
```

### [Hilos](https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=100&codigo=180&inicio=80)

### Lambda (link a GitHub)

- `err -> System.out.println(err) == System.out::print`

API Stream (link)