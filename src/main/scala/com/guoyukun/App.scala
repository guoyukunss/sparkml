package com.guoyukun

import org.apache.spark.ml.classification.RandomForestClassifier

/**
 * Hello world!
 *
 */
object App extends Application {

  def main(args: Array[String]) {
    val rf = new RandomForestClassifier()
      .setLabelCol("indexedLabel")
      .setFeaturesCol("indexedFeatures")
      .setNumTrees(10)
  }
}
