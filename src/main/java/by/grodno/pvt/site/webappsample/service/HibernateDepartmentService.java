package by.grodno.pvt.site.webappsample.service;

import java.util.List;

import by.grodno.pvt.site.webappsample.interfacee.DepartmentRepository;
import by.grodno.pvt.site.webappsample.model.Department;

import by.grodno.pvt.site.webappsample.model.HibernateUtil;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.hibernate.Session;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class HibernateDepartmentService implements DepartmentRepository {

    private static DepartmentRepository departmentService;

    public static DepartmentRepository getService() {
        if (departmentService == null) {
            departmentService = new HibernateDepartmentService();
        }
        return departmentService;
    }

    @Override
    public List<Department> getDepartment() {
        EntityManager entityManager = HibernateUtil.getEntityManager().createEntityManager();

        CriteriaBuilder cb = entityManager.getCriteriaBuilder();

        CriteriaQuery<Department> cr = cb.createQuery(Department.class);

        return entityManager.createQuery(cr.select(cr.from(Department.class))).getResultList();
    }

    @Override
    public void addDepartment(Department department) {
        Session entityManager = HibernateUtil.getEntityManager().getCurrentSession();
        entityManager.getTransaction().begin();
        entityManager.persist(department);
        entityManager.getTransaction().commit();

    }

    @Override
    public void deleteDepartment(Integer number) {
        EntityManager entityManager = HibernateUtil.getEntityManager().createEntityManager();
        entityManager.getTransaction().begin();
        // entityManager.remove(new Department(number,null,null,null,false));
        entityManager.getTransaction().commit();

    }
}
