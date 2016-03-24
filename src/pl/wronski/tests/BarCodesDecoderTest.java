package pl.wronski.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.math.BigDecimal;

import org.junit.Test;
import org.junit.internal.runners.statements.Fail;

import junit.framework.Assert;
import pl.wronski.exceptions.EmptyCodeBarException;
import pl.wronski.exceptions.NoSuchProductException;
import pl.wronski.model.BarCode;
import pl.wronski.model.Product;
import pl.wronski.util.BarCodesDecoder;

public class BarCodesDecoderTest {

	BarCodesDecoder decoder = new BarCodesDecoder();

	@Test
	public void testDecodeCodeBar() {
		BarCode validBarCode = new BarCode(2);
		Product product = new Product("Product 2", new BigDecimal(2 * 10));

		try {
			assertEquals(decoder.decode(validBarCode), product);
		} catch (EmptyCodeBarException e) {
		} catch (NoSuchProductException e) {
		}

		try {
			assertEquals(decoder.decode(null), product);
			fail("Exception not thrown (EmptyCodeBarException)");
		} catch (EmptyCodeBarException e) {
		} catch (NoSuchProductException e) {
			fail("Wrong exception thrown (NoSuchProductException)");
		}

	}
}
