// Importamos las librerias que ocupamos
import org.apache.spark.ml.Pipeline
import org.apache.spark.ml.classification.{GBTClassificationModel, GBTClassifier}
import org.apache.spark.ml.evaluation.MulticlassClassificationEvaluator
import org.apache.spark.ml.feature.{IndexToString, StringIndexer, VectorIndexer}

// Cargamos el archivo txt de la ruta establecida
val data = spark.read.format("libsvm").load("sample_libsvm_data.txt")


//Crearmos una columna usando stringIndexer para que los datos tengan su categorización
val labelIndexer = new StringIndexer()
  .setInputCol("label")
  .setOutputCol("indexedLabel")
  .fit(data)
  
// Creamos un vector que tendra un maximo de 4 categorias
val featureIndexer = new VectorIndexer()
  .setInputCol("features")
  .setOutputCol("indexedFeatures")
  .setMaxCategories(4)
  .fit(data)

// Separamos los datos en dos partes, un llamado training con 70% y el otro test seta con 30%
val Array(trainingData, testData) = data.randomSplit(Array(0.7, 0.3))

