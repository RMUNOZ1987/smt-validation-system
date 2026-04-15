# Sistema de Gestión y Validación de Nuevos Modelos en SMT

## Descripción

Sistema desarrollado para gestionar y visualizar el estado de validación de nuevos modelos en procesos SMT (Surface Mount Technology). Permite dar seguimiento estructurado a cada modelo mediante checklists, control de revisiones y monitoreo de estatus.

---

## Objetivo

Permitir a las áreas de ingeniería, calidad y producción dar seguimiento en tiempo real al avance de validación de modelos, mejorando la trazabilidad, reduciendo errores y optimizando la toma de decisiones.

---

## Problema identificado

En los procesos actuales de validación de modelos SMT se presentan diversas problemáticas:

* Falta de control centralizado
* Uso de registros manuales o dispersos
* Dificultad para conocer el estatus real de validaciones
* Errores humanos en el seguimiento
* Baja trazabilidad de cambios y revisiones

---

## Solución

El sistema propuesto permite:

* Registrar nuevos modelos SMT
* Gestionar validaciones mediante checklists digitales
* Visualizar el estado de cada modelo en tiempo real
* Editar información para correcciones
* Administrar usuarios del sistema

---

## Arquitectura

El sistema está basado en una arquitectura de tres capas:

* **Interfaz gráfica (GUI):** Java (Swing)
* **Lógica de negocio:** Java
* **Base de datos:** MySQL

---

## Tabla de Contenidos

* [Requerimientos](#requerimientos)
* [Instalación](#instalación)
* [Configuración](#configuración)
* [Uso](#uso)
* [Contribución](#contribución)
* [Roadmap](#roadmap)

---

## Requerimientos

### Software

* Java JDK 8 o superior
* MySQL Server
* IDE como IntelliJ IDEA o NetBeans

### Dependencias

* Conector JDBC para MySQL

### Infraestructura

* Servidor de aplicación: Java (JVM local)
* Base de datos: MySQL Server local
* Cliente: Aplicación de escritorio (Swing)

---

## Instalación

1. Clonar el repositorio:

```bash
git clone https://github.com/RMUNOZ1987/smt-validation-system.git
