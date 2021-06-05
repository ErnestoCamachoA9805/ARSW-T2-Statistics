# Statistics - OODesing
>## Autor
>>**Ernesto Camacho Arroyave**
>
>>05/06/2021
>>
>>LOC:
>>170 lineas de codigo en 4 horas,
>>**42.5 LOC/h**

>## Class Diagram
>>![]()
>>Existen 3 clases en este proyecto, la clase principal **Statistics** que hace uso de la clase **LinkedListN** y esta a su vez hace uso de la clase **LinkenListNodeN**.
>>
>> La clase **Statistics**, tiene 3 matodos, el main que se encarga de llamar a los otors 2 y de imprimir los valores, la media y la derivacion estandar de los mismos. Tiene 4 variables propias, la LinkedList, el valor de la media y la derivacion estandar y finalemnte un formato para la impresion adecuada de los valores.
>>
>> La clase **LinkedListN** es una implementacion propia de una LinkedList que hace lo mejor para adaptarse al API collections, sin embargo, solo implementa las funciones que nesecita para las necesidades del proyecto, las demas funciones no han sido implementadas y retornan flase, null o nada dependiendo del caso.
La clase ademas cuenta con 3 atributos propios, estos siendo el nodo inicial, el final y el valor numerico de su tamaño.
>>
>>La clase **LinkedListNodeN** es una implementacion de de un nodo, tiene 2 atributos, el valor del elemento y si tiene un nodo siguiente, ademas cuenta con las funciones gets y sets necesarios para cambiar el valor del nodo y su siguiente.

>## Test Report
>>![]()
>>
>>![]()
>>Las pruebas usan los 2 archivos de prueba que se encuentran en la carpeta de Test dentro de Resources.

>## JavaDoc
>> La documentacion se encuentra en la carpeta de Resources, apidocs usando el index.html