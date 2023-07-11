package com.example.dockerAssesment.service;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.nio.file.Path;

import org.springframework.stereotype.Service;

import com.example.dockerAssesment.dto.Product;

@Service
public class ProductServices {

	public String saveInventory(Product product) {
		try {
			Path file = Path.of("app/data/Inventory.txt");
			File existingFile = new File(file.toUri());
			if (!existingFile.exists()) {
				existingFile.createNewFile();
			}
			FileWriter fileWritter = new FileWriter(String.valueOf(file), true);
			BufferedWriter bw = new BufferedWriter(fileWritter);
			bw.write(product.toString());
			bw.close();
			System.out.println(product.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Success";
	}

}