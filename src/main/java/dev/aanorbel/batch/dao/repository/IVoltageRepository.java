package dev.aanorbel.batch.dao.repository;

import dev.aanorbel.batch.dao.entity.Voltage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVoltageRepository extends JpaRepository<Voltage, Long> {

}
