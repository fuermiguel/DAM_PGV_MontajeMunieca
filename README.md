# DAM_PGV_MontajeMunieca
 Ahora vamos a hacer un programa que se encargue de realizar una cadena de montaje (vamos a montar muñecas) con 3 procesos distintos. 
El proceso 1 va a colocar el cuerpo, este debe ser el primer proceso en ser ejecutado. Y una vez comienza, no podrá volver a colocar un cuerpo hasta que la muñeca entera haya sido montada.
El proceso 2 va a colocar la cabeza, no va a poder empezar hasta que el proceso 1 haya colocado el cuerpo. 
El proceso 3 va a colocar las extremidades, y tendrá que esperar a que el proceso 2 haya colocado la cabeza para poder colocar las extremidades. 
Para simular cada una de las acciones, simplemente se mostrará por pantalla “Numero Proceso – Cuerpo montado” y así para cada proceso de montaje. 
Se deben realizar un total de 3 muñecas, el proceso 1 indicará “Comienzo de proceso de muñeca X” antes de colocar el cuerpo, y el proceso 3 imprimirá “Finalización del proceso de muñeca X”, justos después de haber colocado la cabeza. 
