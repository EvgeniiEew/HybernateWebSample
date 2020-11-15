package by.grodno.pvt.site.webappsample.interfacee;

import  by.grodno.pvt.site.webappsample.model.User;

import java.util.List;

public interface UserRepository {

    List<User> getUsers();

    void addUser(User user);

    void deleteUser(Integer number);

}