package servicios;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateful;

/**
 * Session Bean implementation class CarritoDeSaludos
 */
@Stateful
public class CarritoDeSaludos implements CarritoDeSaludosRemote {
	
	private List<String> saludos = new ArrayList<>();

    /**
     * Default constructor. 
     */
    public CarritoDeSaludos() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void agregarSaludos() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<String> obtenerSaludos() {
		// TODO Auto-generated method stub
		return null;
	}
    

}
