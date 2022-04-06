# segundaprueva
crear 



##Ejercicios

En el examen te pedia una serie de consultas. 
Acontinuacion la resolucion de los ejercicios con la redaccion de este.


````

/*Todos los cursos realizados ordenados cronológicamente que muestre los siguientes campos:
1.1. nombre del curso
1.2. identificador del curso
1.3. número de horas del curso
1.4. profesor del curso ( nombre, apellido )*/
SELECT curso.curso,codigo_curso,horas,profesor.nombre,profesor.apellido,fecha
FROM profesor, imparticion,curso
WHERE profesor.id_profesor = imparticion.id_profesor AND imparticion.id_curso = curso.id_curso
ORDER BY fecha ASC;


/*Detalle de un curso, junto con las reseñas de los usuarios*/
SELECT
 	curso.curso AS 'nombre del curso',
	imparticion.codigo_curso,
	horas,
	profesor.nombre AS 'nombre profesor' ,
	profesor.apellido AS 'apellido profesor' ,
	fecha AS 'fecha de inicio',
	alumno.nombre AS 'nombre alumno',
	alumno.apellido AS 'apellido alumno' ,
	comentarios AS reseña
FROM profesor, imparticion,curso,alumno,participantes
WHERE imparticion.id_profesor = profesor.id_profesor 
AND imparticion.id_curso = curso.id_curso 
AND imparticion.codigo_curso = participantes.codigo_curso
AND participantes.id_alumno = alumno.id_alumno
AND imparticion.codigo_curso = 2
 ;
 
 /*SQL listar últimos 5
cursos*/

SELECT curso.curso FROM curso, imparticion
WHERE imparticion.id_curso = curso.id_curso
ORDER BY fecha ASC LIMIT 5 ; 

/*SQL listar últimos 5
usuarios creados*/
SELECT 
	alumno.nombre AS 'nombre alumno',
	alumno.apellido AS 'apellido alumno'
FROM alumno
ORDER BY id_alumno desc
LIMIT 5; 
	
/*SQL detalle curso más
número de reseñas*/
SELECT
	curso.curso AS 'nombre del curso',
	COUNT(comentarios)  AS reseña
FROM curso, imparticion, participantes
where imparticion.id_curso = curso.id_curso 
AND imparticion.codigo_curso = participantes.codigo_curso
GROUP BY participantes.codigo_curso
ORDER BY reseña DESC
LIMIT 1;

````