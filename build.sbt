name := "starship"

version := "0.1"

scalaVersion := "2.12.6"

// set the main class for 'sbt run'
mainClass in (Compile, run) := Some("game.Main")

// set the main class for packaging the main jar
mainClass in (Compile, packageBin) := Some("game.Main")