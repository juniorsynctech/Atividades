package com.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.api.models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>  {
	
	Produto getOne(long id);
			
}
