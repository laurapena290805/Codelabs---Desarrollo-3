# Attribute-Driven Design (ADD)

## 1)   ¿Cuál es el propósito principal de la metodología ADD?
ADD ayuda a diseñar arquitecturas de software a partir de los atributos de calidad (como rendimiento, seguridad, escalabilidad), no solo de las funcionalidades. Así se asegura que el sistema cumpla con los requisitos técnicos y no solo con "lo que hace".

## 2)   ¿Qué atributos de calidad se consideran en ADD y por qué son importantes?
Incluye rendimiento, seguridad, escalabilidad, disponibilidad, mantenibilidad, entre otros. Son importantes porque definen cómo debe comportarse el sistema, más allá de sus funciones.

## 3)   Explica la importancia de la selección del módulo a diseñar en ADD
Es clave porque se diseña la arquitectura de forma incremental, módulo por módulo. Se elige según:
- Su criticidad
- Riesgos
- Dependencias
- Impacto en atributos de calidad

## 4)   ¿Cómo influyen las tácticas arquitectónicas en la toma de decisiones dentro de ADD?
Guían decisiones concretas para lograr atributos de calidad.

Ejemplos:
- *Caching* para mejorar rendimiento.
- *Redundancia* para mejorar disponibilidad.

## 5)   ¿Cuál es la relación entre los escenarios de calidad y la evaluación de la arquitectura en ADD?
Los escenarios describen situaciones que deben cumplirse (ej.: “el sistema debe responder en <2s con 1000 usuarios”). Sirven para evaluar si la arquitectura lograda responde a estas necesidades.

## 6)   Describe los principales pasos del proceso ADD y cómo se interrelacionan
1. Entender requisitos y atributos de calidad
2. Elegir módulo a diseñar
3. Seleccionar tácticas
4. Refinar módulos e interfaces
5. Evaluar la arquitectura

Estos pasos son iterativos: al diseñar un módulo, puedes descubrir necesidades que hacen volver a ajustar etapas anteriores.

## 7)   ¿Por qué es crucial documentar las decisiones arquitectónicas en ADD?
Sirve para justificar decisiones y facilitar mantenimiento.

Elementos que se deben incluir:
- Atributos de calidad buscados
- Tácticas aplicadas
- Alternativas evaluadas y por qué se descartaron

## 8)   ¿Cómo evaluar si una arquitectura diseñada con ADD cumple con los atributos de calidad esperados?
Con pruebas, revisiones y validación de escenarios de calidad. Si los escenarios no se cumplen, se rediseña.

## 9)   ¿Cuáles son los beneficios de utilizar ADD en comparación con otros enfoques?
- Basado en atributos de calidad, no solo en funciones
- Ayuda a anticipar problemas
- Fomenta un diseño flexible y evolutivo

## 10)  ¿Qué desafíos pueden surgir al aplicar ADD y cómo abordarlos?
- Requiere experiencia en tácticas y evaluación
- Puede ser difícil consensuar los atributos prioritarios en el equipo

Se resuelve con buenas prácticas de comunicación, formación y trabajo iterativo.