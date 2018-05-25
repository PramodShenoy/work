package com.cf.uni;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Transactional
@Repository
public class UniDAO
{
    @PersistenceContext
    private EntityManager entityManager;

    @SuppressWarnings("unchecked")
    public List<Uni> getUnibyName(String name)
    {
        String hql = "FROM Uni as un WHERE un.name=?";
        return (List<Uni>) entityManager.createQuery(hql).setParameter(1, name).getResultList();
    }
    public Uni getUnibyId(Integer id)
    {
        return entityManager.find(Uni.class,id);
    }
    @SuppressWarnings("unchecked")
    public List<Uni> getUnibyCountry(String country)
    {
        String hql = "FROM Uni as un WHERE un.country=?";
        return (List<Uni>) entityManager.createQuery(hql).setParameter(1, country).getResultList();
    }
    @SuppressWarnings("unchecked")
    public List<Uni> getAllUni()
    {
        String hql = "FROM Uni as un ORDER BY un.id";
        return (List<Uni>) entityManager.createQuery(hql).getResultList();
    }

    public boolean check(Integer id) {
        String hql = "FROM Uni as un WHERE un.id=?";
        int count = entityManager.createQuery(hql).setParameter(1, id).getResultList().size();
        return count > 0;
    }

    public void addUni(Uni uni)
    {
        boolean flag = check(uni.getId());
        if(!flag)
        {
            entityManager.persist(uni);
        }
        else
        {
            List<Uni> obj = getUnibyName(uni.getName());
            obj.get(0).setId(uni.getId());
            obj.get(0).setCity(uni.getCity());
            obj.get(0).setCountry(uni.getCountry());
            entityManager.flush();
        }
        entityManager.persist(uni);
    }
    public void removeUni(Integer id) {
        entityManager.remove(getUnibyId(id));
    }
}