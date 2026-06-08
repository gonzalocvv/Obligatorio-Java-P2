# Obligatorio Programación 2 — Sistema de Gestión de Postulantes

Obligatorio de la materia Programación 2, hecho en Java con NetBeans durante el segundo semestre de 2023.

Lo subo a GitHub tal cual fue entregado en su momento, sin refactorizar: la idea es que sirva como bitácora y se pueda ver el punto de partida frente a proyectos más recientes.

## Qué hace

Es una aplicación de escritorio (Swing) para gestionar un proceso de selección de personal. Permite:

- Registrar postulantes con sus datos personales (nombre, cédula, dirección, teléfono, mail, LinkedIn) y sus experiencias en distintas temáticas con un nivel asociado
- Registrar evaluadores, temáticas y puestos de trabajo (cada puesto requiere ciertas temáticas)
- Ingresar entrevistas, que vinculan un postulante con un evaluador, un puntaje y comentarios
- Dar de baja postulantes
- Consultar puestos y temáticas
- Guardar y cargar todos los datos en archivos de texto

## Estructura

El proyecto está separado en dos paquetes:

**`Dominio`** — las clases del modelo: `Postulante`, `Evaluador`, `Entrevista`, `Puesto`, `Tema`, `Experiencia`, más `Sistema` y las clases de archivos. Todas con atributos privados y getters, aplicando el encapsulamiento que se trabajó en la materia.

- `Sistema` es un singleton que centraliza las listas de postulantes, evaluadores, puestos, temas, entrevistas y cédulas (todas `ArrayList`), y tiene las validaciones de existencia (cédula repetida, nombre de tema o puesto ya registrado).
- `ArchivoGrabacion` y `ArchivoLectura` encapsulan la escritura y lectura de archivos de texto línea por línea (`Formatter` y `Scanner`).

**`Interfaz`** — las ventanas Swing, armadas con el GUI Builder de NetBeans: un menú principal (`MenuVentanas`) desde el que se abre cada funcionalidad (alta/baja de postulante, registros, ingreso de entrevista, consultas, guardado).

## Persistencia de datos

La parte más interesante del obligatorio. Los datos se guardan en un `.txt` plano usando un formato propio: cada línea es un registro, con los campos separados por `@` y el primer campo indicando el tipo de entidad. Por ejemplo:

```
Postulante@Juan Pérez@12345678@Av. Italia 1234@099123456@juan@mail.com@linkedin.com/juan@formato@Experiencia@Java@3
Tema@Java@Lenguaje de programación
Evaluador@Ana García@87654321@Bvar. Artigas 567@2020
Puesto@Desarrollador@Remoto@Tema@Java
Entrevista@12345678@87654321@85@Buen candidato@1
```

Como la escritura sigue siempre ese template, la lectura hace el camino inverso: se lee cada línea, se hace `split("@")` y según el primer elemento del array se reconstruye el objeto correspondiente y se agrega a las listas del `Sistema`. Las entrevistas se guardan referenciando las cédulas de postulante y evaluador, y al cargar se buscan los objetos reales en las listas para volver a vincularlos.

## Conceptos aplicados

- Programación orientada a objetos en un lenguaje fuertemente tipado
- Encapsulamiento (atributos privados, acceso por getters)
- Patrón Singleton para el estado global del sistema
- Colecciones (`ArrayList`) y recorridas con `for` clásico y for-each
- Lectura y escritura de archivos de texto con formato propio (serialización manual con strings y arrays)
- Interfaces gráficas con Swing y el GUI Builder de NetBeans
