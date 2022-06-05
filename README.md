# Enterprise-Java-Development-1.08

En este ejercicio tenemos a su vez varios ejercicios:
1. Realizo un método que acepta BigDecimal y lo devuelve como double redondeado a la centésima.
2. Realizo un método que acepta BigDecimal y lo devuelve invirtiendo el signo (positivo o negativo) y redondeándolo a la décima más cercana. 
3. Creo una clase abstracta `Car` de la que extienden tres clases `Sedan`, `UtilityVehicle` y `Truck`.
4. Creo una clase abstracta `Video` de la que derivan dos clases `TvSeries` y `Movie`
5. Creo una interfaz `IntList` con dos métodos: add y get. Y de la que implementan `IntArrayList` y `IntVector`.
   - En `IntArrayList`  almacena números de una array con una capacidad de 10 por defecto. Cuando se completa, creamos una nueva que incluye los elementos de la primera y aumenta en un 50% su capacidad. 
   - En `IntVector`  almacena números de una array con una capacidad de 20 por defecto. Cuando se completa, creamos una nueva que incluye los elementos de la primera y aumenta en el doble su capacidad.
   - Al comparar la eficiencia de `IntArrayList` y `IntVector` podemos decir que `IntVector` tiene que realizar menos ampliaciones que `IntArrayList` para el mismo número de datos añadidos (por ejemplo 21) ya que aumenta más la capacidad de `InVector` y tiene que recorrer menos veces el código.
  Por otro lado, `IntArrayList` es más eficiente con el uso de la memoria, ya que si queremos almacenar 21 valores, `IntArrayList` va a ocupar en memoria un tamaño de 23, y, `IntVector` ocupará un tamaño de 40 en memoria.
  
