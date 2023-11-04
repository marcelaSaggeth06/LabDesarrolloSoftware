/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.Date;

/**
 *
 * @author fancu
 */
public class ViewModelEmpleados {
    // atribitos de la tabla empleados
        private int idEmpleado;
    private String nombresEmpleado;
    private String apellidosEmpleado;
    private String DUI;
    private int ISSS;
    private String telefono;
    private String email;
    private Date fechaNac;
    private Date fechaContratacion;
    private float salario;
    private int idCargo;
    private int idDireccion;

    public ViewModelEmpleados() {
    }

    public ViewModelEmpleados(String nombresEmpleado, String apellidosEmpleado, String DUI, int ISSS, String telefono, String email, Date fechaNac, Date fechaContratacion, float salario, int idCargo, int idDireccion) {
        this.nombresEmpleado = nombresEmpleado;
        this.apellidosEmpleado = apellidosEmpleado;
        this.DUI = DUI;
        this.ISSS = ISSS;
        this.telefono = telefono;
        this.email = email;
        this.fechaNac = fechaNac;
        this.fechaContratacion = fechaContratacion;
        this.salario = salario;
        this.idCargo = idCargo;
        this.idDireccion = idDireccion;
    }
    // Metodos de la clase View Empleados

    /**
     * @return the idEmpleado
     */
    public int getIdEmpleado() {
        return idEmpleado;
    }

    /**
     * @param idEmpleado the idEmpleado to set
     */
    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    /**
     * @return the nombresEmpleado
     */
    public String getNombresEmpleado() {
        return nombresEmpleado;
    }

    /**
     * @param nombresEmpleado the nombresEmpleado to set
     */
    public void setNombresEmpleado(String nombresEmpleado) {
        this.nombresEmpleado = nombresEmpleado;
    }

    /**
     * @return the apellidosEmpleado
     */
    public String getApellidosEmpleado() {
        return apellidosEmpleado;
    }

    /**
     * @param apellidosEmpleado the apellidosEmpleado to set
     */
    public void setApellidosEmpleado(String apellidosEmpleado) {
        this.apellidosEmpleado = apellidosEmpleado;
    }

    /**
     * @return the DUI
     */
    public String getDUI() {
        return DUI;
    }

    /**
     * @param DUI the DUI to set
     */
    public void setDUI(String DUI) {
        this.DUI = DUI;
    }

    /**
     * @return the ISSS
     */
    public int getISSS() {
        return ISSS;
    }

    /**
     * @param ISSS the ISSS to set
     */
    public void setISSS(int ISSS) {
        this.ISSS = ISSS;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the fechaNac
     */
    public Date getFechaNac() {
        return fechaNac;
    }

    /**
     * @param fechaNac the fechaNac to set
     */
    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    /**
     * @return the fechaContratacion
     */
    public Date getFechaContratacion() {
        return fechaContratacion;
    }

    /**
     * @param fechaContratacion the fechaContratacion to set
     */
    public void setFechaContratacion(Date fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    /**
     * @return the salario
     */
    public float getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(float salario) {
        this.salario = salario;
    }

    /**
     * @return the idCargo
     */
    public int getIdCargo() {
        return idCargo;
    }

    /**
     * @param idCargo the idCargo to set
     */
    public void setIdCargo(int idCargo) {
        this.idCargo = idCargo;
    }

    /**
     * @return the idDireccion
     */
    public int getIdDireccion() {
        return idDireccion;
    }

    /**
     * @param idDireccion the idDireccion to set
     */
    public void setIdDireccion(int idDireccion) {
        this.idDireccion = idDireccion;
    }
    
 
}
