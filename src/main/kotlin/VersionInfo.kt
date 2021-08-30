object VersionInfo {

    fun getVersion(): String {
        val javaVersion = System.getProperty("java.version")
        val javafxVersion = System.getProperty("javafx.version")

        return "Hello, JavaFX $javafxVersion, running on Java $javaVersion."
    }
}