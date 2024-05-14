#!/bin/bash

# Zdefiniuj ścieżkę do pliku JAR Twojej aplikacji
JAR_PATH="C:/Users/Maciej Korsakowski/Desktop/trainingApp/src/main/java/org/example/Main.jar"

# Pełna ścieżka do Java
JAVA_PATH="C:\Users\Maciej Korsakowski\.jdks\openjdk-22\bin\java"

# Uruchom aplikację Java
"$JAVA_PATH" -jar "$JAR_PATH"

# Zatrzymaj terminal
echo "Naciśnij Enter, aby kontynuować..."
read
