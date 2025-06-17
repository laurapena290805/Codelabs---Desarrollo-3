# Attribute-Driven Design (ADD) y Clean Architecture

## ¿Qué es Attribute-Driven Design (ADD) y cuál es su propósito?

ADD es un método para diseñar arquitecturas de software basándose en los *atributos de calidad* (rendimiento, seguridad, escalabilidad, mantenibilidad, etc.). Su propósito es asegurar que la arquitectura soporte no solo la funcionalidad del sistema, sino también cómo debe comportarse.

---

## ¿Cómo se relaciona ADD con Clean Architecture?

ADD se usa para definir qué cualidades debe tener la arquitectura (por ejemplo, ser fácil de mantener o escalar). Clean Architecture aporta una estructura de capas que facilita lograr esas cualidades. Es decir, ADD dice *qué necesitamos* y Clean Architecture ayuda a definir *cómo organizarlo*.

---

## ¿Cuáles son los pasos principales de ADD?

1. Entender los requisitos (funcionales + atributos de calidad)
2. Identificar escenarios de calidad
3. Seleccionar tácticas arquitectónicas
4. Elegir el módulo a diseñar
5. Refinar los módulos y sus interfaces
6. Evaluar la arquitectura (contra los atributos de calidad)
7. Iterar según resultados

---

## ¿Cómo se identifican los atributos de calidad y por qué son importantes?

Se identifican conversando con los *stakeholders* (usuarios, clientes, equipo).  
Son importantes porque determinan las prioridades técnicas que guiarán las decisiones de diseño.  
Ejemplo: un sistema bancario priorizará seguridad; un e-commerce, rendimiento.

---

## ¿Por qué Clean Architecture complementa ADD en la implementación?

Porque Clean Architecture:
- Separa responsabilidades
- Mantiene el dominio independiente de frameworks
- Facilita cambios en tecnologías sin afectar la lógica del negocio

Esto apoya atributos como mantenibilidad, portabilidad y testabilidad.

---

## ¿Qué criterios considerar al definir las capas en Clean Architecture con ADD?

- Los atributos de calidad buscados
- Complejidad del dominio
- Necesidades de integración con otros sistemas
- Tácticas arquitectónicas seleccionadas
- Separación entre lógica de negocio y detalles de infraestructura

---

## ¿Cómo ADD ayuda a tomar decisiones basadas en necesidades del negocio?

Porque se parte de entender los requisitos del negocio y los atributos de calidad que más lo impactan.  
Así, las decisiones técnicas no son solo “moda” sino que responden a necesidades reales.

---

## ¿Cuáles son los beneficios de combinar ADD con Clean Architecture en microservicios?

- Arquitectura más alineada con las necesidades del negocio
- Diseño modular que facilita escalar o cambiar componentes
- Independencia entre capas, lo que mejora mantenibilidad
- Claridad en la separación de responsabilidades
- Facilidad para aplicar pruebas unitarias y de integración

---

## ¿Cómo se asegura que la arquitectura cumpla con los atributos de calidad definidos en ADD?

- Revisiones arquitectónicas basadas en los escenarios de calidad
- Pruebas de carga, seguridad, mantenibilidad (según los atributos buscados)
- Evaluaciones continuas durante el desarrollo iterativo
- Retroalimentación constante de los stakeholders

---

## ¿Qué herramientas o metodologías ayudan a validar una arquitectura ADD + Clean Architecture?

- **ATAM (Architecture Tradeoff Analysis Method)**
- **ADR (Architecture Decision Records)**
- **Pruebas automatizadas**
- **Revisiones por pares**
- **Modelos de evaluación de calidad (por ejemplo, ISO/IEC 25010)**

---
