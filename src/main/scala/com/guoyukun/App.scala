package com.guoyukun

import com.sun.research.ws.wadl.Application
import org.apache.spark.ml.classification.RandomForestClassifier

/**
 * Hello world!
 *
 */
object App extends Application {

  def main(args: Array[String]) {
    val rf = new RandomForestClassifier()
      .setLabelCol("indexedLabel")jhvkjhbkewqer
      .setFeaturesCol("indexedFeatures")
      .setNumTrees(10)
  }
}
