package com.devjp.msscagrifarm.web.Dao;

import com.devjp.msscagrifarm.web.model.Vegetable;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.UUID;

@Repository
public class VegetableDaoImpl implements VegetableDao {

    @Autowired
    private EntityManager entityManager;
    @Override
    public List<Vegetable> get() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Vegetable> query = currentSession.createQuery("from Vegetable ", Vegetable.class);
        return query.getResultList();
    }

    @Override
    public Vegetable get(UUID id) {
        return null;
    }

    @Override
    public void save(Vegetable vegetable) {
        Session currentSession = entityManager.unwrap(Session.class);
        System.out.println(vegetable);
        currentSession.save(vegetable);
    }

    @Override
    public void delete(UUID id) {

    }
};

class Test {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
