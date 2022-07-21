/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackEnd;

import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Rifaul06
 */
public class LoginKasir {
    private int id;
    private String username;
    private String password;
    private String nama;
    private String noTlp;
    private String email;

    public LoginKasir() {        
    }
    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNoTlp() {
        return noTlp;
    }

    public void setNoTlp(String noTlp) {
        this.noTlp = noTlp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public LoginKasir getById(int id){
        LoginKasir l = new LoginKasir();
        ResultSet rs = DBHelper.SelectQuery("SELECT * FROM user"
                + "Where iduser = '"+id+"'");
        try {
            while (rs.next()) {
                l = new LoginKasir();
                l.setId(rs.getInt("iduser"));
                l.setUsername(rs.getString("username"));
                l.setPassword(rs.getString("password"));
                l.setEmail(rs.getString("email"));
                l.setNama(rs.getString("nama"));
                l.setNoTlp(rs.getString("notelp"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return l;
    }
    public ArrayList<LoginKasir> getAll() {
        ArrayList<LoginKasir> ListUser = new ArrayList();
        ResultSet rs = DBHelper.SelectQuery("SELECT * FROM user");
        try {
            while (rs.next()) {
                LoginKasir l = new LoginKasir();
                l.setId(rs.getInt("iduser"));
                l.setUsername(rs.getString("username"));
                l.setPassword(rs.getString("password"));
                l.setEmail(rs.getString("email"));
                l.setNama(rs.getString("nama"));
                l.setNoTlp(rs.getString("notelp"));
                ListUser.add(l);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListUser;
    }
    public void save(){
        if (getById(id).getId() == 0) {
            String SQL = "INSERT INTO user(nama, email ,username, password, notelp) VALUES("
                    + " '"+this.nama+"',"
                    + " '"+this.email+"',"
                    + " '"+this.username+"',"
                    + " '"+this.password+"',"
                    + " '"+this.noTlp+"')";
            this.id= DBHelper.insertQueryGetId(SQL);
        } else {
            String SQL = "UPDATE user SET "
                    + " nama ='"+this.nama+"',"
                    + " email ='"+this.email+"',"
                    + " username ='"+this.username+"',"
                    + " password ='"+this.password+"',"
                    + " notelp ='"+this.noTlp+"'"
                    + "WHERE iduser ='"+this.id+"'";
            DBHelper.executeQuery(SQL);
        }
    }
    public void delete(){
        String SQL = "DELETE FROM user WHERE iduser = '"+this.id+"'";
        DBHelper.SelectQuery(SQL);
    }
    @Override
    public String toString(){
        return nama;
    }
}
