# Sistema de Gestión de Parqueadero

Este proyecto es un sistema básico desarrollado en *Java* que permite gestionar un parqueadero. Fue realizado como parte de una actividad educativa para aplicar conceptos de Programación Orientada a Objetos (POO).

## Funcionalidades
1. *Registrar vehículo*: Permite ingresar datos como placa, modelo y propietario.
2. *Consultar vehículos*: Muestra una lista con todos los vehículos registrados.
3. *Salir del sistema*: Finaliza la ejecución del programa.

## Requisitos
- *Java Development Kit (JDK)*: Versión 8 o superior.
- *Editor o IDE*: Visual Studio Code o cualquier editor de texto.

## Estructura del Proyecto

SistemaDeParqueadero/ ├── src/ │ 
└── SistemaDeParqueadero.java ├──
uml/ │   └── DiagramaClases.puml 
└── README.md

## Descripción técnica
El sistema se desarrolló utilizando dos clases principales:

1. **Clase SistemaParking**:
   - Contiene el método main que gestiona el programa.
   - Incluye los métodos registrarVehiculo y consultarVehiculos para interactuar con los datos.

2. **Clase Vehiculo**:
   - Representa un vehículo con atributos como placa, modelo y propietario.
   - Tiene un método toString para mostrar la información del vehículo.

## Diagrama UML
El siguiente diagrama UML muestra la estructura y relación de las clases:

```plantuml
@startuml nombre
class SistemaParking {
    +main(args: String[]): void
    -registrarVehiculo(scanner: Scanner): void
    -consultarVehiculos(): void
}

class Vehiculo {
    -placa: String
    -modelo: String
    -propietario: String
    +Vehiculo(placa: String, modelo: String, propietario: String)
    +toString(): String
}

SistemaParking --> Vehiculo : "Lista de vehículos"
@enduml

Si has generado el diagrama como imagen, puedes agregarlo aquí como referencia:

![Diagrama de Clases UML](uml/DiagramaClases.png)

Ejecución

1. Abre una terminal y navega a la carpeta src donde se encuentra el archivo SistemaDeParqueadero.java.


2. Compila el archivo con el siguiente comando:

javac SistemaDeParqueadero.java


3. Ejecuta el programa con:

java SistemaDeParqueadero



Ejemplo de Uso

=== Sistema de Parking ===
1. Registrar vehículo
2. Consultar vehículos
3. Salir
Elige una opción: 1
Ingrese la placa: ABC1234
Ingrese el modelo: Toyota Corolla
Ingrese el propietario: Juan Pérez
Vehículo registrado exitosamente.

=== Sistema de Parking ===
1. Registrar vehículo
2. Consultar vehículos
3. Salir
Elige una opción: 2
Lista de vehículos:
Placa: ABC1234, Modelo: Toyota Corolla, Propietario: Juan Pérez

Créditos

Este proyecto fue desarrollado como una actividad educativa.

Conclusiones

Permite la práctica de conceptos básicos de POO en Java.

La inclusión del diagrama UML facilita la comprensión de la estructura del sistema.

Es un sistema funcional y escalable que se puede mejorar con nuevas funcionalidades.