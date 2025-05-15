# Proyecto Final - Sistema de Gestión de Gimnasio y Dojo

**Integrantes:**
- Daniel Martínez (00329519)  
- Jarod Tierra (00331798)  

**Fecha:** 16/05/2024

---

## Descripción General

Este proyecto final implementa una **aplicación híbrida de sistema de gestión para un gimnasio y un dojo de artes marciales**, combinando funcionalidades clave de ambos entornos en una sola interfaz. 

A través de un sistema basado en JavaFX, se gestionan estudiantes, instructores, informes, horarios y equipo, permitiendo una administración centralizada y eficiente.

---

## Estructura del Proyecto

La aplicación está dividida en diferentes módulos, cada uno con su respectivo controlador (`Controller`) y archivo FXML correspondiente. Los cinco módulos principales del menú son:

1. **Registrar Estudiantes**
2. **Registrar Instructores**
3. **Ver Informes**
4. **Ver Horarios Disponibles**
5. **Ver Equipo**

---

## Controladores Principales

### `RegistrarController`
Este controlador contiene los siguientes métodos:

- `void showEstud()`  
  Carga y muestra la vista para registrar estudiantes.

- `void showCliente()`  
  Carga y muestra la vista para registrar clientes del gimnasio.

- `void showMenu()`  
  Permite volver al menú principal.

Cada método utiliza `FXMLLoader` para cargar una nueva escena desde un archivo FXML y actualizar la ventana activa con la vista correspondiente.

---

## Funcionalidades Adicionales

En las diferentes escenas asociadas al registro de clientes y estudiantes, existen controladores específicos que permiten ingresar y almacenar los datos correspondientes. Se mantiene una lógica consistente en toda la aplicación: los atributos FXML son correctamente declarados e instanciados en los respectivos controllers.

---

## Clase Especial: Cardio

Se implementó una clase adicional denominada **Cardio**, pensada como un puente entre el gimnasio y las artes marciales. Esta clase ofrece una nueva alternativa de entrenamiento y está integrada en los módulos de horarios, informes y equipos.

---

