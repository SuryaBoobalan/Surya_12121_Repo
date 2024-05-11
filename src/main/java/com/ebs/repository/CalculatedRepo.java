package com.ebs.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ebs.model.Calculated;

import jakarta.persistence.EntityManager;

@Repository
public class CalculatedRepo {
	
 
		EntityManager entityManager;

		public boolean save(Calculated cal) {

			entityManager.persist(cal);

			return true;

		}
	 
		@SuppressWarnings("unchecked")
		public List<Calculated> findAll() {

			return entityManager.createQuery("from Calculated").getResultList();

		}
	 



}
