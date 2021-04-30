package mx.edu.uacm.singletable.entity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;


@SpringBootTest
public class CuentaDebitoTest {
	
	private static final Logger log = LogManager.getLogger(CuentaDebitoTest.class);
	
	@PersistenceContext
	private EntityManager em;
	
	@Test
	@Transactional
	@Rollback(false)
	public void debeGuardarCuentaDebito() {
		log.debug("Entrando a debeGuardarCuentaDebito");
		CuentaDebito cuentaDebito = new CuentaDebito();
		cuentaDebito.setTitular("Luismi");
		cuentaDebito.setBalance(200.0);
		cuentaDebito.setCargoPorDescubierto(6.5);
		
		em.persist(cuentaDebito);
		
	}

}
