package mx.edu.uacm.singletable.entity;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CD")
public class CuentaDebito extends Cuenta implements Serializable {

	
	private double cargoPorDescubierto;
	private static final long serialVersionUID = 1L;

	public CuentaDebito() {
		super();
	}   
	public double getCargoPorDescubierto() {
		return this.cargoPorDescubierto;
	}

	public void setCargoPorDescubierto(double cargoPorDescubierto) {
		this.cargoPorDescubierto = cargoPorDescubierto;
	}
   
}
