package model.dao;

import java.util.List;

import entities.Seller;

public interface SellerDao {

	public void insert(Seller obj);

	public void update(Seller obj);

	public void deleteById(Integer id);

	public Seller findByiId(Integer id);

	public List<Seller> findAll();

}
