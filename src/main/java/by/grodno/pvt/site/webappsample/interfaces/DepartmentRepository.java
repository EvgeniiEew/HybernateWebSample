package by.grodno.pvt.site.webappsample.interfaces;


import by.grodno.pvt.site.webappsample.model.Department;

import java.util.List;

public interface DepartmentRepository {
    List<Department> getDepartment();

    void addDepartment(Department department);

    void deleteDepartment(Integer number);
}
