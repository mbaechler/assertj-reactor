package reactor.assertj.util.function;

import org.junit.jupiter.api.Test;

import reactor.assertj.ReactorAssertions;
import reactor.util.function.Tuple7;
import reactor.util.function.Tuples;

import static org.assertj.core.api.Assertions.assertThatCode;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

class Tuple7AssertTest {

	final Tuple7<String, Integer, Long, String, Integer, Integer, Integer>       testData  = Tuples.of("example", 123, 45L, "fourth", 5, 6, 7);
	final Tuple7Assert<String, Integer, Long, String, Integer, Integer, Integer> assertion = ReactorAssertions.assertThat(testData);

	@Test
	void hasT1() {
		assertThatCode(() ->
				assertion.hasT1("example")
		).doesNotThrowAnyException();
	}

	@Test
	void hasT1Fails() {
		assertThatExceptionOfType(AssertionError.class).isThrownBy(() ->
				assertion.hasT1("examples")
		).withMessage("Expected Tuple7 to have first part <examples> but was <example>");
	}

	@Test
	void hasT2() {
		assertThatCode(() ->
				assertion.hasT2(123)
		).doesNotThrowAnyException();
	}

	@Test
	void hasT2Fails() {
		assertThatExceptionOfType(AssertionError.class).isThrownBy(() ->
				assertion.hasT2(1234)
		).withMessage("Expected Tuple7 to have second part <1234> but was <123>");
	}

	@Test
	void hasT3() {
		assertThatCode(() ->
				assertion.hasT3(45L)
		).doesNotThrowAnyException();
	}

	@Test
	void hasT3Fails() {
		assertThatExceptionOfType(AssertionError.class).isThrownBy(() ->
				assertion.hasT3(46L)
		).withMessage("Expected Tuple7 to have third part <46> but was <45>");
	}

	@Test
	void hasT4() {
		assertThatCode(() ->
				assertion.hasT4("fourth")
		).doesNotThrowAnyException();
	}

	@Test
	void hasT4Fails() {
		assertThatExceptionOfType(AssertionError.class).isThrownBy(() ->
				assertion.hasT4("foorth")
		).withMessage("Expected Tuple7 to have fourth part <foorth> but was <fourth>");
	}

	@Test
	void hasT5() {
		assertThatCode(() ->
				assertion.hasT5(5)
		).doesNotThrowAnyException();
	}

	@Test
	void hasT5Fails() {
		assertThatExceptionOfType(AssertionError.class).isThrownBy(() ->
				assertion.hasT5(6)
		).withMessage("Expected Tuple7 to have fifth part <6> but was <5>");
	}

	@Test
	void hasT6() {
		assertThatCode(() ->
				assertion.hasT6(6)
		).doesNotThrowAnyException();
	}

	@Test
	void hasT6Fails() {
		assertThatExceptionOfType(AssertionError.class).isThrownBy(() ->
				assertion.hasT6(7)
		).withMessage("Expected Tuple7 to have sixth part <7> but was <6>");
	}

	@Test
	void hasT7() {
		assertThatCode(() ->
				assertion.hasT7(7)
		).doesNotThrowAnyException();
	}

	@Test
	void hasT7Fails() {
		assertThatExceptionOfType(AssertionError.class).isThrownBy(() ->
				assertion.hasT7(8)
		).withMessage("Expected Tuple7 to have seventh part <8> but was <7>");
	}
}
