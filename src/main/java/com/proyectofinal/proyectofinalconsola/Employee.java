/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectofinal.proyectofinalconsola;

import static com.proyectofinal.proyectofinalconsola.ProyectoFinalConsola.scan;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

/**
 *
 * @author ecastillo
 */
// DECLARACION DE ENTIDAD / CLASE
public class Employee {
    // DECLARACION DE ATRIBUTOS / PROPIEDADES
    private Integer employeeID;
    private String firstName;
    private String lastName;
    private String documentNumber;
    private Integer documentType;
    private Integer age;
    private Date birthday;
    private char gender;
    private String maritalStatus;
    private String district;
    private String address;
    private String nationality;
    private double salary;
    private String position;
    private String email;
    private String room;
    private Integer capacity;
    private String location;
    private String meetingSubject;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    // CONSTRUCTOR - contiene argumentos o parametros
    // permite crear objeto sin valores
    public Employee() {}
    // permite crear objeto de clase con valores por defecto
    public Employee(Integer employeeID, String firstName, String lastName, String documentNumber, Integer documentType, 
                    Integer age, Date birthday, char gender, String maritalStatus, String district, String address, 
                    String nationality, double salary, String position, String email, String room, Integer capacity, 
                    String location, String meetingSubject, LocalDateTime startTime, LocalDateTime endTime) {
        // asignaciode los valores de los arrgmentos a los atributos de la clase
        // se usa this. para acceder a estos atributos en el contexto de la clase
        this.employeeID = employeeID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.documentNumber = documentNumber;
        this.documentType = documentType;
        this.age = age;
        this.birthday = birthday;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
        this.district = district;
        this.address = address;
        this.nationality = nationality;
        this.salary = salary ;
        this.position = position;
        this.email = email;
        this.room = room;
        this.capacity = capacity;
        this.location = location;
        this.meetingSubject = meetingSubject;
        this.startTime = startTime;
        this.endTime = endTime;
    }
    // DELARACIÓN DE SETTERS / GETTERS
    public void setEmployeeID(Integer val) { this.employeeID = val; }
    public Integer getEmployeeID() { return this.employeeID; }
    public void setFirstName(String val) { this.firstName = val; }
    public String getFirstName() { return this.firstName; }
    public void setLastName(String val) { this.lastName = val; }
    public String getLastName() { return this.lastName; }
    public void setDocumentNumber(String val) { this.documentNumber = val; }
    public String getDocumentNumber() { return this.documentNumber; }
    public void setDocumentType(Integer val) { this.documentType = val; }
    public Integer getDocumentType() { return this.documentType; }
    public void setAge(Integer val) { this.age = val; }
    public Integer getAge() { return this.age; }
    public void setBirthday(Date val) { this.birthday = val; }
    public Date getBirthday() { return this.birthday; }
    public void setGender(char val) { this.gender = val; }
    public char getGender() { return this.gender; }
    public void setMaritalStatus(String val) { this.maritalStatus = val; }
    public String getMaritalStatus() { return this.maritalStatus; }
    public void setDistrict(String val) { this.district = val; }
    public String getDistrict() { return this.district; }
    public void setNationality(String val) { this.nationality = val; }
    public String getNationality() { return this.nationality; }
    public void setSalary(double val) { this.salary = val; }
    public double getSalary() { return this.salary; }
    public void setPosition(String val) { this.position = val; }
    public String getPosition() { return this.position; }
    public void setEmail(String val) { this.email = val; }
    public String getEmail() { return this.email; }
    public void setRoom(String val) { this.room = val; }
    public String getRoom() { return this.room; }
    public void setCapacity(Integer val) { this.capacity = val; }
    public Integer getCapacity() { return this.capacity; }
    public void setLocation(String val) { this.location = val; }
    public String getLocation() { return this.location; }
    public void setMeetingSubject(String val) { this.meetingSubject = val; }
    public String getMeetingSubject() { return this.meetingSubject; }
    public void setStartTime(LocalDateTime val) { this.startTime = val; }
    public LocalDateTime getStartTime() { return this.startTime; }
    public void setEndTime(LocalDateTime val) { this.endTime = val; }
    public LocalDateTime getEndTime() { return this.endTime; }
    
    // DECLARACIÓN DE METODOS
    public void registraEmpleado(List<Employee> listEmployee) {
        System.out.print("Nombre: ");
        String nombre = scan.nextLine();
        System.out.print("Apellido: ");
        String apellido = scan.nextLine();
        System.out.print("Numero de Documento: ");
        String documenNumber = scan.nextLine();
        System.out.print("Tipo de Documento (1=DNI, 2=RUC, 3=Carnet Ext.): ");
        int documentType = scan.nextInt();
        scan.nextLine();
        System.out.print("Edad: ");
        int age = scan.nextInt();
        scan.nextLine();
        System.out.print("Nacimiento (yyyy-MM-dd): ");
        String strBirthday = scan.nextLine();
        DateTimeFormatter dtfB = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate birthday;
        try {
            birthday = LocalDate.parse(strBirthday, dtfB);
        } catch (Exception ex) {
            System.out.println("Formato de fecha invalido usa (yyyy-MM-dd)");
            return;
        }
        // instancia de clase
        Employee employee = new Employee();
        // mediante los SETTERS asigna valores a cada atributo
        employee.setFirstName(nombre);
        employee.setLastName(apellido);
        // agrega registro a la LISTA
        listEmployee.add(employee);
        System.out.println("Empleado registrado");
    }
    public void actualizaEmpleado(int id, Employee employee, List<Employee> listEmployee) {
        listEmployee.set(id, employee);
    }
    // busca sala en la lista, si existe retorna true, sino false
    public boolean selectRoom(List<Employee> listEmployee) {
        boolean bool = this.checkAvailability(listEmployee, this.room);
        String msg = String.format("La sala %s si se encuentra disponible", this.room);
        // si es falso muestra mensaje y limpia atributo sala
        if (!bool) {
            msg = String.format("La sala %s no se encuentra disponible", this.room);
            this.room = "";
        }
        System.out.println(msg);
        return bool;
    }
    // busca sala en la lista, verificando su disponibilidad usando startTime, endTime
    public boolean checkAvailability(List<Employee> listEmployee, String room) {
        return listEmployee.stream()
                .filter(emp -> emp.getEmployeeID() != this.getEmployeeID() && room.equalsIgnoreCase(emp.getRoom()))
                .noneMatch(emp -> 
                        !(emp.endTime.isBefore(this.startTime) // fin de otro antes de mi inicio
                          || this.endTime.isBefore(emp.getStartTime()))); // mi fin antes de su inicio
    }
    
    @Override
    public String toString() {
        return String.format("employeID: %d, firstName: %s, lastName: %s, documentNumber: %s, documentType: %d, "
                + "age: %d, birthday: %s, gender: %s, maritalStatus: %s, district: %s, address: %s, nationality: %s,"
                + "salary: %.2f, position: %s, email: %s, room: %s, capacity: %d, location: %s, meetingSubject: %s,"
                + "startTime: %s, endTime: %s\n", 
                this.employeeID, this.firstName, this.lastName, this.documentNumber, this.documentType,
                this.age, this.birthday, this.gender, this.maritalStatus, this.district, this.address, this.nationality,
                this.salary, this.position, this.email, this.room, this.capacity, this.location, this.meetingSubject,
                this.startTime, this.endTime);
    }
}
