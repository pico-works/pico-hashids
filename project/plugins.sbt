resolvers += "Typesafe Repository" at "https://repo.typesafe.com/typesafe/releases/"

addSbtPlugin("org.xerial.sbt"     % "sbt-sonatype"        % "3.9.2")
addSbtPlugin("com.jsuereth"       % "sbt-pgp"             % "2.0.1")
addSbtPlugin("org.scoverage"      % "sbt-scoverage"       % "1.6.1")
addSbtPlugin("com.codacy"         % "sbt-codacy-coverage" % "3.0.3")
addSbtPlugin("com.frugalmechanic" % "fm-sbt-s3-resolver"  % "0.19.0")
