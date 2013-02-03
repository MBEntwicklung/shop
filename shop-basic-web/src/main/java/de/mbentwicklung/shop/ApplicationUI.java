package de.mbentwicklung.shop;

import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

import de.mbentwicklung.shop.basic.entities.Product;
import de.mbentwicklung.shop.basic.services.ProductOverviewService;

public class ApplicationUI extends UI {

	@Autowired
	private ProductOverviewService productOverviewService;
	
	@Override
	protected void init(VaadinRequest request) {
		final VerticalLayout layout = new VerticalLayout();
		layout.setMargin(true);
		setContent(layout);

		for (final Product product : this.productOverviewService.getProducts()) {
			layout.addComponent(new Label(product.getName()));			
		}
	}

}
