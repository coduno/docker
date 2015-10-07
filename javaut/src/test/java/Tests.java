// Adding imports is fine (JDK and JUnit 4 are in classpath).
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class Tests {
	@Test
	public void test() {
		assertFalse(false);
	}
}
