package models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "empleado")
public class Empleado {
	
	@Id
	@Column(name = "IdEmpleado")
	public int idEmpleado;
	
	@Column(name = "Apellidos")
	public String apellidos;
	
	@Column(name = "Nombres")
	public String nombres;
	
	@Column(name = "Edad")
	public int edad;
	
	@Column(name = "Sexo")
	public String sexo;
	
	@Column(name = "Salario")
	public double salario;
	
	public Empleado() {		
	}

	public Empleado(String apellidos, String nombres, int edad, String sexo, double salario) {

		this.apellidos = apellidos;
		this.nombres = nombres;
		this.edad = edad;
		this.sexo = sexo;
		this.salario = salario;
	}


	public int getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Empleado [idEmpleado=" + idEmpleado + ", apellidos=" + apellidos + ", nombres=" + nombres + ", edad="
				+ edad + ", sexo=" + sexo + ", salario=" + salario + "]";
	}
	
	
	
}
