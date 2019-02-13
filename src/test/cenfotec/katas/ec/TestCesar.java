package test.cenfotec.katas.ec;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import cenfotec.katas.ec.EncriptaCesar;

	public class TestCesar {
		
		@Test
		public void cesarEncriptaValor0() {
			EncriptaCesar cesar = new EncriptaCesar(0);
			assertEquals('A', cesar.encriptarLetra('A'));
		}
		
		@Test
		public void cesarEncriptaValor2() {
			EncriptaCesar cesar = new EncriptaCesar(2);
			assertEquals('C', cesar.encriptarLetra('A'));
		}
		
		@Test
		public void cesarEncripta() {
			EncriptaCesar cesar = new EncriptaCesar(2);
			assertEquals("CDEF", cesar.encriptar("ABCD"));
		}
		
		@Test
		public void cesarDecifraValor2() {
			EncriptaCesar cesar = new EncriptaCesar(2);
			assertEquals('A', cesar.decifrarLetra('C'));
		}
		
		@Test
		public void cesarDecifra() {
			EncriptaCesar cesar = new EncriptaCesar(2);
			assertEquals("ABCD", cesar.decifrar("CDEF"));
		}
		

	}


