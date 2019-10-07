package DAO;

import model.Carta;
import model.Corno;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SingletonCartaDAO {
    private static SingletonCartaDAO instance = null;
    private Connection con;

    public static SingletonCartaDAO getInstance() {
        if (instance == null) {
            instance = new SingletonCartaDAO();
        }
        return instance;
    }

    private SingletonCartaDAO() {
        try {
            con = DriverManager.getConnection("jdbc:sqlite:cards.db");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean insertCarta(Carta carta) {
        PreparedStatement comandoSQL;
        try {
            comandoSQL = con.prepareStatement("INSERT INTO card VALUES  (?, ?, ?, ?, ?, ?)");
            comandoSQL.setString(1, carta.dono);
            comandoSQL.setString(2, carta.nome);
            comandoSQL.setString(3, carta.tipo);
            comandoSQL.setString(4, carta.colection);
            comandoSQL.setInt(5, carta.number);
            comandoSQL.setInt(6, carta.id);
            comandoSQL.executeUpdate();
            // con.commit();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<Carta> getAllCartas() {
        List<Carta> cartas = new ArrayList<>();
        try {
            Statement comandoSql = con.createStatement();
            ResultSet rs = comandoSql.
                    executeQuery("SELECT * FROM card;");
            while (rs.next()) {
                Carta carta = new Carta(
                        rs.getString("dono"),
                        rs.getString("nome"),
                        rs.getString("tipo"),
                        rs.getString("colection"),
                        rs.getInt("number"),
                        rs.getInt("id")
                );
                cartas.add(carta);
            }
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return cartas;
    }

    public List<Carta> getAllCartaByName(String dono) {
        List<Carta> cartas = new ArrayList<>();
        try {
            Statement comandoSql = con.createStatement();
            ResultSet rs = comandoSql.executeQuery("SELECT * FROM card WHERE dono LIKE '%" + dono + "%'");
            while (rs.next()) {
                Carta carta = new Carta(
                        rs.getString("dono"),
                        rs.getString("nome"),
                        rs.getString("tipo"),
                        rs.getString("colection"),
                        rs.getInt("number"),
                        rs.getInt("id")
                );
                cartas.add(carta);
            }
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return cartas;
    }

    public List<Carta> getAllCartaByType(String tipo) {
        List<Carta> cartas = new ArrayList<>();
        try {
            Statement comandoSql = con.createStatement();
            ResultSet rs = comandoSql.executeQuery("SELECT * FROM card WHERE tipo LIKE '%" + tipo + "%'");
            while (rs.next()) {
                Carta carta = new Carta(
                        rs.getString("dono"),
                        rs.getString("nome"),
                        rs.getString("tipo"),
                        rs.getString("colection"),
                        rs.getInt("number"),
                        rs.getInt("id")
                );
                cartas.add(carta);
            }
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return cartas;
    }

    public void updateCarta(Carta carta) {
        try {
            Statement comandoSql = con.createStatement();
            comandoSql.executeUpdate("UPDATE card SET " +
                    "dono=\"" + carta.dono + "\"," +
                    "nome=\"" + carta.nome + "\"," +
                    "tipo=\"" + carta.tipo + "\"," +
                    "colection=\"" + carta.colection + "\"" +
                    "number=\"" + carta.number + "\"" +
                    " WHERE id=" + carta.id + ";");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteById(int id) {

        try {
            Statement comandoSql = con.createStatement();
            comandoSql.executeUpdate(
                    "DELETE FROM card WHERE id=" + id + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public boolean insertCorno(Corno corno) {
        PreparedStatement comandoSQL;
        try {
            comandoSQL = con.prepareStatement("INSERT INTO usuario VALUES  (?, ?, ?)");
            comandoSQL.setInt(1, corno.id);
            comandoSQL.setString(2, corno.nome);
            comandoSQL.setString(3, corno.senha);
            comandoSQL.executeUpdate();
            // con.commit();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean loginCorno(Corno corno) {
        List<Corno> cornos = new ArrayList<>();
        String Password;
        try {
            Statement comandoSql = con.createStatement();
            ResultSet rs = comandoSql.executeQuery("SELECT senha FROM usuario WHERE nome LIKE '%" + corno.nome + "%'");
            password = rs.getString("senha");
            if(equals(password,corno.senha)){
                System.out.println("Login feito com sucesso.");
            }
            else{
                System.out.println("login falhou.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
