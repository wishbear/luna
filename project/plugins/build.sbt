resolvers ++= Seq("sbt-idea-repo" at "http://mpeltonen.github.com/maven/",
					"Web plugin repo" at "http://siasia.github.com/maven2")

libraryDependencies <+= sbtVersion(v => "com.github.siasia" %% "xsbt-web-plugin" % (v+"-0.2.10"))