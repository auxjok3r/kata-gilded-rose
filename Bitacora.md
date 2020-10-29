En la Clase **GildedRose** existe mucho ,
según un analisis vemos que la mejor alternativa es usa el 
patrón Factory para crear los diferentes comportamintos.

Hemos creado una interfaz del cual deberian implementar todos nuestros 
comportamientos diferentes,hemos implementado las clases especificas para cada uno de los comportamientos.


**Code Semells**

Hemos encontrado los siguientes:

LongMethod.

LargeClass.

CodeDuplication.

Magic Number.

**Principios no respetados**

No se respetaba el principio de responsabilidad unica(SRP) en la clase GildedRose.

No se repetaba el prinicipio de abierto/cerrado(OCP) ya que en la clase anterior el metodo updateQuality() debía ser 
modificado para cada modificación.