package com.unab.banca.Dao;
import com.unab.banca.Models.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ClienteDao extends CrudRepository< Cliente, String>  {
}