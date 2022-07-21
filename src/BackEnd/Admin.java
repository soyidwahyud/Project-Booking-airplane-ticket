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
public class Admin {
    private int idAdmin;
    private String username;
    private String password;

    public Admin() {
    }

    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public Admin getById(int id){
        Admin a = new Admin();
        ResultSet rs = DBHelper.SelectQuery("SELECT * FROM admin"
                + "Where idadmin = '"+id+"'");
        try {
            while (rs.next()) {
                a = new Admin();
                a.setIdAdmin(rs.getInt("idadmin"));
                a.setUsername(rs.getString("username"));
                a.setPassword(rs.getString("password"));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return a;
    }
    public ArrayList<Admin> getAll(){
        ArrayList<Admin> ListAdmin= new ArrayList();
        ResultSet rs = DBHelper.SelectQuery("SELECT * FROM admin");
        try {
            while (rs.next()) {
                Admin a = new Admin();
                a.setIdAdmin(rs.getInt("idadmin"));
                a.setUsername(rs.getString("username"));
                a.setPassword(rs.getString("password"));
                ListAdmin.add(a);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListAdmin;
    }
    public void save(){
        if (getById(idAdmin).getIdAdmin()== 0) {
            String SQL = "INSERT INTO admin(username, password) VALUES("
                    + " '"+this.username+"',"
                    + " '"+this.password+"')";
            this.idAdmin = DBHelper.insertQueryGetId(SQL);
        } else {
            String SQL = "UPDATE admin SET "
                    + " username ='"+this.username+"',"
                    + " password ='"+this.password+"',"
                    + "WHERE idadmin ='"+this.idAdmin+"'";
            DBHelper.executeQuery(SQL);
        }
    }
    public void delete(){
        String SQL = "DELETE FROM admin WHERE idadmin = '"+this.idAdmin+"'";
        DBHelper.SelectQuery(SQL);
    }
    
}
