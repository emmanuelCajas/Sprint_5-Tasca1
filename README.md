# Sprint_5-Tasca1
Spring-Boot-API-rest+Aplicacion-Web

Descripción
En esta tarea realizarás un CRUD (Create, Read, Update, Delete) que pueda ser llamado como API Rest y, también, como aplicación web.
Aprenderás a usar correctamente los verbos HTTP y gestionar los códigos de respuesta.

Nivel 1

Ejercicio aplicación Web CRUD con MySQL
Accede a la página  -> https://start.spring.io/ , y genera un proyecto Spring boot con las siguientes características:

PROYECT  (gestor de dependencias): Maven o Gradle
LANGUAGE: Java
SPRING BOOT: La última versión estable
PROYECTO METADATA
Group: cat.itacademy.barcelonactiva.apellidos.nombre.s05.t01.n01
Artifact: S05T01N01ApellidosNombre
Name: S05T01N01ApellidosNombre
Description: S05T01N01ApellidosNombre
Package name: cat.itacademy.barcelonactiva.apellidos.nombre.s05.t01.n01
PACKAGIN: Jar
JAVA: Mínimo versión 11 
Dependencias: Spring Boot DevTools, Spring Web, Spring Data JPA, MySQL Driver, Thymeleaf

Tenemos una entidad llamada  Sucursal , que dispone de las siguientes propiedades:
-           Integer pk_SucursalID
-           String nombreSucursal
-           String paisSucursal
También tenemos una DTO llamada SucursalDTO, que tendrá las mismas propiedades que la entidad Sucursal, añadiendo una:
-           String tipoSucursal.
Esta propiedad, en función del país de la sucursal, deberá indicar si es “UE” o “Fuera UE”. Para ello puedes tener una lista privada en la misma DTO (por ejemplo: List<String> países), con los países que forman parte de la UE.
Aprovechando la especificación  JPA , deberás persistir la entidad  Sucursal  en una base de datos  MySql , siguiendo el patrón  MVC .
El consejo es que  SucursalDTO  la utilices en el Controller y la Vista, y  Sucursal  en el Repository. La capa de servicios será la encargada de realizar la traducción entre ambas.
Para ello, dependiendo del package principal, crearás una estructura de packages, donde ubicarás las clases que necesites:
-           cat.itacademy.barcelonactiva.apellidos.nombre.s05.t01.n01.controllers
-           cat.itacademy.barcelonactiva.apellidos.nombre.s05.t01.n01.model.domain
-           cat.itacademy.barcelonactiva.apellidos.nombre.s05.t01.n01.model.dto
-           cat.itacademy.barcelonactiva.apellidos.nombre.s05.t01.n01.model.services
-           cat.itacademy.barcelonactiva.apellidos.nombre.s05.t01.n01.model.repository

La clase ubicada en el paquete controllers ( SucursalController , por ejemplo), deberá ser capaz de dar respuesta a las siguientes peticiones para actualizar y consultar información:
http://localhost:9000/sucursal/add
  
http://localhost:9000/sucursal/update
  
http://localhost:9000/sucursal/delete/{id}
  
http://localhost:9000/sucursal/getOne/{id}

http://localhost:9000/sucursal/getAll

Como puedes ver, en el archivo application.properties, deberás configurar que el puerto a utilizar sea el 9000.

La vista deberá estar desarrollada con  Thymeleaf .

Para hacerla más atractiva, puedes usar opcionalmente alguna librería CSS que te facilite, como bootstrap, tailwind, material, etc.

Nivel 2

Ejercicio API Rest CRUD con MySQL
Accede a la página  -> https://start.spring.io/ , y genera un proyecto Spring boot con las siguientes características:

PROYECT  (gestor de dependencias): Maven o Gradle
LANGUAGE Java
SPRING BOOT: La última versión estable
Group: cat.itacademy.barcelonactiva.apellidos.nombre.s05.t01.n02
Artifact: S05T01N02ApellidosNombre
Name : S05T01N02ApellidosNombre
Description: S05T01N02ApellidosNombre
Package name: cat.itacademy.barcelonactiva.apellidos.nombre.s05.t01.n02
PACKAGIN: Jar
JAVA Mínimo versión 11 
Dependencias: Spring Boot DevTools, Spring Web, Spring Data JPA, MySQL Driver

Tenemos una entidad llamada  FlorEntity , que dispone de las siguientes propiedades:

-           Integer pk_FlorID

-           String nombreFlor

-           String paisFlor

 

También tenemos una DTO llamada  FlorDTO , que tendrá las mismas propiedades que la entidad Sucursal, añadiendo una:

-           String tipo Flor.

Esta propiedad, en función del país de origen de la flor, deberá indicar si es “UE” o “Fuera UE”. Para ello puedes tener una lista privada en la misma DTO (por ejemplo: List<String> países), con los países que forman parte de la UE.

Aprovechando la especificación  JPA , deberás persistir la entidad  FlorEntity  en una base de datos  MySQL , siguiendo el patrón  MVC .

El consejo es que  FlorDTO  la utilices en Controller, y  FlorEntity  en Repository. La capa de servicios será la encargada de realizar la traducción entre ambas.

Para ello, dependiendo del package principal, crearás una estructura de packages, donde ubicarás las clases que necesites:

-           cat.itacademy.barcelonactiva.apellidos.nombre.s05.t01.n02.controllers

-           cat.itacademy.barcelonactiva.apellidos.nombre.s05.t01.n02.model.domain

-           cat.itacademy.barcelonactiva.apellidos.nombre.s05.t01.n02.model.dto

-           cat.itacademy.barcelonactiva.apellidos.nombre.s05.t01.n02.model.services

-           cat.itacademy.barcelonactiva.apellidos.nombre.s05.t01.n02.model.repository

La clase ubicada en el paquete controllers ( FlorController , por ejemplo), deberá ser capaz de dar respuesta a las siguientes peticiones para actualizar y consultar información:

http://localhost:9001/flor/add

http://localhost:9001/flor/update

http://localhost:9001/flor/delete/{id}

http://localhost:9001/flor/getOne/{id}

http://localhost:9001/flor/getAll

Como puedes ver, en el archivo application.properties, deberás configurar que el puerto a utilizar sea el 9001.

Importante

Tendrás que tener en cuenta las buenas prácticas de diseño de las API, utilizando correctamente los códigos de error y las respuestas en caso de invocaciones incorrectas. (Puedes consultar información sobre ResponseEntity).

Tienes que incluir  swagger  para que cualquier desarrollador/a pueda tener una idea rápida de los recursos de que dispone la API.

Nivel 3

Ejercicio API Rest conectada a otra API Rest
Accede a la página  -> https://start.spring.io/ , y genera un proyecto Spring boot con las siguientes características:

PROYECT  (gestor de dependencias): Maven o Gradle
LANGUAGE: Java
SPRING BOOT: La última versión estable
PROYECTO METADATA
Group: cat.itacademy.barcelonactiva.apellidos.nombre.s05.t01.n03
Artifact: S05T01N03ApellidosNombre
Name: S05T01N03ApellidosNombre
Description: S05T01N03ApellidosNombre
Package name: cat.itacademy.barcelonactiva.apellidos.nombre.s05.t01.n03
PACKAGING: Jar
JAVA:minimo versión 11 
Dependencias: Spring Boot DevTools, Spring Web

Usando  RestTemplate  o  WebClient , deberás conectarte a la API que has realizado en el nivel 2, para llamar y testar todas las peticiones que permite esta API.

Ten en cuenta que en esta tarea del nivel 3 no tienes ninguna referencia a ninguna base de datos, ni necesitas utilizar JPA, ya que tu repositorio accederá a la API del nivel 2.

No necesitas crear una Vista, porque este nivel 3 está previsto como una API Rest, pero tendrás que crear todas las capas hasta el controlador como cualquier otra aplicación:

-           cat.itacademy.barcelonactiva.apellidos.nombre.s05.t01.n03.controllers

-           cat.itacademy.barcelonactiva.apellidos.nombre.s05.t01.n03.model.domain

-           cat.itacademy.barcelonactiva.apellidos.nombre.s05.t01.n03.model.dto

-           cat.itacademy.barcelonactiva.apellidos.nombre.s05.t01.n03.model.services

-           cat.itacademy.barcelonactiva.apellidos.nombre.s05.t01.n03.model.repository

 

La clase controladora, deberá ser capaz de atender a las siguientes peticiones:

http://localhost:9002/flor/clientFlorsAdd

http://localhost:9002/flor/clientFlorsUpdate

http://localhost:9002/flor/clientFlorsDelete/{id}

http://localhost:9002/flor/clientFlorsGetOne/{id}

http://localhost:9002/flor/clientFlorsAll

Como puedes ver, en el archivo application.properties, deberás configurar que el puerto a utilizar sea el 9002.

Para probar el nivel 3, deberás tener en marcha la API del nivel 2. No tendrás problemas, puesto que la API del nivel 3 trabaja con el puerto 9002 y la del nivel 2 con el puerto 9001.

Importante

Tienes que incluir  swagger  para que cualquier desarrollador/a pueda tener una idea rápida de los recursos de que dispone la API.
