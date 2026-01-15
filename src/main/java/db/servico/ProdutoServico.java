package db.servico;

import db.dominio.ProdutorObj;
import db.repositorio.ProdutorRepositorio;

import java.util.Set;

public class ProdutoServico {
    public static void save (ProdutorObj obj){
        ProdutorRepositorio.save(obj);
    }

    public static void delete (Integer id){
        if (id <= 0){
            throw new IllegalArgumentException("ID invalido");
        }
        ProdutorRepositorio.deleteRepositorio(id);
    }

    public static void update (ProdutorObj obj){
        if (obj.getId() <= 0|| obj.getName() == null){
            throw new IllegalArgumentException("Argumento invalido");
        }
        ProdutorRepositorio.updateRepositorio(obj);
    }

    public static Set<ProdutorObj> procureTudoService(){
        return ProdutorRepositorio.procureTudo();
    }

    public static Set<ProdutorObj> procurePorTipo(String tipo){
       return ProdutorRepositorio.procurePorTipo(tipo);
    }

    public static void metaData(){
        ProdutorRepositorio.resultSetMetadata();
    }

    public static void showDriverMetadata(){
        ProdutorRepositorio.showDriverMetadata();
    }

    public static void showCursor(){
        ProdutorRepositorio.showCursor();
    }

    public static Set<ProdutorObj> updateToUpperCase(String tipo){
        return ProdutorRepositorio.updateToUpperCase(tipo);
    }
}
