# Curso de Udemy Automation Selenium con Java y Cucumber

## Tecnologías y herramientas utilizadas

![Framework utilizado](https://i.imgur.com/iO84mHX.png)

* **Java** como lenguaje de programación
* **Selenium WebDriver** para interactuar con el browser de forma automatizada
Selenium es un conjunto de API's open source que podemos utilizar para interactuar con el navegador. Solamente sirve para aplicaciones web.
* **Cucumber** para estructurar los tests mediante Features y su implementación por steps definitions
* **Gradle** como building tool, para compilar el proyecto
* **Visual Studio Code** como IDE, editor de código
* **Git y GitHub** como gestor de versiones

## Pasos para la instalación del framework

1. **Instalar Java JDK**: Descargar Java JDK 15 desde la [Web](https://www.oracle.com/java/technologies/javase-downloads.html)
2. **Instalar el IDE de preferencia**: En este caso [Visual Studio Code](https://code.visualstudio.com/)
3. **Descargar chromedriver**: Desde la [web oficial](https://chromedriver.chromium.org/downloads) y guardarlo en un directorio que recordemos. Ej en C:/ o en la raiz de nuestro usuario.
4. **Descargar extensiones en VSCode**: Gradle Language Support y Gradle Tasks en VSCode.
5. **Descargar Gradle**: la última versión desde [la web oficial](https://gradle.org/releases/). Descomprimir, guardarlo en C:/ y renombrar la carpeta a "gradle".
6. **Configurar variables de entorno de Windows**
Añadimos C:\gradle\bin a la variable PATH
Añadimos tambien la ruta donde guardamos el chromedriver al PATH si aun no lo estaba


## Notas realizadas

* **ChromeDriver Capabilities**

[Documentación oficial](https://chromedriver.chromium.org/capabilities)
Acá nos dice como usar un custom profile de chrome para la ejecución, lo que permite por ejemplo utilizar el caché. Probar si esto sirve para el caso de que necesitamos la misma página para todos los test(ej un login) y al ejecutarlo de cero demora mucho en cargar.