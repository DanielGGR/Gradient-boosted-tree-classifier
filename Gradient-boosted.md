# Gradient-boosted-tree-classifier

## ¿Qué son los árboles de decisión con refuerzo de gradiente?

Gradient boosting o Potenciación del gradiente, es una técnica de aprendizaje automático utilizado para el análisis de la regresión y para problemas de clasificación estadística, el cual produce un modelo predictivo en forma de un conjunto de modelos de predicción débiles, típicamente árboles de decisión. Construye el modelo de forma escalonada como lo hacen otros métodos de boosting, y los generaliza permitiendo la optimización arbitraria de una función de pérdida diferenciable. 

El gradiente es el ajuste incremental realizado en cada paso del proceso; el refuerzo es un método para acelerar la mejora de la precisión de la predicción hasta un valor suficientemente óptimo.

La idea de la potenciación del gradiente fue originada en la observación realizada por Leo Breiman en donde el Boosting puede ser interpretado como un algoritmo de optimización en una función de coste adecuada. Posteriormente Jerome H. Friedman desarrolló algoritmos de aumento de gradiente de regresión explícita, simultáneamente con la perspectiva más general de potenciación del gradiente funcional de Llew Mason

## ¿Por qué son importantes?

Los árboles de decisión con refuerzo de gradiente son un método popular para resolver problemas de predicción en los dominios de clasificación y regresión. El enfoque mejora el proceso de aprendizaje simplificando el objetivo y reduciendo el número de iteraciones para llegar a una solución suficientemente óptima. Los modelos con refuerzo de gradiente han demostrado una y otra vez su valía en diversas competiciones de clasificación tanto por su precisión como por su eficacia, lo que los convierte en un componente fundamental en el kit de herramientas del científico de datos.

 

##  Ventajas y desventajas de GBDT

### Ventajas
Se puede obtener una mayor precisión con relativamente menos tiempo para el ajuste de parámetros.

Puede procesar de manera flexible varios tipos de datos, incluidos valores continuos y discretos, y tiene una amplia gama de usos.

Puede utilizar algunas funciones de pérdida robustas, que son más robustas para los valores atípicos, como la función de pérdida de Huber.
### Desventajas
Existe una relación de dependencia entre los alumnos débiles, lo que dificulta entrenar datos en paralelo.

Su implementación puede dificultarse entre mayor sea la demanda computacional.


## Entradas y salidas

Se pueden destacar 3 campos en la aplicación de estos árboles en Scala según la documentación de Spark:

###labelCol:
Columna compuesta de valores tipo Double, la entrada será una etiqueta que representa lo que se pretende predecir.
###featuresCol:
Vector compuesto de la características de nuestra predicción.
###predictionCol:
Columna compuesta de valores Double que serán los valores ya predichos, este es un campo de salida


## Aplicaciones

Loa árboles de decisión con refuerzo gradiente pueden ser usados en el campo de aprendizaje para valorar, el cual, es una aplicación del machine learning para construir modelos de valoración para sistemas de retorno de información. Compañias como Yahoo y Yandex usan variantes de este sistema para este mismo propósito. En el Gran Colisionador de Hadrones (LHC), haciendo uso de una mezcla de árboles de decisión con refuerzo gradiente y redes neuronales profundas (DNN) lograron reproducir los resultados de los métodos de análisis sin aprendizaje automático en conjuntos de datos utilizados para descubrir el bosón de Higgs. 


## Etiquetas

Esta técnica puede ser identificada por diferentes nombres, su autor Friedman introdujo esta técnica como "Gradient Boosting Machine" (GBM). Otros describen la clase generalizada del algoritmo como "Functional Gradient Boosting"; una forma avanzada de esta tecnica es conocida como "Multiple Additive Regression Trees" (MART). Finalmente, una implementación muy popular para r es conocida como "Generalized Boosting Model" u otro "XGBoost".
