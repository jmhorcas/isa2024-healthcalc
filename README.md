# isa2024-healtcalc
Health calculator

# Práctica 1

## Tests a realizar
- El género es recogido correctamente por el método para calcular el peso ideal
- Las cuentas del método para calcular el peso ideal se realizan de forma correcta, habrá un test para hombre y otro para mujer
- El género es recogido correctamente por el método para calcular el BMR.
- Las cuentas se realizan correctamente para calcular el BMR, un test para hombres y otro para mujeres
- Si la altura introducida en el método para calcular el peso ideal es menor de 0 (o igual) se devuelve una excepción (independientemente del género).
- Si la altura introducida en el método para calcular el peso ideal es mayor de 3 metros (300cm), se lanzará una excepción
- Si la edad introducida es menor de 0, se lanzará una excepción (método para calcular BMR.
- Si el peso introducido para calcular el BMR es menor o igual de 0 se lanzará una excepción.
- Si la altura introducida para calcular el BMR es menor de 0 (o igual), se lanzará una excepción.
- Si la altura introducida para calcular el BMR es mayor de 3, se lanzará una excepción.
- Si la altura para calcular el peso ideal es menor que 100 cm en el caso de los hombres, no da resultados coherentes, por lo que se comprobará que, si la altura introducida es menor de 100, se lance una excepción.

***
El fichero TEST-healthcalc.HealthCalcTest.xml no se genera, por lo que pondremos una imagen que demuestra que nuestro tests han sido aprobados:

![Imagen de los tests pasados por nuestro programa](/tests_pasados.jpeg)

***
Imagen de gitk con los commits realizados:

![Imagen de los commits realizados](/gitk.jpg)

Como podemos observar, hemos realizados más commits de los necesarios para la inserción de la primera imagen, esto es debido a que no aparecía la imagen en este fichero en GitHub. Además, cabe destacar que este último para que se vea esta actualización no aparece en la imagen, pues la tenemos que hacer después de su inserción.


# Práctica 2

## Diagrama de casos de uso
![Imagen de los diagramas de casos de uso](/fotoCasosDeUso.jpg)

## Especificación de casos de uso

Calcular el peso ideal

- Primary actor: usuario aplicación
- Scope: la aplicación de la calculadora debe de permitir ingresar correctamente, el sistema calcula correctamente el peso idea y muestra los datos al usuario. Además, si hay algún error, por ejemplo al ingresar el usuario los datos, el sistema debe de ser capaz de manejarlos.
- Level: summary
- Stakeholders and Interests: el usuario que quiere conocer su peso ideal y la aplicación que es la encargada de calcularlo.
- Preconditions: el usuario inicia la aplicación, ingresa los datos y selecciona que quiere calcular su peso ideal.
- Minimal Guarantee: la aplicación tiene que tratar los datos del paciente conforme a la política de privacidad del país y garantizar un resultado correcto dentro de un error máximo especificado en la misma.
- Success guarantee: para mostrar que tiene éxito mostrar la fórmula seguida por nuestra aplicación.
- Trigger: el evento final que dispara el cálculo del peso ideal es que el usuario seleccione que lo que desea es calcular su peso ideal.
- Main success scenario: el usuario incia la aplicación, ingresa sus datos, selecciona la opción que quiere, que en este caso debe de ser calcular el peso ideal, la aplicación realiza las cuentas y devuelve el peso ideal calculado.
- Alternative Scenario: en el momento en el que la aplicación va a realizar los cálculos ve que el usuario ha introducido mal uno o varios de los datos solicitados, por lo que se vuelven a pedir hasta que son correctos y se puede seguir el curso normal de hacer el cálculo y mostrar el resultado.
- Extensions: si el usuario decide volver atrás la aplicación debe volver a la página en la que se selecciona qué medida desea que se calcule.

# Practica 3
Historias de Usuario

1. Cálculo del peso ideal de una persona:
- Como: usuario
- Quiero: poder introducir mis datos en la aplicación
- Para: obtener el cálculo de mi peso ideal
- Criterios de aceptación:
- Escenario 1: los datos son introducidos correctamente y se devuelve el peso D>
- Escenario 2: los datos se han introducido de forma incorrecta: Dado: el usuar>
2. Cálculo de BMR de una persona:
- Como: usuario
- Quiero: poder introducir mis datos en la aplicación
- Para: obtener el cálculo de mi tasa metabolica basal
- Criterios de aceptación:
- Escenario 1: los datos son introducidos correctamente y se devuelve la BMR Da>
- Escenario 2: los datos se han introducido de forma incorrecta: Dado: el usuar>

# Practica 4
![Imagen de la interfaz](/interfaz.png)

![Imagen de la interfaz](/interfaz2.png)
