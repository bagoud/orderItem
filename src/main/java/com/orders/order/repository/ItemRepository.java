package com.orders.order.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.orders.order.model.Item;

@Repository
@Transactional
public class ItemRepository {

	@Autowired
	EntityManager em;
	
	public List<Item> findbyIdNative(long orderId) {
		Query query = em.createNativeQuery("select * from Item where orderid = ?", Item.class);
		query.setParameter(1, orderId);
		@SuppressWarnings("unchecked")
		List<Item> resultList = query.getResultList();
		
		return resultList;
	}
	
	public Item findbyId(long orderId) {
		return em.find(Item.class, orderId);
	}


	public boolean addItem(List<Item> items) {
		for(Item item: items) {
			em.persist(item);
			em.flush();
		}
		return true;
	}

	public Item updateItem(Item item) {
		em.merge(item);
		return item;
	}

	public void deleteItem(long productCode) {
		Item item = findbyId(productCode);
		em.remove(item);
	}
}
