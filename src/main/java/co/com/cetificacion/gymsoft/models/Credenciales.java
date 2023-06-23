package co.com.cetificacion.gymsoft.models;

import io.cucumber.datatable.DataTable;

import java.util.List;
import java.util.Map;

public class Credenciales {

    private String user;
    private String password;


    public Credenciales(DataTable dataTable) {
        List<Map<String, String>> mapList = dataTable.asMaps(String.class, String.class);
        this.user = mapList.get(0).get("user");
        this.password = mapList.get(0).get("password");
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
