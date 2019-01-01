package pract.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pract.model.Productos;

@Repository
public interface ServiceProductos extends JpaRepository<Productos, Long> {
    @Query("select e from Productos e where e.codigo = :codigo")
    Productos findByCodigo(@Param("codigo") String codigo);
}
