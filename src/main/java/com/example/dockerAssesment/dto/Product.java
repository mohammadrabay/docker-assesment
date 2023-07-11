package com.example.dockerAssesment.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
public class Product {
	private int productId;
	private String productName;
	private String expirDate;
	private String batchId;
	private String productType;
	private String manuafacture;
	
	@Override
	public String toString() {
		return "{\n\tproductId:"+productId+",\n\tproductName:"+productName+",\n\texpirDate:"+expirDate+",\n\tbatchId:"+batchId+
				",\n\tproductType:"+productType+",\n\tmanufacture:"+manuafacture+
				"}";
	}
}
