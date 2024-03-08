
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CryptoManagerTestStudent {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testIsStringInBounds() {
		assertTrue(CryptoManager.isStringInBounds("EGG"));
		assertTrue(CryptoManager.isStringInBounds("\"LIFE IS GREAT\""));
		assertFalse(CryptoManager.isStringInBounds("superman"));
		assertFalse(CryptoManager.isStringInBounds("{EGG"));
		assertFalse(CryptoManager.isStringInBounds("\"THIS TEST THAT WILL FAIL BECAUSE { IS OUTSIDE THE RANGE\""));
	}

	@Test
	void testCaesarEncryption() {
		assertEquals("The selected string is not in bounds, Try again.", CryptoManager.caesarEncryption("bye", 3));
		assertEquals("EGB7D799", CryptoManager.caesarEncryption("SUPEREGG", 50));
		assertEquals("YXOZSOMO", CryptoManager.caesarEncryption("ONEPIECE", 458));
		assertEquals("GNWIPNSLITR", CryptoManager.caesarEncryption("BIRDKINGDOM", 5));
		assertEquals("YJ[JTNN]", CryptoManager.caesarEncryption("PARAKEET", 9));
		assertEquals("V\"W\\!Z\\&V\"\"_", CryptoManager.caesarEncryption("CODINGISCOOL", 83));
	}

	@Test
	public void testDecryptCaesar() {
		assertEquals("BIRDKINGDOM", CryptoManager.caesarDecryption("GNWIPNSLITR", 5));
		assertEquals("ONEPIECE", CryptoManager.caesarDecryption("YXOZSOMO", 458));
		assertEquals("PARAKEET", CryptoManager.caesarDecryption("YJ[JTNN]", 9));
		assertEquals("THIS IS THE FINAL TEST", CryptoManager.caesarDecryption("5)*4A*4A5)&A'*/\"-A5&45", 33));
	}

	@Test
	public void testEncryptBellaso() {
		assertEquals("SV\"!SO3YUB", CryptoManager.bellasoEncryption("CUP OF TEA", "PARADISE"));
		assertEquals("MHWU 'GPYI'KF (", CryptoManager.bellasoEncryption("HAPPY BIRD DAY!", "EGG"));
		assertEquals("VWFUPGUXU4NT4XF&[FX", CryptoManager.bellasoEncryption("BREAKFAST IS SERVED", "TEA"));

	}

	@Test
	public void testDecryptBellaso() {
		assertEquals("CUP OF TEA", CryptoManager.bellasoDecryption("SV\"!SO3YUB", "PARADISE"));
		assertEquals("HAPPY BIRD DAY!", CryptoManager.bellasoDecryption("MHWU 'GPYI'KF (", "EGG"));
		assertEquals("BREAKFAST IS SERVED", CryptoManager.bellasoDecryption("VWFUPGUXU4NT4XF&[FX", "TEA"));

	}

}
