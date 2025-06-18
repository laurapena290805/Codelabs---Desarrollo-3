# Domain-Driven Design (DDD)

## 1)   ¿Qué es DDD y cuál es su objetivo principal?
Es un enfoque de diseño que se centra en el “dominio” del problema (la lógica del negocio), para que el software refleje ese conocimiento de manera clara y precisa.

## 2)   Diferencia entre Entidad y Objeto de Valor
- **Entidad:** tiene identidad propia (ejemplo: Cliente con ID único).
- **Objeto de Valor:** no tiene identidad, su valor depende de sus atributos (ejemplo: Dirección).

## 3)   ¿Qué es un Bounded Context y por qué es importante?
Un límite dentro del cual un modelo de dominio tiene un significado específico. Es importante para evitar confusión cuando la misma palabra puede tener diferentes significados en distintos contextos.

## 4)   ¿Cuál es el propósito del Lenguaje Ubicuo?
Un lenguaje común entre desarrolladores y expertos del negocio. Ayuda a que todos hablen de lo mismo, sin ambigüedades.

## 5)   ¿Qué es un Agregado y cómo garantiza la consistencia en el dominio?
Un conjunto de entidades y objetos de valor que se tratan como una unidad para garantizar consistencia. Tiene una raíz (root) que controla el acceso.

## 6)   ¿Cómo se relacionan los Repositorios con la infraestructura de persistencia?
Proveen una abstracción para acceder a objetos del dominio sin preocuparse de la infraestructura de persistencia (por ejemplo: bases de datos).

## 7)   ¿Qué son los Eventos de Dominio?
Mensajes que indican que algo relevante ha sucedido en el dominio. Facilitan la comunicación entre *Bounded Contexts* y mejoran la escalabilidad.

## 8)   Diferencia entre Servicios de Aplicación y Servicios de Dominio
- **Aplicación:** orquestan tareas del negocio (no contienen lógica del dominio).
- **Dominio:** contienen lógica que no pertenece a una entidad o agregado específico.

## 9)   ¿Cómo facilita DDD el diseño de sistemas complejos y escalables?
Permite dividir el sistema en partes pequeñas (Bounded Contexts), modeladas de acuerdo al negocio, facilitando su evolución y escalado.

## 10)  ¿Cómo combinar DDD con Clean Architecture en microservicios?
Se combinan bien porque:
- DDD ayuda a definir claramente el dominio de cada microservicio.
- Clean Architecture asegura separación de capas y dependencia hacia el dominio.

Resultado: sistemas más limpios, mantenibles y escalables.