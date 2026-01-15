package db.teste;

import db.dominio.ProdutorObj;
import db.servico.ProdutoServico;

import java.util.Set;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class DBFabricaTeste {
    public static void main(String[] args) {
        ProdutorObj obj = ProdutorObj.builder().name("teste pause").build();
        ProdutoServico.save(obj);
//        ProdutoServico.update(obj);
//        ProdutoServico.delete(obj.getId());
//        Set<ProdutorObj> produtorObjs = ProdutoServico.procureTudoService();
//        log.info("Produtor obj: " + produtorObjs);
//        Set<ProdutorObj> produtorObjs = ProdutoServico.procurePorTipo(obj.getName());
//        log.info(produtorObjs);
//        ProdutoServico.metaData();
//        ProdutoServico.showDriverMetadata();
//        ProdutoServico.showCursor();
//        Set<ProdutorObj> produtorObjs = ProdutoServico.updateToUpperCase(obj.getName());
//        log.info(produtorObjs);
    }
}