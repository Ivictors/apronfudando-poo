package db.dominio;

import lombok.Builder;
import lombok.Value;


@Value
@Builder

public class ProdutorObj {
    Integer id;
    String name;
}