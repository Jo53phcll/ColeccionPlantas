# Colección de Plantas

Aplicación de consola desarrollada en Java 25 que permite registrar y visualizar plantas de una colección personal o vivero.

## Descripción
El programa permite ingresar plantas por teclado y almacenarlas durante la ejecución en un arreglo tradicional de 10 posiciones. Cada planta se representa mediante un `record`. Toda la interacción se realiza desde la terminal, sin interfaces gráficas, aplicaciones web ni bases de datos.

## Funcionalidades
- Menú de opciones en la terminal
- Registrar una nueva planta
- Mostrar todas las plantas registradas
- Validación de los datos ingresados
- Finalizar la ejecución del programa

## Record utilizado
```java
public record Planta(String nombre, String tipo, int alturaCm, int riegoDias) {
}
```

| Atributo | Tipo | Descripción |
|----------|------|-------------|
| nombre | String | Nombre de la planta |
| tipo | String | Categoría (suculenta, helecho, orquídea, etc.) |
| alturaCm | int | Altura en centímetros (1 a 500) |
| riegoDias | int | Cada cuántos días se riega (1 a 60) |

## Validaciones
- Los textos no pueden estar vacíos y deben tener al menos 2 caracteres.
- Los números deben ser enteros válidos y estar dentro del rango permitido.
- No se permite registrar más plantas si el arreglo está lleno.

## Estructura del proyecto
```
ColeccionPlantas
└── src
    ├── Main.java
    └── vivero
        └── modelo
            └── Planta.java
```

## Requisitos
- JDK 25
- IntelliJ IDEA

## Instrucciones de ejecución
1. Clonar el repositorio:
   ```
   git clone URL_DEL_REPOSITORIO
   ```
2. Abrir la carpeta del proyecto en IntelliJ IDEA.
3. Verificar que el SDK del proyecto sea Java 25 (File → Project Structure → Project).
4. Abrir `src/Main.java` y ejecutar el método `main` con el botón verde.
5. Usar el menú escribiendo el número de la opción y presionando Enter.

## Autor
Joseph Collaguazo  
Estructura de Datos, Segundo Semestre  
Pontificia Universidad Católica del Ecuador, Sede Quito  
Docente: Eduardo Conrrado