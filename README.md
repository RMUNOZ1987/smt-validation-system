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

* [Requerimientos](#-requerimientos)
* [Instalación](#-instalación)
* [Configuración](#-configuración)
* [Uso](#-uso)
* [Contribución](#-contribución)
* [Roadmap](#-roadmap)

---

## Requerimientos

### Software

* Java JDK 8 o superior
* MySQL Server
* IDE como IntelliJ IDEA o NetBeans

### Dependencias

* Conector JDBC para MySQL

---

## Instalación

1. Clonar el repositorio:

```bash
git clone https://github.com/tu-usuario/tu-repositorio.git
```

2. Abrir el proyecto en IntelliJ IDEA o NetBeans

3. Configurar la base de datos en MySQL

4. Ejecutar la clase principal del proyecto

---

## Configuración

Configurar la conexión a la base de datos en el archivo correspondiente:

```java
url = "jdbc:mysql://localhost:3306/smt_db";
user = "root";
password = "tu_password";
```

---

## Uso

### Usuario final

* Iniciar sesión
* Registrar nuevos modelos
* Completar checklist de validación
* Consultar estatus de modelos

### Administrador

* Gestionar usuarios
* Editar modelos
* Supervisar validaciones

---

## Contribución

1. Clonar repositorio
2. Crear nueva rama:

```bash
git checkout -b nueva-funcionalidad
```

3. Realizar cambios
4. Subir cambios:

```bash
git push origin nueva-funcionalidad
```

5. Crear Pull Request y esperar aprobación

---

## Roadmap

Futuras mejoras:

* Integración con archivos Excel
* Dashboard avanzado
* Notificaciones automáticas
* Integración con sistemas ERP
* Auditoría de cambios

---

## Producto

El sistema incluye:

* Aplicación en Java con interfaz gráfica
* Conexión a base de datos MySQL
* Funcionalidades básicas de gestión y validación

Además, se incluye:

* Video de demostración
* Archivo ejecutable (.jar)

---

## Metodología

Se utiliza control de versiones con Git, manejo de ramas (main/develop), integración continua y gestión de tareas mediante issues y pull requests.
