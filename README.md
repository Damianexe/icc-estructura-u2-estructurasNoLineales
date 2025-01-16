Ejercicio 01:
Función insert
Propósito:
Inserta un valor en un árbol binario de búsqueda (BST, por sus siglas en inglés).
Detalles:
Parámetros:
Node root: La raíz del árbol.
int value: El valor a insertar.
Funcionamiento:
Si el nodo raíz (root) es null, se crea un nuevo nodo con el valor especificado y se devuelve.
Si el valor es menor que el valor del nodo raíz, se inserta recursivamente en el subárbol izquierdo.
Si el valor es mayor, se inserta en el subárbol derecho.
El método retorna la raíz del árbol después de insertar el valor.
Resultado:
El árbol mantiene su estructura de búsqueda, donde los valores menores están a la izquierda y los mayores a la derecha.

Ejercicio 02:
Función invertTree
Propósito:
Invierte un árbol binario, intercambiando los subárboles izquierdo y derecho en todos los niveles.
Detalles:
Parámetro:
Node root: La raíz del árbol.
Funcionamiento:
Si el nodo raíz es null, retorna null (caso base para árboles vacíos o subárboles vacíos).
Guarda temporalmente el subárbol izquierdo en una variable temp.
Asigna el subárbol derecho al lado izquierdo y el subárbol izquierdo al lado derecho (intercambio).
Llama recursivamente a invertTree para los subárboles izquierdo y derecho para continuar con el proceso en profundidad.
Retorna el nodo raíz modificado.
Resultado:
El árbol binario original queda invertido, con los subárboles izquierdo y derecho intercambiados en todos los niveles.

Ejercicio 03:
Función listLevels
Propósito:
Agrupa los valores de un árbol binario por niveles en una lista de listas enlazadas (List<LinkedList<Integer>>).
Detalles:
Parámetro:
Node root: La raíz del árbol.
Funcionamiento:
Caso base: Si el árbol está vacío (root == null), retorna una lista vacía.
Inicialización:
Crea una cola (Queue<Node> queue) para realizar un recorrido nivel por nivel (orden por niveles).
Añade la raíz del árbol a la cola.
Bucle principal:
Mientras la cola no esté vacía, procesa todos los nodos de un nivel:
Determina cuántos nodos hay en el nivel actual (size = queue.size()).
Crea una nueva lista enlazada (LinkedList<Integer> levelList) para almacenar los valores de este nivel.
Extrae los nodos del nivel actual de la cola, añade sus valores a la lista enlazada, y encola sus hijos (izquierdo y derecho) para el siguiente nivel.
Al finalizar el nivel, añade la lista enlazada al resultado (result.add(levelList)).
Retorna el resultado final, que es una lista de listas enlazadas.
Resultado:
Cada nivel del árbol está representado como una lista enlazada en el orden de aparición de los nodos.

Ejercicio04:
Función maxDepth
Propósito:
Determinar la profundidad máxima del árbol binario, que se define como la longitud del camino más largo desde la raíz hasta una hoja.
Detalles:
Parámetro:
Node root: La raíz del árbol.
Funcionamiento:
Caso base:
Si el árbol está vacío (root == null), retorna 0, porque un árbol vacío no tiene profundidad.
Recursión:
Calcula recursivamente la profundidad máxima del subárbol izquierdo (leftDepth).
Calcula recursivamente la profundidad máxima del subárbol derecho (rightDepth).
Retorno:
Retorna el valor máximo entre las profundidades izquierda y derecha más 1, para incluir el nivel actual.
Resultado:
La función retorna un entero que representa la profundidad máxima del árbol.
