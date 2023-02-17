# LAB3AREP

Tercer taller de la asignatura, en este se aplicaron conocimientos de HTTP, Sockets, HTML, JS, MAVEN, GIT.

### Prerrequisitos

Para ejecutar el laboratorio se debe tener instalado:

```
- Java
- Maven
- Git
```

### Instalación

Debe usarse el comando git clone para descargar el repositorio

```
git clone https://github.com/santiago-f20/LAB3AREP
```
Una vez descargado, en la carpeta del proyecto se debe ejecutar el siguiente comando para compilar el proyecto

```
mvn clean package
```
* Windows
![](img/16.png)
![](img/17.png)

* Linux
![](img/18.png)
![](img/19.png)

Para ejecutar el proyecto en Windows se debe usar el comando

```
java -cp target/classes;target/dependency/* edu.eci.arep.HttpServer
```
![](img/21.png)
En Linux se debe usar el siguiente comando

```
java -cp target/classes:target/dependency/* edu.eci.arep.HttpServer
```
![](img/20.png)
Una vez iniciado el servidor, se puede acceder a la pagina principal en el siguiente link

```
http://localhost:35000
```

### Uso

* Página Principal
Windows
![](img/1.png)
Linux
![](img/22.png)

* Página hello
![](img/3.png)
![](img/2.png)
![](img/23.png)

* Página hello con parametros
![](img/7.png)
![](img/4.png)
![](img/5.png)
![](img/24.png)

* Página sample.html
![](img/9.png)
![](img/8.png)
![](img/6.png)
![](img/25.png)

* Página sample.css
![](img/10.png)
![](img/11.png)
![](img/26.png)

* Página sample.js
![](img/13.png)
![](img/12.png)
![](img/27.png)

* Página sample.png
![](img/14.png)
![](img/15.png)

## Documentación

Para generar la documentación del proyecto se debe ejecutar el siguiente comando

```
mvn javadoc:javadoc
```
Para ver la documentación se debe abrir el archivo index.html que se encuentra en la carpeta target/site/apidocs

### Estructura del proyecto

```
.
│
├───src
│   ├───main
│   │   ├───java
│   │   │   └───edu
│   │   │       └───eci
│   │   │           └───arep
│   │   │                   Controller.java
│   │   │                   HttpServer.java
│   │   │
│   │   └───resources
│   │       └───static
│   │           │   index.html
│   │           │
│   │           └───files
│   │                   eci.png
│   │                   sample.css
│   │                   sample.html
│   │                   sample.js
│   │
│   └───test
│       └───java
│           └───edu
│               └───eci
│                   └───arep
│                           AppTest.java
```

## Construido con

* [Maven](https://maven.apache.org/) - Dependency Management
* [JAVA](https://www.java.com/es/download/) - Lenguaje de programación

## Autor

* **Santiago Fetecua** - [santiago-f20](https://github.com/santiago-f20)
