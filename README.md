
# Práctica de Teoria de la Complejidad

## 📌 Información General

- **Título:** Práctica de Teoria de la complejidad
- **Asignatura:** Estructura de Datos
- **Carrera:** Computación
- **Estudiantes:** [Mateo Molina, Juan Ortiz]
- **Fecha:** [11/5/2025]
- **Profesor:** Ing. Pablo Torres

---

## 🛠️ Descripción

Este proyecto implementa y compara diferentes algoritmos de ordenamiento, analizando su eficiencia temporal con diferentes tamaños de datos. Los métodos implementados son:
- Método Burbuja
- Método Selección
- Método Inserción
- Método Shell

Para cada algoritmo se analizan conjuntos de datos de diferentes tamaños:

- 5.000 elementos
- 10.000 elementos
- 30.000 elementos
- 50.000 elementos
- 100.000 elementos

---

## 🚀 Ejecución

Para ejecutar el proyecto:

1. Instalar las librerias para el uso de la grafica:
    ```bash
    javac -cp "lib/*" src/*.java -d bin
    ```
1. Compila el código:
    ```bash
    javac App.java
    ```
2. Ejecuta la aplicación:
    ```bash
    java App
    ```

---

## 🧑‍💻 Ejemplo de Salida

```plaintext
========== Tamaño: 5000 ==========
Tamano: 5000, Algoritmo: Burbuja, Tiempo: 0,03840 segundos
Tamano: 5000, Algoritmo: Seleccion, Tiempo: 0,01953 segundos
Tamano: 5000, Algoritmo: Insercion, Tiempo: 0,02107 segundos
Tamano: 5000, Algoritmo: Shell, Tiempo: 0,00479 segundos

========== Tamaño: 10000 ==========
Tamano: 10000, Algoritmo: Burbuja, Tiempo: 0,15072 segundos
Tamano: 10000, Algoritmo: Seleccion, Tiempo: 0,03989 segundos
Tamano: 10000, Algoritmo: Insercion, Tiempo: 0,04239 segundos
Tamano: 10000, Algoritmo: Shell, Tiempo: 0,00174 segundos

========== Tamaño: 30000 ==========
Tamano: 30000, Algoritmo: Burbuja, Tiempo: 1,91380 segundos
Tamano: 30000, Algoritmo: Seleccion, Tiempo: 0,38772 segundos
Tamano: 30000, Algoritmo: Insercion, Tiempo: 0,35383 segundos
Tamano: 30000, Algoritmo: Shell, Tiempo: 0,00537 segundos

========== Tamaño: 50000 ==========
Tamano: 50000, Algoritmo: Burbuja, Tiempo: 5,83200 segundos
Tamano: 50000, Algoritmo: Seleccion, Tiempo: 1,08280 segundos
Tamano: 50000, Algoritmo: Insercion, Tiempo: 0,28874 segundos
Tamano: 50000, Algoritmo: Shell, Tiempo: 0,00981 segundos
========== Tamaño: 100000 ==========
Tamano: 100000, Algoritmo: Burbuja, Tiempo: 23,80306 segundos
Tamano: 100000, Algoritmo: Seleccion, Tiempo: 4,39853 segundos
Tamano: 100000, Algoritmo: Insercion, Tiempo: 1,15680 segundos
Tamano: 100000, Algoritmo: Shell, Tiempo: 0,02048 segundos

```

---

## EJEMPLO DE ADICIÓN DE DATOS

![alt text](<ComparacionDeTiempos.png>)  

##  CONCLUCIONES CON TERMINOLOGIA DE NOTACION 

 - Al analizar los resultados se puede ver que la eficiencia de los algoritmos de ordenamiento varía dependiendo del tamaño del conjunto de datos, destacando que el método Shell supera a los demás en grandes volúmenes de datos debido a su complejidad O(n log^2 n), mientras que el método Burbuja muestra el peor rendimiento con O (n^2), especialmente en arreglos grandes. Además se observo que factores como la cantidad de intercambios y el acceso a la memoria afectan el rendimiento real de los algoritmos, demostrando que la notación asintótica es una guía general, pero no siempre refleja con precisión el comportamiento en situaciones prácticas.

 - La práctica tambien permitió identificar que aunque el método de Inserción y el de Selección tienen una complejidad similar O(n^2), el método de Inserción resultó ser más eficiente en la mayoría de los casos debido a su mejor manejo de elementos mediamente ordenados. Esto resalta la importancia de observar el comportamiento real de los algoritmos a parte de la teoría. Adicionalmente, el comparar los metodos permitió reforzar el entendimiento de las estructuras de control y el uso de contadores de tiempo en Java, especificamente para evaluar el rendimiento y eficiencia de cualquier aplicación.