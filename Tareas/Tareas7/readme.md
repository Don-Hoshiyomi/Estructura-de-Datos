____________________________________________________________________
--------------------------Listas Ligadas----------------------------<br>

##  Métodos Incluidos

La clase ListaADT cuenta con los siguientes métodos principales:

### Verificación y Dimensiones
* esta_Vacia(): Comprueba si la lista tiene elementos o está vacía.
* get_tamaño(): Calcula dinámicamente y despliega la cantidad total de nodos.

### Inserción de Nodos
* agregar(T Valor): Inserta un elemento al final de la lista.
* agregarInicio(T Valor): Coloca un elemento al principio de la lista, actualizando el nodo head.
* agregarFinal(T Valor): Equivalente a agregar, asegura la inserción al último extremo disponible.
* agregar_despues_de(T parametro, T Valor): Busca el nodo que contenga el parametro e inserta el nuevo Valor inmediatamente después.

### Búsqueda y Actualización
* buscar(T valor): Encuentra e imprime el índice o posición exacta de la primera coincidencia del valor.
* actualizar(T valor_a_cambiar, T valor): Reemplaza un dato existente dentro de la lista por uno nuevo.

### Eliminación
* eliminar_primero(): Remueve el primer nodo de la lista (head).
* eliminar_ultimo(): Recorre la lista para eliminar el último nodo disponible.

### Visualización
* transversal(): Imprime secuencialmente en consola el contenido de todos los nodos activos.
