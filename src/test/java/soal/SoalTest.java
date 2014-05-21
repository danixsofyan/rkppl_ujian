package soal;

import static org.junit.Assert.*;

import org.junit.*;

public class SoalTest {

	Soal s ;
	
	@Before
	public void awal(){
		System.out.println("Mulai Test");
	}
	
	@Test
	public void test1(){
		assertEquals("Hasilnya", 4, s.pangkat(2, 2));
	}
	
	@Test
	public void test2(){
		assertEquals("Seharusnaya", 6, s.perkalian(2, 3));
	}
	
	@Test
	public void test3(){
		assertEquals("Seharusnaya", 6, s.perkalian(2, 3));
	}
	
	@Test
	public void test4(){
		assertEquals("Seharusnaya", 6, s.perkalian(2, 3));
	}
	
	@Test
	public void test5(){
		assertEquals("Seharusnaya", 6, s.perkalian(2, 3));
	}
	
	@Test
	public void test6(){
		assertEquals("Seharusnaya", 6, s.perkalian(2, 3));
	}
	
	@After
	public void akhir(){
		System.out.println("Akhir Test");
	}
	
}
