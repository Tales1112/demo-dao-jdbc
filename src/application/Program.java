package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.Department;
import entities.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDao;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	SellerDao sellerDao = DaoFactory.createSellerDao();
	System.out.println("======== TESTE 1: SELLER FINDBY");
	Seller seller = sellerDao.findByiId(3);
	System.out.println(seller);
    System.out.println("\n=========== TESTE 2: SELLER FINBYDEPARTMENT======");
    Department department = new Department(2, null);
    List<Seller> list = sellerDao.findByDepartment(department);
    
    for (Seller obj : list) {
		System.out.println(obj);
	}
    System.out.println("\n=========== TESTE 3: SELLER FINDALLL======");

      list = sellerDao.findAll();
    for (Seller obj : list) {
		System.out.println(obj);
	}
    System.out.println("\n=========== TESTE 4: SELLER INSERT======");
	Seller newSeller = new Seller(null, "Greg", "Greg@gmail.com", new Date(), 4000.0, department);
	sellerDao.insert(newSeller);
	System.out.println("Inserted! New id = " + newSeller.getId());
	 System.out.println("\n=========== TESTE 5: SELLER INSERT======");
	 seller = sellerDao.findByiId(1);
	 seller.setName("Martha Waine");
	 sellerDao.update(seller);
	 System.out.println("Update completed");
	 System.out.println("\n=========== TESTE 6: SELLER DELETE======");
	 System.out.println("ENTER id for  delete test:" );
	 int id = sc.nextInt();
	 sellerDao.deleteById(id);
	 System.out.println("Delete completed");
	 
	 sc.close();
	}
}

