name := "hashids-scala"

organization := "pico-works"

crossScalaVersions := Seq("2.10.6", "2.11.8", "2.12.0")

version in ThisBuild := Process("./version.sh").lines.head.trim
