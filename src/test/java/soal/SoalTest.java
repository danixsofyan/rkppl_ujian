package soal;

import static org.junit.Assert.*;

import org.junit.*;

public class SoalTest {

	Soal s = new Soal();
	
	@Before
	public void awal(){
		System.out.println("Mulai Test");
	}
	
	@Test
	public void test1(){
		assertEquals("Seharusnaya", 10, s.perkalian(2, 5));
	}
	
	@Test
	public void test2(){
		assertEquals("Seharusnaya", 10, s.perkalian(2, 5));
	}
	
	@Test
	public void test3(){
		assertEquals("Seharusnaya", 2, s.faktorial(2));
	}
	
	@Test
	public void test4(){
		assertEquals("Seharusnaya", 2, s.faktorial(4));
	}
	
	@Test
	public void test5(){
		assertEquals("Seharusnaya", 6, s.pangkat(2, 4));
	}
	
	@Test
	public void test6(){
		assertEquals("Seharusnaya", 6, s.pangkat(2, 4));
	}
	
	@After
	public void akhir(){
		System.out.println("Akhir Test");
		
	}
	
}
