package com.tudoDeBom.Project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tudoDeBom.Project.Model.Produto;

/** 
 * @Author Cristhiane Barros da Cruz
 * @Version 1.0.0
 * @Since 13/08/2022
 * */
public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}