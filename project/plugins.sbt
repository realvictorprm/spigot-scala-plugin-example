addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.15.0")
lazy val sbtMavenResolver = RootProject(uri("https://github.com/sbt/sbt-maven-resolver.git"))
lazy val root = (project in file(".")).dependsOn(sbtMavenResolver)