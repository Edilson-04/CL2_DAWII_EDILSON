package com.edu.cibertec.DAWII_CL2_GALINDO.repository;

import com.edu.cibertec.DAWII_CL2_GALINDO.model.bd.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {
}
