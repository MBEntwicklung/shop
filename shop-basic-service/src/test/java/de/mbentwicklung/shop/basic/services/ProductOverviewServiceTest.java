/**
 * 
 */
package de.mbentwicklung.shop.basic.services;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;

import org.jmock.Expectations;
import org.jmock.integration.junit4.JUnitRuleMockery;
import org.junit.Before;
import org.junit.Test;

import de.mbentwicklung.shop.basic.entities.Product;
import de.mbentwicklung.shop.basic.repositories.ProductRepository;

/**
 * 
 * @author Marc Bellmann <marc.bellmann@mb-entwicklung.de>
 */
public class ProductOverviewServiceTest {

	private static final List<Product> PRODUCTS = Arrays.asList(
			new Product("Name 1", "Text 1"), 
			new Product("Name 2", "Text 2"), 
			new Product("Name 3", "Text 3")
	);

	private ProductOverviewServiceImpl productOverviewService;
	private ProductRepository productRepository;

	private JUnitRuleMockery mockContext = new JUnitRuleMockery();

	@Before
	public void init() throws Exception {
		this.productOverviewService = new ProductOverviewServiceImpl();

		this.productRepository = this.mockContext.mock(ProductRepository.class);

		this.productOverviewService.setProductRepository(this.productRepository);
	}

	@Test
	public void sollteAlleProdukteLaden() throws Exception {

		this.mockContext.checking(new Expectations() {
			{
				allowing(productRepository).findAllAvailableProducts();
				will(returnValue(PRODUCTS));
			}
		});

		assertThat(this.productOverviewService.getProducts(), is(PRODUCTS));
	}

}
