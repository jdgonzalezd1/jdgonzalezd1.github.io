package co.edu.usbbog.sgpireports.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import co.edu.usbbog.sgpireports.model.Presupuesto;
import co.edu.usbbog.sgpireports.model.Semillero;

public interface IPresupuestoRepository extends JpaRepository<Presupuesto, Integer>{

	
	//metodo para consultar el presupuesto de un grupo de investigacion
		@Query(value = "SELECT * FROM sgpi_db.presupuesto where proyecto = ?1", nativeQuery = true)
		List<Presupuesto> findByProyecto(int proyecto);
}
