# Clean Architecture en Microservicios con Spring Boot

## 1)   ¿Cuál es el propósito principal de Clean Architecture en el desarrollo de software?

El propósito principal de Clean Architecture es separar las responsabilidades y dependencias del sistema, de modo que la lógica del negocio quede independiente de frameworks, bases de datos y detalles de infraestructura. Esto facilita la mantenibilidad, escalabilidad, testabilidad y adaptabilidad del software.

---

## 2)   ¿Qué beneficios aporta Clean Architecture a un microservicio en Spring Boot?

- Desacoplamiento entre capas, facilitando cambios sin romper otras partes.
- Mejora en la testabilidad (pruebas unitarias fáciles de implementar).
- Facilita la evolución del sistema (cambio de frameworks o DB sin afectar la lógica).
- Promueve un diseño claro y estructurado.
- Mejora la comprensión y mantenibilidad a largo plazo.

---

## 3)   ¿Cuáles son las principales capas de Clean Architecture y qué responsabilidad tiene cada una?

1. **Entidad (Entities)**: lógica del negocio más general y reutilizable.
2. **Casos de uso (Use Cases / Application Layer)**: reglas específicas de la aplicación; orquesta las entidades para lograr resultados de negocio.
3. **Adaptadores (Interface Adapters)**: controladores, presentadores, gateways — transforman datos entre las capas interiores y exteriores.
4. **Infraestructura (Frameworks & Drivers)**: frameworks, bases de datos, servicios externos, UI, etc.

---

## 4)   ¿Por qué se recomienda desacoplar la lógica de negocio de la infraestructura en un microservicio?

Porque permite:

- Cambiar tecnologías (DB, frameworks, APIs externas) sin reescribir la lógica de negocio.
- Reutilizar la lógica de negocio en otros contextos.
- Tener un código más limpio, enfocado en el dominio.

---

## 5)   ¿Cuál es el rol de la capa de aplicación y qué tipo de lógica debería contener?

El rol de la capa de aplicación es coordinar los casos de uso del sistema. No implementa reglas de negocio complejas, sino que orquesta entidades, interactúa con repositorios y maneja transacciones o flujos específicos de la aplicación.

---

## 6)   ¿Qué diferencia hay entre un UseCase y un Service en Clean Architecture?

- **UseCase**: representa una operación específica de negocio (ej: crear una orden). Es parte de la capa de aplicación.
- **Service**: en otros enfoques puede ser más general y contener tanto lógica de negocio como de infraestructura; en Clean Architecture, un Service podría ser un componente de la capa de infraestructura o un helper, pero los casos de uso siempre orquestan el flujo.

---

## 7)   ¿Por qué se recomienda definir Repositories como interfaces en la capa de dominio en lugar de usar directamente JpaRepository?

- Para evitar dependencia directa de JPA/Hibernate en el dominio.
- Para facilitar el cambio de tecnología de persistencia.
- Para facilitar pruebas unitarias con mocks/fakes.
- Para lograr una arquitectura más limpia y desacoplada.

---

## 8)   ¿Cómo se implementa un UseCase en un microservicio con Spring Boot y qué ventajas tiene?

1. Se define una clase que representa un caso de uso específico (por ejemplo, `CreateOrderUseCase`).
2. Se inyectan los repositorios (interfaces).
3. Se expone la lógica a través de controladores REST.

Ventajas:

- Claridad en la intención del código.
- Separación de responsabilidades.
- Facilita las pruebas.
- Mantenibilidad.

---

## 9)   ¿Qué problemas podrían surgir si no aplicamos Clean Architecture en un proyecto de microservicios?

- Código difícil de mantener.
- Mezcla de lógica de negocio con detalles de infraestructura.
- Alta dependencia de frameworks específicos.
- Dificultad para escalar o cambiar componentes.
- Problemas al realizar pruebas automatizadas.

---

## 10)  ¿Cómo Clean Architecture facilita la escalabilidad y mantenibilidad en un entorno basado en microservicios?

- Permite que cada microservicio evolucione de forma independiente.
- Facilita reemplazos tecnológicos sin afectar el dominio.
- Reduce el riesgo de deuda técnica.
- Mejora la claridad de propósito de cada componente.
- Simplifica la colaboración en equipos grandes.

---
