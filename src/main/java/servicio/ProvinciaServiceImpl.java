/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Provincia;

/**
 *
 * @author USUARIO
 */
public class ProvinciaServiceImpl implements ProvinciaService {
    
   public static List<Provincia> provinciaList = new ArrayList<>();

    public ProvinciaServiceImpl() {

    }

    @Override
    public void crear(Provincia provincia) {
        this.provinciaList.add(provincia);
    }

    @Override
    public List<Provincia> listar() {
        return this.provinciaList;
    }

    public Provincia ProvinciaCodigo(int codigo) {
        Provincia retorno = null;
        for (var provincia : this.provinciaList) {
            if (codigo == provincia.getCodigo()) {
                retorno = provincia;
                break;

            }
        }
        return retorno;
    }

    @Override
    public void modificar(Provincia provincia, int codigo) {
        var indice = -1;
        for (var paises : this.provinciaList) {
            indice++;
            if (codigo == paises.getCodigo()) {
                this.provinciaList.set(indice, provincia);

            }

        }
    }

    @Override
    public void eliminar(int codigo) {
        var indice = -1;
        for (var provincias : this.provinciaList) {
            indice++;
            if (codigo == provincias.getCodigo()) {
                this.provinciaList.remove(indice);

            }

        }

    }

}