package com.example.demo.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.PersonEntity;

@Repository
public class PersonRepository {
	@Autowired
	private EntityManager entityManager;

	public List<PersonEntity> findAll() {
		List<PersonEntity> persons = entityManager.createQuery("select u from PersonEntity u", PersonEntity.class)
				.getResultList();

		PersonEntity person = entityManager.find(PersonEntity.class, 2);
		System.out.println(person);
		return persons;
	}

	public List<PersonEntity> getName() {
		List<PersonEntity> name = entityManager.createQuery("select name from PersonEntity name", PersonEntity.class)
				.getResultList();
		return name;

	}
}
