package oop.inheritance.repository;

public interface Dao<T> {

    void create(T type);

    void delete(T type);
}
