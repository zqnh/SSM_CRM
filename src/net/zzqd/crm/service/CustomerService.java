package net.zzqd.crm.service;

import java.util.List;

import net.zzqd.crm.domain.Customer;

public interface CustomerService
{
	/**
	 * 查询所有数据
	 */
	public List<Customer> findAll();

	public void save(Customer customer);

	public Customer findById(Integer id);

	public void delete(Integer[] id);

}
