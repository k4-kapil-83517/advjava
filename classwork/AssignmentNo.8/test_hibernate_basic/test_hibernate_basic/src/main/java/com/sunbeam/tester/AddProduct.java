package com.sunbeam.tester;

import org.hibernate.SessionFactory;

import com.sunbeam.dao.ProductDao;
import com.sunbeam.dao.ProductDaoImpl;
import com.sunbeam.entities.Category;
import com.sunbeam.entities.Product;

import static com.sunbeam.Utils.HibernateUtils.getFactory;
//id , category (BAKERY|SHOES|CLOTHES|STATIONAY) ,product name(unique)
//, price , available quantity

import java.time.LocalDate;
import java.util.Scanner;
public class AddProduct {
	public static void main(String[] args) {
		try (SessionFactory sf = getFactory();
				Scanner sc=new Scanner(System.in)
				) {
			ProductDao dao=new ProductDaoImpl();
			System.out.println("Enter product details= Category category,String productName,double price,int availableQuantity");
			Product newProduct=new Product(Category.valueOf(sc.next().toUpperCase()),sc.next(),sc.nextDouble(),sc.nextInt());
			System.out.println(dao.addProduct(newProduct));
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
