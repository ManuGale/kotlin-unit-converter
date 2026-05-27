# CONTRIBUTING GUIDE

Guía de colaboración para el proyecto Kotlin Unit Converter.

---

# Reglas generales

- No trabajar directamente sobre la rama `main`.
- Cada integrante debe utilizar únicamente su rama asignada.
- No modificar archivos pertenecientes a otros módulos.
- Mantener el código organizado y legible.
- Verificar que el proyecto compile antes de subir cambios.
- Realizar commits descriptivos.
- Hacer `git pull` antes de comenzar a trabajar.

---

# Estructura de ramas

| Rama                          | Responsable            | Función                             |
| ----------------------------- | ---------------------- | ----------------------------------- |
| feature-main-menu             | Líder - Manuel Galeana | Menú principal y README             |
| feature-temperature-converter | Gabriel Cetz           | Conversión de temperatura           |
| feature-length-converter      | Carlos Buendia         | Conversión de longitud              |
| feature-weight-converter      | Raymundo Vela          | Conversión de peso                  |
| feature-currency-utils        | Emilio Loeza           | Conversión de moneda y validaciones |

---

# Flujo de trabajo

## 1. Clonar repositorio

```bash
git clone URL_DEL_REPOSITORIO
```

---

## 2. Entrar al proyecto

```bash
cd kotlin-unit-converter
```

---

## 3. Cambiar a tu rama

Ejemplo:

```bash
git checkout feature-temperature-converter
```

---

## 4. Subir cambios

```bash
git add .
git commit -m "Add temperature conversion functions"
git push
```

---

# Convención de commits

Utilizar mensajes claros y descriptivos.

## Ejemplos

```bash
git commit -m "Add weight conversion menu"
```

```bash
git commit -m "Fix currency conversion validation"
```

```bash
git commit -m "Update README documentation"
```

---

# Archivos por integrante

## Líder - Manuel Galeana

- Main.kt
- Menu.kt
- README.md

## Gabriel Cetz

- TemperatureConverter.kt

## Carlos Buendia

- LengthConverter.kt

## Raymundo Vela

- WeightConverter.kt

## Emilio Loeza

- CurrencyConverter.kt
- Validator.kt
- Conversion.kt

---

# Importante

Antes de solicitar merge:

- Verificar que no existan errores.
- Probar funcionalidades agregadas.
- Confirmar que el código siga la estructura del proyecto.
