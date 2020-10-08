package servicios;

import java.util.List;

import javax.ejb.Remote;

@Remote
public interface CarritoDeSaludosRemote {
	
	void agregarSaludos();
	
	List<String> obtenerSaludos();
	

}
