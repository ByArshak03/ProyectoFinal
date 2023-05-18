package clasesDto;


import java.sql.ResultSet;
import java.sql.SQLException;

public class Pelicula {
	 private String titulo;
	 private int duracion;
	 private int anio;
	 private int pelicula_id;

	 public Pelicula(String titulo, int anio, int duracion, int pelicula_id) {
		  this.titulo = titulo;
		  this.duracion = duracion;
		  this.anio = anio;
		  this.pelicula_id = pelicula_id;
	 }

	 public Pelicula(String titulo, int anio, int duracion) {
		  this.titulo = titulo;
		  this.duracion = duracion;
		  this.anio = anio;
	 }

	 public Pelicula(ResultSet rs){
		  try {
				this.pelicula_id = rs.getInt("pelicula_id");
				this.titulo = rs.getString("titulo");
				this.duracion = rs.getInt("duracion");
				this.anio = rs.getInt("anio");

		  } catch (SQLException e){
				e.printStackTrace();
		  }
	 }
	 
	 public String getTitulo() {
		  return titulo;
	 }
	 public void setTitulo(String titulo) {
		  this.titulo = titulo;
	 }
	 public int getAnio() {
		  return anio;
	 }
	 public void setAnio(int anio) {
		  this.anio = anio;
	 }
	 public int getDuracion() {
		  return duracion;
	 }
	 public void setDuracion(int duracion) {
		  this.duracion = duracion;
	 }
	 public int getIdPelicula() {
		  return pelicula_id;
	 }
    public void setIdPelicula(int idPelicula) {
		  this.pelicula_id = idPelicula;
	 }


}
