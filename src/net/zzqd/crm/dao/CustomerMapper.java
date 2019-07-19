package net.zzqd.crm.dao;

import java.util.List;

import net.zzqd.crm.domain.Customer;

public interface CustomerMapper
{
	/**
	 * 查询所有数据
	 */
	public List<Customer> findAll();

	/**
	 * 保存数据
	 * @param customer
	 */
	public void save(Customer customer);
	/**
	 * 根据id查询对象
	 * @param id
	 * @return
	 */
	public Customer findById(Integer id);

	/**
	 * 修改对象数据
	 * @param customer
	 */
	public void update(Customer customer);

	/**
	 * 删除数据
	 * @param id
	 */
	public void delete(Integer[] id);

	
}
