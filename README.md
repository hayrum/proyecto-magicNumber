"# AntiPatterner Magic Number

## Descripción del Proyecto

**AntiPatterner Magic Number** es una aplicación Android educativa que demuestra el **patrón anti-patrón de números mágicos** y cómo eliminarlo mediante buenas prácticas de programación.

## ¿Qué es el Anti-patrón Magic Number?

Un **número mágico** es una constante numérica que aparece directamente en el código sin explicación, lo que dificulta su mantenimiento y entendimiento. Por ejemplo, usar `3.14159` directamente en el código en lugar de una constante bien nombrada como `Math.PI`.

## Estructura del Proyecto

El proyecto está dividido en **dos enfoques principales**:

### 1. **MainActivity** (CON Magic Numbers - Anti-patrón)
- **Ubicación**: `MainActivity.kt`
- **Problema**: Utiliza números mágicos hardcodeados (`3.14159`) en las funciones de cálculo
- **Funciones**:
  - `calculateArea(radio)`: Calcula el área de un círculo usando `3.14159 * radio * radio`
  - `calculatePerimeter(radio)`: Calcula el perímetro usando `2 * 3.14159 * radio`

### 2. **MainActivityWithOutMagicNumber** (SIN Magic Numbers - Solución)
- **Ubicación**: `MainActivityWithOutMagicNumber.kt`
- **Solución**: Utiliza la constante `Math.PI` a través del patrón Repository
- **Componentes**:
  - **Interfaces** (`interfaces/`):
    - `ICalculateArea`: Interfaz para cálculo de área
    - `ICalculatePerimeter`: Interfaz para cálculo de perímetro
  - **Repositories** (`repositories/`):
    - `CalculateAreaRepository`: Implementa cálculo de área usando `Math.PI`
    - `CalculatePerimeterRepository`: Implementa cálculo de perímetro usando `Math.PI`

## Tecnologías Utilizadas

- **Lenguaje**: Kotlin
- **Framework UI**: Jetpack Compose (Material Design 3)
- **Gradle**: Build system con versiones de librerías centralizadas
- **Android SDK**: Target API 36, Mínimo API 24

## Objetivos Educativos

1. **Identificar** anti-patrones en el código (números mágicos)
2. **Comparar** código con y sin buenos nombres de constantes
3. **Aplicar** patrones como Repository para mejor mantenibilidad
4. **Usar** interfaces para abstraer la lógica de negocio
5. **Mantener** código limpio y fácil de entender

## Cómo Ejecutar

1. Abre el proyecto en Android Studio
2. Compila y ejecuta en un emulador o dispositivo físico
3. Observa los logs de salida de ambas actividades para ver el resultado de los cálculos

## Cambio de Actividad Principal

Por defecto, `MainActivity` (con magic numbers) es la actividad de inicio. Para cambiar a `MainActivityWithOutMagicNumber` (solución), descomenta el intent-filter en `AndroidManifest.xml`." 
