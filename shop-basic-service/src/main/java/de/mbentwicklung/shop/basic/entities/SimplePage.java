package de.mbentwicklung.shop.basic.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 * Eine einfache Seite im Shop
 * 
 * @author Marc Bellmann <marc.bellmann@mb-entwicklung.de>
 */
@Entity
@Table(name = "SIMPLEPAGES")
public class SimplePage extends AbstractPersistable<Long> {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -781550495713900648L;

	/**
	 * Titel der Seite
	 */
	private String title;

	/**
	 * Inhalt der Seite
	 */
	private String text;

	/**
	 * JPA Konstruktor
	 */
	SimplePage() {
		super();
	}

	/**
	 * Konstruktor
	 * 
	 * @param name Titel der Seite
	 * @param text
	 */
	public SimplePage(final String name, final String text) {
		super();
		this.title = name;
		this.text = text;
	}

	/**
	 * Getter
	 * 
	 * @return Titel der Seite
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Setter
	 * 
	 * @param name Titel der Seite
	 */
	public void setTitle(String name) {
		this.title = name;
	}

	/**
	 * Getter
	 * 
	 * @return Inhalt der Seite
	 */
	public String getText() {
		return text;
	}

	/**
	 * Setter
	 * 
	 * @param text Inhalt der Seite
	 */
	public void setText(String text) {
		this.text = text;
	}

}
