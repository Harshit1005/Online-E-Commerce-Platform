package com.ecommerce.dao;

import java.util.List;

public interface DAO<T> {
    void add(T t) throws Exception;
    void update(T t) throws Exception;
    void delete(int id) throws Exception;
    T getById(int id) throws Exception;
    List<T> getAll() throws Exception;
}
