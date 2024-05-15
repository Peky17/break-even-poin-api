# Aplicación Spring Boot

Esta es una aplicación de ejemplo desarrollada con Spring Boot que proporciona funcionalidades relacionadas con operaciones financieras. La aplicación expone una API REST que permite realizar cálculos y obtener datos relacionados con operaciones financieras.

## Requisitos previos

Antes de ejecutar la aplicación, asegúrate de tener instalado lo siguiente:

- Java Development Kit (JDK) 17.
- Maven (opcional, si prefieres construir la aplicación desde el código fuente).

## a) Importar base de datos
Nota: En "application.properties" se establece que el puerto de la base de datos es el "3307". Sí tienes la base de datos MySQL en el puerto por defecto "3306" se debe cambiar esa propiedad o modificar el número de puerto del servidor de base de datos. 

Para la importación de la base de datos se recomienda copesr el contenido (SQL) y pegarlo en consola por medio del software cliente MySQL de su preferencia. Se recomienda HeidiSQL:
https://www.heidisql.com/

## b) Configuración

1. Clona o descarga el repositorio de la aplicación
2. Abre el proyecto en tu IDE preferido (por ejemplo, IntelliJ IDEA).

## Ejecución

Puedes ejecutar la aplicación de las siguientes maneras:

### 1. Desde el IDE

1. Abre el proyecto en tu IDE.
2. Busca la clase principal `Application.java` en el directorio `src/main/java`.
3. Haz clic derecho en la clase y selecciona "Run" o "Debug" para ejecutar la aplicación.

### 2. Desde la línea de comandos

1. Abre una ventana de terminal o línea de comandos.
2. Navega hasta el directorio raíz del proyecto.
3. Ejecuta el siguiente comando para compilar y empaquetar la aplicación:
  mvn clean install
4. Una vez que se haya generado el paquete de la aplicación, ejecuta el siguiente comando para iniciarla:
   java -jar target/nombre-del-archivo.jar

### 3. Documentación y prueba de los endpoint del API
## Ingresa a esta URL para acceder a la UI Swagger:
  http://localhost:8080/swagger-ui/index.html#/

### 4. Efectuar pruebas unitarias y de integración desde la línea de comandos
        `mvn test`
