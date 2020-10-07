package servicios;

import javax.ejb.Remote;

@Remote
public interface SaludoBeanRemote {
	
	String saludar(String nombre);

}
