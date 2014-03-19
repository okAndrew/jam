package com.jar.jam.domain.model;

import com.jar.jam.domain.enums.ProductValueType;

public class Ingridient {

	private long id;
	private Food food;
	private double value;
	private ProductValueType valueType;

	public long getId() {
		return id;
	}

	public Food getFoodId() {
		return food;
	}

	public double getValue() {
		return value;
	}

	public ProductValueType getValueType() {
		return valueType;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setFood(Food food) {
		this.food = food;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public void setValueType(ProductValueType valueType) {
		this.valueType = valueType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((food == null) ? 0 : food.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		long temp;
		temp = Double.doubleToLongBits(value);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result
				+ ((valueType == null) ? 0 : valueType.hashCode());
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
		Ingridient other = (Ingridient) obj;
		if (food == null) {
			if (other.food != null)
				return false;
		} else if (!food.equals(other.food))
			return false;
		if (id != other.id)
			return false;
		if (Double.doubleToLongBits(value) != Double
				.doubleToLongBits(other.value))
			return false;
		if (valueType != other.valueType)
			return false;
		return true;
	}

	// TODO Update to StringBuilder.
	@Override
	public String toString() {
		return "Ingridient [id=" + id + ", food=" + food + ", value=" + value
				+ ", valueType=" + valueType + "]";
	}

}
