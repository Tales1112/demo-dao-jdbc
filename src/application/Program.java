package application;

import java.util.List;

import entities.Department;
import entities.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDao;

public class Program {

	public static void main(String[] args) {
		
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
	}

}
