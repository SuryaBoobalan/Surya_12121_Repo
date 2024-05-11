package com.ebs.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ebs.model.Calculated;
import com.ebs.model.TariffData;

import jakarta.persistence.EntityManager;

@Repository
public class TariffRepo {

	EntityManager entityManager;

	public boolean save(TariffData tariff) {

		entityManager.persist(tariff);

		return true;

	}
	
	@SuppressWarnings("unchecked")
	public List<TariffData> findAll() {

		return entityManager.createQuery("from TariffData").getResultList();

	}
	
	public TariffData findById(String tariffid) {
		TariffData obj = entityManager.find(TariffData.class, tariffid);
		if (obj != null) {
			return obj;
		}
		return null;
	}
}
