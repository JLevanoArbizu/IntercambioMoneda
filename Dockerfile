# Usar una imagen base de OpenJDK 17
FROM openjdk:17-jdk-slim

# Establecer el directorio de trabajo en /app
WORKDIR /app

# Copiar el archivo JAR generado a la imagen
COPY target/intercambiomoneda-0.0.1-SNAPSHOT.jar app.jar

# Exponer el puerto que tu aplicación usará
EXPOSE 8080

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]
