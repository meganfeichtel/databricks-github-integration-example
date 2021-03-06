// Databricks notebook source
val someDF = Seq(
  (40, "bat"),
  (2, "mouse"),
  (25, "cat"),
  (5, "dog"),
  (100, "tiger"),
  (30, "horse")
).toDF("number", "word")

display(someDF)

// COMMAND ----------

val filtered = someDF.filter($"number" > 10)

display(filtered)

// COMMAND ----------

val filtered2 = someDF.filter($"number" <= 10)

display(filtered2)

// COMMAND ----------

val newDF = Seq(
  (1, "fish"),
  (8, "turtle")
).toDF("number", "word")

val union = someDF.union(newDF)

display(union.orderBy("number"))

// COMMAND ----------

