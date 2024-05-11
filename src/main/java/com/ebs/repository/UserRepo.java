package com.ebs.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ebs.model.TariffData;
import com.ebs.model.User;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
public class UserRepo {
	
	@Autowired
	EntityManager entityManager;

	@Transactional
	public boolean save(User user) {

		entityManager.persist(user);

		return true;

	}

	@SuppressWarnings("unchecked")
	public List<User> findAll() {

		return entityManager.createQuery("from User").getResultList();

	}
}
