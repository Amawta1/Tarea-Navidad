/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Canton;

/**
 *
 * @author USUARIO
 */
public class CantonServiceImpl implements CantonService {
    
   public List<Canton> cantonList;

    public CantonServiceImpl() {
        this.cantonList = new ArrayList<>();
    }

    @Override
    public void crear(Canton canton) {
        this.cantonList.add(canton);
    }

    /**
     *
     * @return
     */
   

    @Override
    public void modificar(Canton canton, int codigo) {
        var indice = -1;
        for (var cantones : this.cantonList) {
            indice++;
            if (codigo == cantones.getCodigo()) {
                this.cantonList.set(indice, canton);

            }

        }
    }

    @Override
    public void eliminar(int codigo) {
        var indice = -1;
        for (var canton : this.cantonList) {
            indice++;
            if (codigo == canton.getCodigo()) {
                this.cantonList.remove(indice);

            }

        }
    }

    @Override
    public List<Canton> listar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
