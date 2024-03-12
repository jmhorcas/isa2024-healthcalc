<!--HEAD-->
# isa2024 - healtcalc
## Objetivos
Se desea desarrollar una calculadora que permita estimar varios parámetros de salud de una persona, como su peso ideal o su tasa metabólica basal (TMB).
## Introducción
Se ha creado este repositorio para realizar la práctica 1, que consiste en realizar la ya nombrada calculadora para ello hemos hecho uso de git, github, de los entornos Maven y JUnits5.
### Contenidos a tener en cuenta
* `idealWeight`: Necesita los vaores de altura y género y su salida será el peso considerado Ideal
* `basalMetabolicRate`: Se necesita peso, altura, género y la edad del individuo, para así poder obtener el metabolismo ideal.

## Test utilizados en idealWeight():
* Test de altura negativa testAlturaNegativaIW() &rarr; comprobamos que cuando una altura es muy pequeña o incluso o negativa. Se lanza la excepción correctamente.

* Test de altura excesivamente pequeña testAlturaMenor() &rarr; comprobamos que cuando la altura es inferior a la altura promedio establecida que en este caso es de 110 para los hombre y 100 para las mujeres, se lanza la excepción correctamente.

* Test de Error a la hora de introducir el género testGenderProblemIW() &rarr; comprobamos que cuando añadimos un dato en el género distinto de W o M , sin tener en cuenta mayúsculas y minúsculas, se lanza la excepción con normalidad.

* Test para comprobar que la calculadora funciona con todos los casos de géneros disponibles CorrectGender() &rarr; comprobamos todas las posibles combinaciones de géneros para comprobar que ninguna de ellas lanza la excepción.

* Test para cuando la altura es superior a lo esperado testAlturaMayor()  &rarr; comprobamos que cuando la altura supera la altura máxima establecida por el programa (260 , puesto que el individuo más alto hasta la fecha que sigue con vida mide 251).

* Test de cálculo promedio de hombres HombrePromedioIW()  &rarr; usando los valores inferior y superior máximos que se pueden introducir y el valor promedio, comprobamos que los resultados obtenidos sean los esperados tanto en los límites inferior/superior como en el valor promedio.

* Test de cálculo promedio de mujeres testMujerPromedio() &rarr; usando los valores superiores e inferiores al igual que el valor medio comprobamos que los resultados de la calculadora sean los esperados.

## Test utilizados en basalMetabolicRate():
* Test para los pesos que no sean correctos PesoIncorrecto() &rarr; Se hacen 3 distintas comprobaciones, *la primera* es para cuando el valor del peso se da en negativo y se tienque lanzar excepción, *la segunda* es para cuando el valor del peso es inferior a lo delimitado en el rango, se lanza la excepción y *la tercera* es para cuando se excede el rango superior de peso y también se lanza la excepción.

* Test pra la altura incorrecta alturaIncorrecta() &rarr; Se hacen también 3 distintas comprobaciones, *la primera* de ellas es para cuando el valor dado sea en negativo, *la segunda* es para cuando el valor dado sea inferior al rango permitido, y *la tercera*  es para cuando el valor sea superior a lo permitido, en cualquira de los casos se comprueba que se lanza la excepción.

* Test para comprobar el Sexo IncorrectoSexo() &rarr; Se comprueba que cuando se introduzca un sexo que sea distinto de "M" o "W" sin tener en cuenta las máyusculas y minúsculas salte la excepción.

* Test de comprobación de sexos ComprobacionSexo() &rarr; Se comprueba que cuando se introducen de manera correcta las posibilidades de los sexos, no se lance ninguna excepción.

* Test para comprobar los valores promedios de la mujer testWomanBRM() &rarr; Se comprueba que tanto para el límite superior, como para el inferior, como para el el promedio de las mujeres se realicen bien los cálculos.

* Test para comprobar los valores promedios de los hombres testMenBMR()&rarr; Se comprueba tanto para el límite superior, como para el inferior, como para el valor promedio del hombre se obtiene el resultado esperado.

## Ejcución de los Test:
Para realizar la ejecución de maven en Visual Studio Code, tendremos que abrir la terminal y escribir el siguiente comando:

![código para poner](https://github.com/Rvbenrch/isa2024-healthcalc/blob/main/image.png)
