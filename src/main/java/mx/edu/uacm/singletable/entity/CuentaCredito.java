package mx.edu.uacm.singletable.entity;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CC")
public class CuentaCredito extends Cuenta implements Serializable {

	
	private double limiteCredito;
	private static final long serialVersionUID = 1L;

	public CuentaCredito() {
		super();
	}   
	public double getLimiteCredito() {
		return this.limiteCredito;
	}

	public void setLimiteCredito(double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}
   
}

