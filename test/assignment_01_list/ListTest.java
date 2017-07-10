package assignment01;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ListTest {
	List<String> list;
	@Before
	public void setup(){
		list = new List<>();
	}
	@Test
	public void oneElement() {
		list.add("a");
		assertEquals(1,list.getIndex("a"));
	}
	@Test
	public void emptyList() {
		assertEquals(-1,list.getIndex("a"));
	}
	@Test
	public void middleElement() {
		list.add("e");
		list.add("d");
		list.add("c");
		list.add("b");
		list.add("a");
		assertEquals(4,list.getIndex("d"));
	}
	@Test
	public void lastElement() {
		list.add("e");
		list.add("d");
		list.add("c");
		list.add("b");
		list.add("a");
		assertEquals(5,list.getIndex("e"));
	}
	@Test
	public void nonExistingElement() {
		list.add("e");
		list.add("d");
		list.add("c");
		list.add("b");
		list.add("a");
		assertEquals(-1,list.getIndex("x"));
	}

}