# ucse-prog2-2023-U2-Tomas

Ejercicio integrador de la Unidad 2 en la catedra Programacion 2

2- La primera prueba, llamada "streamFilter", utiliza el metodo "filter" de la biblioteca Stream para filtrar una coleccion de datos en serie. El resultado de la prueba indica que el sistema fue capaz de realizar 0,763 operaciones por segundo, con un error relativo de 0,232.

La segunda prueba, llamada "streamParallelFilter", utiliza el metodo "parallelStream" de la biblioteca Stream para procesar la misma coleccion de datos en paralelo. El resultado de la prueba indica que el sistema fue capaz de realizar 0,804 operaciones por segundo, con un error relativo de 0,180.

En terminos generales, estos resultados indican que el procesamiento en paralelo de la biblioteca Stream es ligeramente mas rapido que el procesamiento en serie para esta tarea especifica de filtrado de datos. Sin embargo, es importante tener en cuenta que los resultados pueden variar segun el tipo de datos y la tarea especifica que se este realizando, y que otros factores como la configuracion del sistema y la carga de trabajo tambien pueden influir en los resultados.
