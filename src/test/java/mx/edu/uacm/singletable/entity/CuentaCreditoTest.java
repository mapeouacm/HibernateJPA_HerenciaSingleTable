package mx.edu.uacm.singletable.entity;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;


@SpringBootTest
public class CuentaCreditoTest {
	
	private static final Logger log = LogManager.getLogger(CuentaCreditoTest.class);
	
	@PersistenceContext
	private EntityManager em;
	
	@Test
	@Transactional
	@Rollback(false)
	public void debeGuardarCuentaCredito() {
		log.debug("debeGuardarCuentaCredito");
		CuentaCredito cuentaCredito = new CuentaCredito();
		cuentaCredito.setTitular("Luismi");
		cuentaCredito.setBalance(500.0);
		cuentaCredito.setTipoInteres(0.20);
		cuentaCredito.setLimiteCredito(600.0);
		em.persist(cuentaCredito);
		
		assertNotNull(cuentaCredito.getId());
		
	}

}

