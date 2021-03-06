package com.mycompany.dao;
// Generated 23/04/2020 11:07:28 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Clientes generated by hbm2java
 */
public class Clientes  implements java.io.Serializable {


     private Integer cliCod;
     private String cliNom;
     private String cliTel;
     private String cliCor;
     private String cliDir;
     private BigDecimal cliCre;
     private Integer vista;
     private Set<FacCabe> facCabes = new HashSet<FacCabe>(0);

    public Clientes() {
    }

    public Clientes(String cliNom, String cliTel, String cliCor, String cliDir, BigDecimal cliCre, Integer vista, Set<FacCabe> facCabes) {
       this.cliNom = cliNom;
       this.cliTel = cliTel;
       this.cliCor = cliCor;
       this.cliDir = cliDir;
       this.cliCre = cliCre;
       this.vista = vista;
       this.facCabes = facCabes;
    }
   
    public Integer getCliCod() {
        return this.cliCod;
    }
    
    public void setCliCod(Integer cliCod) {
        this.cliCod = cliCod;
    }
    public String getCliNom() {
        return this.cliNom;
    }
    
    public void setCliNom(String cliNom) {
        this.cliNom = cliNom;
    }
    public String getCliTel() {
        return this.cliTel;
    }
    
    public void setCliTel(String cliTel) {
        this.cliTel = cliTel;
    }
    public String getCliCor() {
        return this.cliCor;
    }
    
    public void setCliCor(String cliCor) {
        this.cliCor = cliCor;
    }
    public String getCliDir() {
        return this.cliDir;
    }
    
    public void setCliDir(String cliDir) {
        this.cliDir = cliDir;
    }
    public BigDecimal getCliCre() {
        return this.cliCre;
    }
    
    public void setCliCre(BigDecimal cliCre) {
        this.cliCre = cliCre;
    }
    public Integer getVista() {
        return this.vista;
    }
    
    public void setVista(Integer vista) {
        this.vista = vista;
    }
    public Set<FacCabe> getFacCabes() {
        return this.facCabes;
    }
    
    public void setFacCabes(Set<FacCabe> facCabes) {
        this.facCabes = facCabes;
    }




}


