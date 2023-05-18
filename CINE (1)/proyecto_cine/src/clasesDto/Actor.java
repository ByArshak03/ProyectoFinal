package clasesDto;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

public class  Actor {
	 private  String nombre;
	 private  String apellido;
	 private  Date anio_Nacimiento;
	 private  String nacionalidad;
	 private  int  actor_id;

	 public Actor(String nombre, String apellido, String nacimiento, String nacionalidad){
		  this.nombre = nombre;
		  this.apellido = apellido;
		  this.anio_Nacimiento = Date.valueOf(nacimiento);
		  this.nacionalidad = nacionalidad;
		  this.actor_id = 0;
	 }

	 public Actor(String nombre, String apellido, String nacionalidad, String nacimiento, int actor_id){
		  this.nombre = nombre;
		  this.apellido = apellido;
		  this.anio_Nacimiento = Date.valueOf(nacimiento);
		  this.nacionalidad = nacionalidad;
		  this.actor_id = actor_id;
	 }

	 public Actor(ResultSet rs){
		  try {
				this.actor_id = rs.getInt("actor_id");
				this.nombre = rs.getString("nombre");
				this.apellido = rs.getString("apellido");
				this.anio_Nacimiento = rs.getDate("anio_nacimiento");
				this.nacionalidad = rs.getString("nacionalidad");

		  } catch (SQLException e){
				e.printStackTrace();
		  }
	 }

	 public  String getNombre() {
		  return nombre;
	 }
	 public void setNombre(String nombre) {
		  this.nombre = nombre;
	 }
	 public  String getApellido() {
		  return apellido;
	 }
	 public void setApellido(String apellido) {
		  this.apellido = apellido;
	 }
	 public  Date getFechaNacimiento() {
		  return anio_Nacimiento;
	 }
	 public void setFechaNacimiento(String fechaNacimiento) {
		  this.anio_Nacimiento = Date.valueOf(fechaNacimiento);
	 }
	 public  String getNacionalidad() {
		  return nacionalidad;
	 }
	 public void setNacionalidad(String nacionalidad) {
		  this.nacionalidad = nacionalidad;
	 }
	 public  int getIdActor() {
		  return actor_id;
	 }
	 public void setIdActor(int idActor) {
		  this.actor_id = idActor;
	 }

}
