package de.mbentwicklung.shop.basic.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 * Repräsentiert eine Kategorie, in die Produkte eingeordnet werden können
 * 
 * @author Marc Bellmann <marc.bellmann@mb-entwicklung.de>
 */
@Entity
@Table(name = "CATEGORIES")
public class Category extends AbstractPersistable<Long> {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -9080437845695953351L;

	/**
	 * übergeordnete Kategorie (nullable)
	 */
	private Category rootCategory;

	/**
	 * Name der Kategorie
	 */
	private String name;

	/**
	 * JPA Konstruktur
	 */
	Category() {
		super();
	}

	/**
	 * Konstruktor
	 * 
	 * @param rootCategory übergeordnete Kategorie (nullable)
	 * @param name Name der Kategorie
	 */
	public Category(final Category rootCategory, final String name) {

		super();
		this.rootCategory = rootCategory;
		this.name = name;
	}

	/**
	 * Getter
	 * 
	 * @return übergeordnete Kategorie (nullable)
	 */
	public Category getRootCategory() {
		return rootCategory;
	}

	/**
	 * Setter
	 * 
	 * @param rootCategory übergeordnete Kategorie (nullable)
	 */
	public void setRootCategory(Category rootCategory) {
		this.rootCategory = rootCategory;
	}

	/**
	 * Getter
	 * 
	 * @return Existiert zur Kategorie eine übergeordnete Kategorie
	 */
	public boolean hasRootCategory() {
		return this.rootCategory != null;
	}

	/**
	 * Getter
	 * 
	 * @return Name der Kategorie
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter
	 * 
	 * @param name Name der Kategorie
	 */
	public void setName(String name) {
		this.name = name;
	}
}
