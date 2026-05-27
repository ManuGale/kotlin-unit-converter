# Kotlin Unit Converter

Proyecto desarrollado en Kotlin que permite realizar conversiones de distintas unidades como:

- Temperatura
- Longitud
- Peso
- Moneda

El proyecto aplica conceptos fundamentales de Kotlin como:

- Funciones
- Condicionales
- Ciclos
- Colecciones
- Operaciones funcionales
- Null Safety
- Data Classes

---

# Clonar repositorio

```bash
git clone https://github.com/ManuGale/kotlin-unit-converter.git
```

Entrar a la carpeta del proyecto:

```bash
cd kotlin-unit-converter
```

---

# Requisitos

## 1. Java JDK

### Descargar

https://www.oracle.com/java/technologies/downloads/

### Verificar instalación

```bash
java -version
javac -version
```

---

## 2. Kotlin Compiler

### Descargar

https://github.com/JetBrains/kotlin/releases

### Verificar instalación

```bash
kotlinc -version
```

---

# Estructura del proyecto

```plaintext
kotlin-unit-converter/
│
├── assets/
│   └── images/
│       ├── archivo-kotlin.png
│       ├── buscador-path.png
│       ├── guardado-kotlin.png
│       └── variables-sistema.png
│
├── src/
│   └── main/
│       └── kotlin/
│           │
│           ├── menu/
│           │   └── Menu.kt
│           │
│           ├── models/
│           │   └── Conversion.kt
│           │
│           ├── services/
│           │   ├── CurrencyConverter.kt
│           │   ├── LengthConverter.kt
│           │   ├── TemperatureConverter.kt
│           │   └── WeightConverter.kt
│           │
│           ├── utils/
│           │   └── Validator.kt
│           │
│           └── Main.kt
│
├── .gitignore
└── README.md
```

---

# Reglas del proyecto

- No trabajar directamente sobre la rama `main`.
- Cada integrante debe trabajar únicamente en su rama asignada.
- Realizar commits descriptivos y ordenados.
- No modificar archivos asignados a otros integrantes.
- Antes de subir cambios, actualizar el repositorio con `git pull`.
- Verificar que el proyecto compile correctamente antes de hacer push.
- Mantener el código organizado y comentado cuando sea necesario.
- Seguir la estructura de carpetas establecida del proyecto.

---

# Tecnologías utilizadas

- Kotlin
- Java JDK
- Git
- GitHub
- IntelliJ IDEA

---
