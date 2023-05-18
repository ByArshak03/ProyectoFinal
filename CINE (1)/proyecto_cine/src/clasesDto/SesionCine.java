package clasesDto;
import interfaz.*;
import clasesDao.*;

import java.util.List;
import java.util.Scanner;

public class SesionCine {
		  public static void main(String[] args) {
				int opcion;

				do {
					 Mainmenu.mostrarMenuPrincipal();
					 opcion = Mainmenu.obtenerOpcion();

					 switch (opcion) {
						  case 1:
								menuActores();
								break;
						  case 2:
								menuPeliculas();
								break;
						  case 3:
								menuParticipaciones();
								break;
						  case 0:
								System.out.println("¡Adios!");
								break;
						  default:
								System.out.println("Opción inválida. Por favor, selecciona una opción válida.");
								break;
					 }
				} while (opcion != 0);
		  }

		  private static void menuActores() {
				int opcion;

				do {
					 Mainmenu.mostrarMenuActores();
					 opcion = Mainmenu.obtenerOpcion();

					 switch (opcion) {
						  case 1:
								agregarActor();
								break;
						  case 2:
								modificarActor();
								break;
						  case 3:
								eliminarActor();
								break;
						  case 0:
								System.out.println("Volviendo al inicio...");
								break;
						  default:
								System.out.println("Opción inválida. Por favor, selecciona una opción válida.");
								break;
					 }
				} while (opcion != 0);
		  }

		  private static void menuPeliculas() {
				int opcion;

				do {
					 Mainmenu.mostrarMenuPeliculas();
					 opcion = Mainmenu.obtenerOpcion();

					 switch (opcion) {
						  case 1:
								agregarPelicula();
								break;
						  case 2:
								modificarPelicula();
								break;
						  case 3:
								eliminarPelicula();
								break;
						  case 0:
								System.out.println("Volviendo al inicio ...");
								break;
						  default:
								System.out.println("Opción inválida. Por favor, selecciona una opción válida.");
								break;
					 }
				} while (opcion != 0);
		  }

		  private static void menuParticipaciones() {
				int opcion;

				do {
					 Mainmenu.mostrarMenuParticipaciones();
					 opcion = Mainmenu.obtenerOpcion();

					 switch (opcion) {
						  case 1:
								agregarParticipacion();
								break;
						  case 2:
								modificarParticipacion();
								break;
						  case 3:
								eliminarParticipacion();
								break;
						  case 0:
								System.out.println("Volviendo al inicio...");
								break;
						  default:
								System.out.println("Opción inválida. Por favor, selecciona una opción válida.");
								break;
					 }
				} while (opcion != 0);
		  }

		  private static void agregarActor() {
				Scanner sc = new Scanner(System.in);

				System.out.println("- Añadir Actor -");
				System.out.print("Nombre: ");
				String nombre = sc.nextLine();
				System.out.print("Apellido: ");
				String apellido = sc.nextLine();
				System.out.print("Fecha de Nacimiento (formato: yyyy-mm-dd): ");
				String fechaNacimiento = sc.nextLine();
				System.out.print("Nacionalidad: ");
				String nacionalidad = sc.nextLine();

				Actor actor = new Actor(nombre, apellido, fechaNacimiento, nacionalidad);
				new ActorDAO().create(actor);
				System.out.println("¡Actor añadido correctamente!");
		  }

		  private static void modificarActor() {
				Scanner sc = new Scanner(System.in);

				System.out.println("-Modificar Actor -");
				System.out.print("ID del Actor: ");
				int id = sc.nextInt();
				sc.nextLine();
				System.out.print("Nombre: ");
				String nombre = sc.nextLine();
				System.out.print("Apellido: ");
				String apellido = sc.nextLine();
				System.out.print("Fecha de Nacimiento (formato: yyyy-mm-dd): ");
				String fechaNacimiento = sc.nextLine();
				System.out.print("Nacionalidad: ");
				String nacionalidad = sc.nextLine();

				Actor actor = new Actor(nombre, apellido, fechaNacimiento, nacionalidad, id);
				new ActorDAO().update(actor);
				System.out.println("¡Actor modificado correctamente!");
		  }

		  private static void eliminarActor() {
				Scanner sc = new Scanner(System.in);

				System.out.println("-Borrar  Actor -");
				System.out.print("ID del Actor: ");
				int id = sc.nextInt();
				sc.nextLine();

				new ActorDAO().delete(id);
				System.out.println("¡Actor borrado correctamente!");
		  }

		  private static void agregarPelicula() {
				Scanner sc = new Scanner(System.in);

				System.out.println("-Añadir Película -");
				System.out.print("Título: ");
				String titulo = sc.nextLine();
				System.out.print("Año(solo año): ");
				int anio = sc.nextInt();
				sc.nextLine();
				System.out.print("Duración(en minutos): ");
				int duracion = sc.nextInt();
				sc.nextLine();

				Pelicula pelicula = new Pelicula(titulo, anio, duracion);
				new PeliculaDAO().create(pelicula);
				System.out.println("¡Película añadida correctamente!");
		  }

		  private static void modificarPelicula() {
				Scanner sc = new Scanner(System.in);

				System.out.println("- Modificar Película -");
				System.out.print("ID de la Película: ");
				int id = sc.nextInt();
				sc.nextLine();
				System.out.print("Título: ");
				String titulo = sc.nextLine();
				System.out.print("Año(solo año): ");
				int anio = sc.nextInt();
				sc.nextLine();
				System.out.print("Duración(en minutos): ");
				int duracion = sc.nextInt();
				sc.nextLine();

				Pelicula pelicula = new Pelicula(titulo, anio, duracion, id);
				new PeliculaDAO().update(pelicula);
				System.out.println("¡Película modificada correctamente!");
		  }

		  private static void eliminarPelicula() {
				Scanner sc = new Scanner(System.in);

				System.out.println("-Borrar Película -");
				System.out.print("ID de la Película: ");
				int id = sc.nextInt();
				sc.nextLine();

				new PeliculaDAO().delete(id);
				System.out.println("¡Película eliminada correctamente!");
		  }

		  private static void agregarParticipacion() {
				Scanner sc = new Scanner(System.in);

				System.out.println("- Añadir Participación -");
				System.out.print("ID del Actor: ");
				int idActor = sc.nextInt();
				sc.nextLine();
				System.out.print("ID de la Película: ");
				int idPelicula = sc.nextInt();
				sc.nextLine();

				Actor actor = new ActorDAO().findById(idActor);
				Pelicula pelicula = new PeliculaDAO().findById(idPelicula);
				Participacion participacion = new Participacion(actor, pelicula);
				new ParticipacionDAO().create(participacion);
				System.out.println("¡Participación agregada correctamente!");
		  }

		  private static void modificarParticipacion() {
				Scanner sc = new Scanner(System.in);

				System.out.println("- Modificar Participación -");
				System.out.print("ID de la Participación: ");
				int id = sc.nextInt();
				sc.nextLine();
				System.out.print("ID del Actor: ");
				int idActor = sc.nextInt();
				sc.nextLine();
				System.out.print("ID de la Película: ");
				int idPelicula = sc.nextInt();
				sc.nextLine();

				Actor actor = new ActorDAO().findById(idActor);
				Pelicula pelicula = new PeliculaDAO().findById(idPelicula);
				Participacion participacion = new Participacion(actor, pelicula, id);
				new ParticipacionDAO().update(participacion);
				System.out.println("¡Participación modificada correctamente!");
		  }

		  private static void eliminarParticipacion() {
				Scanner sc = new Scanner(System.in);

				System.out.println("-Borrar Participación -");
				System.out.print("ID del Actor de la Participación: ");
				int id1 = sc.nextInt();
				sc.nextLine();
				System.out.print("ID de la Película de la Participación: ");
				int id2 = sc.nextInt();
				sc.nextLine();

				new ParticipacionDAO().delete(id1, id2);
				System.out.println("¡Participación eliminada con éxito!");
		  }

		  private static void listarActores() {
				System.out.println("- Mostrar Actores -");
				List<Actor> actores = new ActorDAO().findAll();
				for (Actor actor : actores) {
					 System.out.println(actor);
				}
		  }
}
