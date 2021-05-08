package kodlamaio.nortwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kodlamaio.nortwind.entities.concretes.Product;

@Repository

public interface ProductDao extends JpaRepository<Product, Integer>{
	
}
