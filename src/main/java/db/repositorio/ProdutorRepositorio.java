package db.repositorio;

import db.dominio.ConfigDB;
import db.dominio.ProdutorObj;
import lombok.extern.log4j.Log4j2;

import javax.xml.transform.Result;
import java.sql.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Log4j2
public class ProdutorRepositorio {

    public static void save(ProdutorObj obj) {
        String sql = "INSERT INTO producer (name) VALUES ('%s')".formatted(obj.getName());

        try (Connection connection = ConfigDB.getConnection();
             Statement statement = connection.createStatement()) {
            int rowAffected = statement.executeUpdate(sql);
            log.info("rowsAffected = {}", rowAffected);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deleteRepositorio(Integer id) {
        String sql = "DELETE FROM producer WHERE id  = %d".formatted(id);

        try (Connection conn = ConfigDB.getConnection();
             Statement sttm = conn.createStatement()) {
            int rows = sttm.executeUpdate(sql);
            log.info("rowsAffected = {}", rows);
        } catch (SQLException e) {
            log.error("Erro ao deletar anime, entre com id correto");
        }
    }

    public static void updateRepositorio(ProdutorObj obj) {
        String sql = "UPDATE `producer` SET `name` = '%s' WHERE (`id` = '%d');".formatted(obj.getName(), obj.getId());

        try (Connection conn = ConfigDB.getConnection();
             Statement statement = conn.createStatement()) {
            int i = statement.executeUpdate(sql);
            log.info("rowsAffected = {}", i);
        } catch (SQLException e) {
            log.error(e.getMessage());
        }
    }

    public static Set<ProdutorObj> procureTudo() {
        String sql = "SELECT id,name FROM producer;";
        Set<ProdutorObj> produtors = new HashSet<>();

        try (Connection conexao = ConfigDB.getConnection();
             Statement sttm = conexao.createStatement();
             ResultSet rs = sttm.executeQuery(sql)) {
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                ProdutorObj obj = ProdutorObj.builder().id(id).name(name).build();
                produtors.add(obj);
            }
        } catch (SQLException e) {
            log.error(e.getMessage());
        }
        return produtors;
    }

    public static Set<ProdutorObj> procurePorTipo(String tipo) {
        String sql = "SELECT * FROM producer WHERE name LIKE '%%%s%%'".formatted(tipo);
        Set<ProdutorObj> produtors = new HashSet<>();
        try (Connection connection = ConfigDB.getConnection()
             ; Statement sttm = connection.createStatement();
             ResultSet rs = sttm.executeQuery(sql)) {
            while (rs.next()) {
                String name = rs.getString("name");
                ProdutorObj obj = ProdutorObj.builder().name(name).build();
                produtors.add(obj);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return produtors;
    }

    public static void resultSetMetadata() {
        String sql = "SELECT * FROM producer;";
        try (Connection connection = ConfigDB.getConnection();
             Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();
            log.info("columnCount = {}", columnCount);
            for (int i = 1; i <= columnCount; i++) {
                log.info("Table name: {}", metaData.getTableName(i));
                log.info("Column name: {}", metaData.getColumnName(i));
            }
        } catch (SQLException e) {
            log.error(e.getMessage());
        }
    }

    public static void showDriverMetadata() {
        try (Connection connection = ConfigDB.getConnection()) {
            DatabaseMetaData metaData = connection.getMetaData();
            if (metaData.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)) {
                log.info(" support - ResultSetType FORWARD_ONLY");
                if (metaData.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)) {
                    log.info("and support - CONCUR_UPDATABLE");
                }
            }
            if (metaData.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)) {
                log.info(" support - ResultSetType SCROLL_INSENSITIVE");
                if (metaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
                    log.info("and support - CONCUR_UPDATABLE");
                }
            }
            if (metaData.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE)) {
                log.info(" support - ResultSetType SCROLL_SENSITIVE");
                if (metaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
                    log.info("and support - CONCUR_UPDATABLE");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void showCursor() {
        String sql = "SELECT * FROM producer;";
        try (Connection connection = ConfigDB.getConnection();
             Statement stmt = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = stmt.executeQuery(sql)) {
            log.info("Last row {}", rs.last());
            log.info("Last row ? {}", rs.isLast());

            log.info("Last row {}", rs.first());
            log.info("Last row ? {}", rs.isFirst());
        } catch(SQLException e){
            log.error(e.getMessage());
        }
    }

    public static Set<ProdutorObj> updateToUpperCase(String tipo){
        String sql = "SELECT * FROM producer WHERE name LIKE '%%%s%%'".formatted(tipo);
        Set<ProdutorObj> produtors = new HashSet<>();
        try (Connection connection = ConfigDB.getConnection()
             ; Statement sttm = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = sttm.executeQuery(sql)) {

            while (rs.next()) {
                rs.updateString("name",rs.getString("name").toUpperCase());
//                rs.cancelRowUpdates();
                rs.updateRow();

                String name = rs.getString("name");
                ProdutorObj obj = ProdutorObj.builder().name(name).build();
                produtors.add(obj);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return produtors;
    }


}
