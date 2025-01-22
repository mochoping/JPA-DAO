package edu.khcom.jpadao.repository;

import edu.khcom.jpadao.entity.KHTProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KHTProductRepository extends JpaRepository<KHTProduct, Long> {
    KHTProduct findById(int id);
}
