package com.jar.jam.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.jar.jam.domain.enums.ProductValueType;

@Entity
@Table(name = "ingridients")
public class Ingridient {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "food_id")
	private Food food;

	@Column(name = "value")
	private Double value;

	@Enumerated(EnumType.STRING)
	@Column(name = "value_type")
	private ProductValueType valueType;
	
	@ManyToOne
	@JoinColumn(name = "recipe_id")
	private Recipe recipe;

	public Long getId() {
		return id;
	}

	public Food getFood() {
		return food;
	}

	public Double getValue() {
		return value;
	}

	public ProductValueType getValueType() {
		return valueType;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setFood(Food food) {
		this.food = food;
	}

	public void setValue(Double value) {
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
