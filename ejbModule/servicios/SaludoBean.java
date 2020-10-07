package servicios;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class SaludoBean
 */
@Stateless
public class SaludoBean implements SaludoBeanRemote {

    /**
     * Default constructor. 
     */
    public SaludoBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public String saludar(String nombre) {
		return "Hola " + nombre;
	}

}
