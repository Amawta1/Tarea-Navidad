/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import java.util.List;
import modelo.Pais;

/**
 *
 * @author USUARIO
 */
public interface PaisService {
    
   public Pais PaisCodigo(int codigo);

    public void crear(Pais pais);

    public void modificar(Pais pais, int codigo);

    public void eliminar(int codigo);

    public List<Pais> listar();
    
}
