TP Integrador – IEFI Programación I
El presente trabajo práctico se plantea con una mirada integral en conjunto con las asignaturas Desarrollo
Web y Práctica Profesionalizante. Es por ello que lo desarrollado en esta actividad
proyecto presentado en Práctica Profesionalizante I.
Consigna:
1. El proyecto integrador consiste en desarrollar una aplicación del tipo interfaz de consola
desarrolladas hasta el momento en la materia) que pueda g
Gestor de Base de Datos).
El recomendado es MySQL, (no obligatoriamente
de la materia Base de Datos de la carrera.
Se utilizará una tabla con las características
2. Definir una clase que contendrá el programa principal
realizar en la base de datos. Esto se debería poder realizar con un menú principal (Switch case), el
cual me permitirá seleccionar las distintas operaciones y accesos a la base de datos, luego de
haberme podido conectar a la misma.
Las operaciones y accesos a la base de datos
a. Consultar datos o registros (QUERY).
b. Registrar datos o registros (INSERT).
c. Modificar datos o registros (UPDATE).
d. Eliminar datos o registros (DELETE).
3. Para ello deberá respetar el paradigma de la
Desde el programa principal, deberá
conexión y los accesos (a la base de datos),
ejecutará el menú de operaciones permitidas y posibles.
La aplicación deberá respetar:
● Modularización
● Encapsulamiento.
● Métodos constructores creados para tal fin.
● Métodos Getter y Setter creados para tal fin.
● Patrón de herencia en caso
que ustedes lo consideren
Y se deberán respetar los siguientes ítems y pasos a
Crear una base de datos (en su preferencia con
denominada “Alumnos”, con cuatro columnas.
Digitales - Base de Datos
. actividad,
generar una conexión a un SGBD (Sistema
obligatoriamente) ya que el mismo está siendo usado en el cursado
descriptas más abajo en este documento.
principal, desde donde se llamarán a todas las acciones a
. rá que deberá permitir la aplicación serán:
programación orientada a objetos.
llamar a otra/as clase/es que internamente
ón de tal forma que en la clase principal, solamente se
de que se decida utilizarlo. (no obligatoriamente, solo en caso en
consideren)
cumplir (obligatoriamente
MySQL) con el nombre de IEFI y una tabla
, “id_alumno” del tipo autoincremental,
- Ciclo Lectivo 2021 - 1
, debe ser acorde al
CLI (cómo las
na ) ás documento..
contendrán la
obligatoriamente):
)
Tecnicatura Superior en Desarrollo Web y Aplicaciones Di
“nombre” del tipo Varchar,
Sobre lo creado, generar el código Java correspondiente que nos permita:
1) Insertar los registros con los datos de los estudiantes del equipo de trabajo (datos r
2) Listar todos los registros.
3) Ingresar un alumno más en este caso sería
identidad “123”.
4) Modificar el DNI de “Juan Perez
5) Borrar el registro incorporado.
Para cada acción en la clase
contemple insertar, listar,
Conjuntamente con método que
El valor de cada punto realizado correctamente y funcional equivale a un 20% del trabajo.
El trabajo deberá ser exportado cómo proyecto (o en su defecto mínimamente los archivos
contienen el código de la aplicación) y
Pautas de presentación:
Los documentos subidos y enviados debe
TP, profesor, alumnos (grupo), asignatura y ciclo lectivo.
Además el/los archivo/s (código o proyecto de la aplicación)
estructura:
IEFI_TP_INTEGRADOR_Apellido_Nombre.