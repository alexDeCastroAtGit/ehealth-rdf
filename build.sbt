name := "ehealth-rdf"

version := "1.0"

scalaVersion := "2.11.7"

//Creating dependencies for Jena and Sl4J

libraryDependencies ++= Seq(
  "org.apache.jena" % "apache-jena-libs" % "3.0.0",
  "org.apache.jena" % "jena-text" % "3.0.0",
  "net.rootdev" % "java-rdfa" % "0.4.2-RC2",   //RDFa
  "net.rootdev" % "java-rdfa-htmlparser" % "0.4.2-RC2",   //RDFa
  "org.slf4j" % "slf4j-api" % "1.6.4",
  "org.slf4j" % "slf4j-log4j12" % "1.6.4",
  "log4j" % "log4j" % "1.2.16",
  //"org.slf4j" % "slf4j-simple" % "1.6.4",
  "xml-apis" % "xml-apis" % "1.4.01",
  "org.apache.poi" % "poi-ooxml" % "3.8-beta5" exclude("xml-apis", "xml-apis"),
  "org.scalatest" % "scalatest_2.11" % "2.2.4" % "test"
)

//Adding sonatype resolver
resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

//Adding Apache
resolvers += "apache-snapshots-repo" at "https://repository.apache.org/content/repositories/snapshots/"
resolvers += "apache-staging-repo" at "https://repository.apache.org/content/repositories/staging/"
resolvers += "apache-releases-repo" at "https://repository.apache.org/content/repositories/releases/"
    