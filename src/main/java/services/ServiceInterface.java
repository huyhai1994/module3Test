package services;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;
import java.util.List;

/**
 * ServiceInterface is a generic interface for managing entities in a system.
 * It defines methods for CRUD operations (Create, Read, Update, Delete).
 *
 * @param <T> the type of entity being managed
 * @version 1.0
 * @author: Nguyen Huy Hai
 * @since 2024-05-01
 */
public interface ServiceInterface<T> {
    /**
     * Renders a page for displaying all entities.
     */
    void renderPageFindAll(HttpServletRequest request, HttpServletResponse response) throws SQLException;

    /**
     * Renders a page for creating a new entity.
     */
    void renderPageSave();

    /**
     * Renders a page for updating an existing entity.
     */
    void renderPageUpdate();

    /**
     * Retrieves a list of all entities.
     *
     * @return a List of T objects
     */
    List<T> findAll();

    /**
     * Retrieves an entity by its unique identifier.
     *
     * @param key the unique identifier of the entity
     * @return the T object with the specified key, or null if not found
     */
    T findById(int key);

    /**
     * Saves a new entity to the database.
     *
     * @param t the T object to be saved
     */
    void save(T t);

    /**
     * Updates an existing entity in the database.
     *
     * @param key the unique identifier of the entity to be updated
     * @param t   the updated T object
     */
    void update(int key, T t);

    /**
     * Removes an entity from the database by its unique identifier.
     *
     * @param key the unique identifier of the entity to be removed
     */
    void remove(int key);
}