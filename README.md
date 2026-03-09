# ForoHub API

Proyecto de API REST diseñado para la gestión de tópicos en un foro de discusión, desarrollado como parte del programa de formación backend de Alura. La aplicación garantiza la integridad y seguridad de los datos mediante autenticación basada en tokens JWT.

## Tecnologías utilizadas

* **Java 17**
* **Spring Boot 3**
* **Spring Security** (Autenticación y Autorización)
* **JWT (JSON Web Token)**
* **Spring Data JPA** (Hibernate)
* **PostgreSQL**
* **Maven**

## Seguridad y Autenticación

El sistema implementa un flujo de seguridad profesional:

1. **Autenticación**: Endpoint `/login` que verifica credenciales contra la base de datos y retorna un token firmado.
2. **Autorización**: Uso de un `SecurityFilter` personalizado que intercepta cada petición HTTP para validar el token JWT en el encabezado.
3. **Gestión de Sesión**: Implementación de `Stateless` (sin estado) para escalar la aplicación de forma eficiente.



## Cómo probar la API

### 1. Obtener Token de Acceso
Realiza una petición `POST` a `http://localhost:8080/login` con el siguiente JSON:

```json
{
  "login": "admin@forohub.com",
  "clave": "tu_contraseña"
}