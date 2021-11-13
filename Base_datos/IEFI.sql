/*-------------------------------------------------------*/
/*Paso 01 Borra cualquier base de datos con ese nombre  */
/*-------------------------------------------------------*/
DROP DATABASE IF EXISTS iefi_programacion_1;
/*-------------------------------------------------------*/
/*Paso 02 Crea una base de datos con ese nombre         */
/*-------------------------------------------------------*/
CREATE DATABASE iefi_programacion_1;
/*-------------------------------------------------------*/
/*Paso 03 Seleciona una base de datos con ese nombre     */
/*-------------------------------------------------------*/
USE iefi_programacion_1;
/*-------------------------------------------------------*/
/*Paso 04 Creo tabla alumnos                             */
/*-------------------------------------------------------*/

CREATE TABLE `iefi_programacion_1`.`alumnos` 
( `id_alumno` INT NOT NULL AUTO_INCREMENT , 
`nombre` VARCHAR(60) NULL , 
`apellido` VARCHAR(60) NULL , 
`DNI` INT(8) NULL , 
PRIMARY KEY (`id_alumno`))
 ENGINE = InnoDB;




 INSERT INTO `alumnos` (`id_alumno`,
  `nombre`, 
  `apellido`, 
  `DNI`)
  VALUES (NULL, 'Brenda', 'Escobar', '35455222');

  INSERT INTO `alumnos` (`id_alumno`,
  `nombre`, 
  `apellido`, 
  `DNI`)
  VALUES (NULL, 'Monica', 'Antich', '22455632');

  INSERT INTO `alumnos` (`id_alumno`,
  `nombre`, 
  `apellido`, 
  `DNI`)
  VALUES (NULL, 'Juan', 'Lopez', '27355422');

  INSERT INTO `alumnos` (`id_alumno`,
  `nombre`, 
  `apellido`, 
  `DNI`)
  VALUES (NULL, 'Diego', 'Silva', '35555222');

  INSERT INTO `alumnos` (`id_alumno`,
  `nombre`, 
  `apellido`, 
  `DNI`)
  VALUES (NULL, 'Ivan', 'Massimino', '38664632');