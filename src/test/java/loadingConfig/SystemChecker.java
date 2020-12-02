package loadingConfig;

public interface SystemChecker {
	
	default boolean isMac() {
		String os = System.getProperty("os.name");
		return os.startsWith("Mac");

	}

}
