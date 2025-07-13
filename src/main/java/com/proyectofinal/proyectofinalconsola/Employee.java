/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectofinal.proyectofinalconsola;

import static com.proyectofinal.proyectofinalconsola.ProyectoFinalConsola.scan;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
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
        String numeroDocumento = scan.nextLine();
        System.out.print("Tipo de Documento (1=DNI, 2=RUC, 3=Carnet Ext.): ");
        int tipoDocumento = scan.nextInt();
        scan.nextLine();
        System.out.print("Edad: ");
        int edad = scan.nextInt();
        scan.nextLine();
        System.out.print("Nacimiento (yyyy-MM-dd): ");
        String strBirthday = scan.nextLine();
        DateTimeFormatter dtfB = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate nacimientoLD;
        Date nacimiento;
        try {
            nacimientoLD = LocalDate.parse(strBirthday, dtfB);
            nacimiento = Date.from(nacimientoLD.atStartOfDay(ZoneId.systemDefault()).toInstant());
        } catch (Exception ex) {
            System.out.println("Formato de fecha invalido usa (yyyy-MM-dd)");
            return;
        }
        System.out.println("Genero (Masculino=M, Femenino=F)");
        char genero=scan.next().charAt(0);
        System.out.println("Estado civil");
        String estadoCivil = scan.nextLine();
        System.out.println("Distrito");
        String distrito=scan.nextLine();
        System.out.println("Nacionalidad");
        String nacionalidad=scan.nextLine();
        System.out.println("Salario");
        double salario=scan.nextDouble();
        scan.nextLine();
        System.out.println("Puesto.");
        String puesto=scan.nextLine();
        System.out.println("Correo");
        String correo=scan.nextLine();
        System.out.println("Sala");
        String sala=scan.nextLine();
        System.out.println("Capacidad");
        int capacidad=scan.nextInt();
        scan.nextLine();
        System.out.println("Ubicacion");
        String ubicacion=scan.nextLine();
        System.out.println("Reunion");
        String reunion=scan.nextLine();
        System.out.println("Hora de Inicio (HH:mm)");
        String horaDeInicio=scan.nextLine();
        System.out.println("Hora de Finalizacion (HH:mm)");
        String horaDeFinalizacion=scan.nextLine();
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalDateTime inicio = null;
        LocalDateTime fin = null;
        try {
            LocalTime inicioTime = LocalTime.parse(horaDeInicio, timeFormatter);
            LocalTime finTime = LocalTime.parse(horaDeFinalizacion, timeFormatter);
            LocalDate hoy = LocalDate.now();
            inicio = LocalDateTime.of(hoy, inicioTime);
            fin = LocalDateTime.of(hoy, finTime);
            if (fin.isAfter(inicio)) {
                System.out.println("Error: la hora fin debe ser mayor que hora inicio");
                return;
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
            return;
        }
        
        // instancia de clase
        Employee employee = new Employee();
        // mediante los SETTERS asigna valores a cada atributo
        employee.setFirstName(nombre);
        employee.setLastName(apellido);
        employee.setDocumentNumber(numeroDocumento);
        employee.setDocumentType(tipoDocumento);
        employee.setAge(edad);
        employee.setBirthday(nacimiento);
        employee.setGender(genero);
        employee.setMaritalStatus(estadoCivil);
        employee.setDistrict(distrito);
        employee.setNationality(nacionalidad);
        employee.setSalary(salario);
        employee.setPosition(puesto);
        employee.setEmail(correo);
        employee.setRoom(sala);
        employee.setCapacity(capacidad);
        employee.setLocation(ubicacion);
        employee.setMeetingSubject(reunion);
        employee.setStartTime(inicio);
        employee.setEndTime(fin);
        // agrega registro a la LISTA
        listEmployee.add(employee);
        System.out.println("Empleado registrado");
    }
    // permite actualizar empleado en la lista
    public void actualizaEmpleado(int id, Employee employee, List<Employee> listEmployee) {
        // segun el indice (id) se actualiza el empleado
        listEmployee.set(id, employee);
    }
    // busca sala en la lista, si existe retorna true, sino false
    public boolean selectRoom(List<Employee> listEmployee) {
        // se consume metodo checkAvailability enviando dos parametros, la lista de empleado y la sala
        // retorna true si sala esta disponible, sino false
        boolean bool = this.checkAvailability(listEmployee, this.room);
        // establece valor por defecto para variable msg
        String msg = String.format("La sala %s si se encuentra disponible", this.room);
        // si es falso muestra mensaje y limpia atributo sala
        if (!bool) {
            // sobre escribe valor de variable
            msg = String.format("La sala %s no se encuentra disponible", this.room);
            // se limpia el valor del atributo sala
            this.room = "";
        }
        // muestra en pantalla el mensaje
        System.out.println(msg);
        return bool;
    }
    // busca sala en la lista, verificando su disponibilidad usando startTime, endTime
    public boolean checkAvailability(List<Employee> listEmployee, String room) {
        // se itera cada elementos de la lista de empleados haciendo uso de stream()
        // stream() es similar a for, pero mucho mas robusto y mas rapido
        // filter() permite filtrar los elementos segun las condiciones dadas
        // noneMatch() retorna true/false, verifica que ningun elemento de lista cumpla con la condicion
        return listEmployee.stream()
                .filter(emp -> emp.getEmployeeID() != this.getEmployeeID() && room.equalsIgnoreCase(emp.getRoom()))
                .noneMatch(emp -> 
                        !(emp.endTime.isBefore(this.startTime) // fin de otro antes de mi inicio
                          || this.endTime.isBefore(emp.getStartTime()))); // mi fin antes de su inicio
    }
    // busca empleados en la lista que tengan mayor o igual salario buscado mediante parametro salary
    public void geyEmployeeBySalary(List<Employee> listEmployee, double salary) {
        // recorre toda la lista de empleados
        for(int x = 0; x < listEmployee.size(); x++){
            // valida que el empleado de la iteracion actual tenga igual o mayor salario
            if (listEmployee.get(x).getSalary() >= salary) {
                // muestra en pantalla toda la informacion del empleado
                System.out.print(listEmployee.get(x).toString());
            }
        }
    }
    // busca empleados en la lista que pertenezcan al distrito buscado mediante parametro district
    public void geyEmployeeByDistrict(List<Employee> listEmployee, String district){
        // recorre toda la lista de empleados
        for(int x=0; x < listEmployee.size(); x++){
            // valida que el empleado de la iteracion actual pertenezca al distrito buscado
            // .equalsIgnoreCase hace una busqueda de cadena ignorando si es mayuscula o minuscula
            if (listEmployee.get(x).getDistrict().equalsIgnoreCase(district)){
                // muestra en pantalla toda la informacion del empleado
                System.out.print(listEmployee.get(x).toString());
            }
        }
    }
    // @Override permite sobre escribir metodos
    // metodo toString retorna toda la informacion del empleado en formato String
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
