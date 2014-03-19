package com.jar.jam.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "foods")
public class Food {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private long id;

	@Column(name = "name")
	private String name;

	@Column(name = "proteine")
	private double proteine;

	@Column(name = "fat")
	private double fat;

	@Column(name = "carb")
	private double carb;

	@Column(name = "glycaemic")
	private int glycaemic;

	@Column(name = "kcal")
	private int kcal;

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getProteine() {
		return proteine;
	}

	public double getFat() {
		return fat;
	}

	public double getCarb() {
		return carb;
	}

	public int getGlycaemic() {
		return glycaemic;
	}

	public int getKcal() {
		return kcal;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setProteine(double proteine) {
		this.proteine = proteine;
	}

	public void setFat(double fat) {
		this.fat = fat;
	}

	public void setCarb(double carb) {
		this.carb = carb;
	}

	public void setGlycaemic(int glycaemic) {
		this.glycaemic = glycaemic;
	}

	public void setKcal(int kcal) {
		this.kcal = kcal;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(carb);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(fat);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + glycaemic;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + kcal;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		temp = Double.doubleToLongBits(proteine);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Food other = (Food) obj;
		if (Double.doubleToLongBits(carb) != Double
				.doubleToLongBits(other.carb))
			return false;
		if (Double.doubleToLongBits(fat) != Double.doubleToLongBits(other.fat))
			return false;
		if (glycaemic != other.glycaemic)
			return false;
		if (id != other.id)
			return false;
		if (kcal != other.kcal)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(proteine) != Double
				.doubleToLongBits(other.proteine))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder product = new StringBuilder();

		product.append("Product [id=").append(id);
		product.append(", name=").append(name);
		product.append(", proteine=").append(proteine);
		product.append(", fat=").append(fat);
		product.append(", carb=").append(carb);
		product.append(", glycaemic=").append(glycaemic);
		product.append(", kcal=").append(kcal);
		product.append("]");

		return product.toString();
	}

}
