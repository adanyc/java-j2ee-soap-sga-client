package test.clientews;

import java.util.List;

import clientews.servicio.Persona;
import clientews.servicio.PersonaServiceImplService;
import clientews.servicio.PersonaServiceWs;

public class TestPersonaServiceWs {
	public static void main(String[] args) {
		PersonaServiceWs personaServiceWs = new PersonaServiceImplService().getPersonaServiceImplPort();
		List<Persona> lista = personaServiceWs.listarPersonas();
		for (Persona persona : lista) {
			System.out.println(persona.getNombre());
		}
	}
}
