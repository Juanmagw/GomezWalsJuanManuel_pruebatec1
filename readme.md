# Prueba Técnica Java Básico HACK A BOSS

##### Juan Manuel Gómez Wals

## Instrucciones para su uso

1. Se debe clonar éste mismo repositorio.

2. Iniciamos nuestro SGBBDD y crear la base de datos "empleados".

3. Importamos nuestro archivo empleados_empleado.sql a nuestra base de datos y se crearán tanto las columnas como las filas guardadas en él.

4. Iniciamos nuestro proyecto y verificamos que funciona correctamente.

## Ejecución

El programa consta de un menú que nos indica las opciones a elegir y según nuestra respuesta, el programa lanza una serie de instrucciones que el usuario deberá rellenar.

## Acciones

- Se pueden añadir empleados a la BBDD.

- Se pueden modificar los datos del los empleados ya registrados en la BBDD.

- Se pueden recoger todos los registros de empleados que no están 'borrados' en la BBDD.

- Se pueden eliminar empleados de la BBDD por mediod e borrado lógico.

- Se pueden recoger los registros de un sólo empleado por su ID.

- Se pueden recoger los registros de empleados cuyo cargo es el mismo en la BBDD

## Supuestos

- Suponemos que al crear empleados, el cargo será una cadena en singular con género masculino para así poder buscar un usuario por cargo.

- Suponemos que al insertar datos por consola no existe la posibilidad de dejar en blanco los campos que se pidrn por scanner.

## Tecnologías usadas

> Lenguaje -> Java (JDK 17)

> Persistencia -> EclipseLink (JPA 2.1)

> IDE -> NetBeans (17)