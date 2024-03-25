# isa2024-healtcalc
Health calculator

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

