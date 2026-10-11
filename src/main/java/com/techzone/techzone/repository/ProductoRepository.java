
package com.techzone.techzone.repository;

import com.techzone.techzone.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
