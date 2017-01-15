package test.java;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;


import org.junit.Test;

public class MyTestFile {

	@Test
	public void test() {
		assertThat("1", is("1"));
	}
}
