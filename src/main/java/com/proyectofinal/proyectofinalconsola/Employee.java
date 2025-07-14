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
        try {
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
            System.out.print("Genero (Masculino=M, Femenino=F): ");
            char genero=scan.next().charAt(0);
            scan.nextLine();
            System.out.print("Estado civil: ");
            String estadoCivil = scan.nextLine();
            System.out.print("Distrito: ");
            String distrito=scan.nextLine();
            System.out.print("Nacionalidad: ");
            String nacionalidad=scan.nextLine();
            System.out.print("Salario: ");
            double salario=scan.nextDouble();
            scan.nextLine();
            System.out.print("Puesto: ");
            String puesto=scan.nextLine();
            System.out.print("Correo: ");
            String correo=scan.nextLine();
            /*
            System.out.print("Sala: ");
            String sala=scan.nextLine();
            System.out.print("Capacidad: ");
            int capacidad=scan.nextInt();
            scan.nextLine();
            System.out.print("Ubicacion: ");
            String ubicacion=scan.nextLine();
            System.out.print("Reunion: ");
            String reunion=scan.nextLine();
            System.out.print("Hora de Inicio (HH:mm): ");
            String horaDeInicio=scan.nextLine();
            System.out.print("Hora de Finalizacion (HH:mm): ");
            String horaDeFinalizacion=scan.nextLine();
            DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
            LocalDateTime inicio = null;
            LocalDateTime fin = null;
            // try {} catch () {} es usado para controlar errores
            try {
                // le da formato hora y minuto a los valore singresados inicio - fin
                LocalTime inicioTime = LocalTime.parse(horaDeInicio, timeFormatter);
                LocalTime finTime = LocalTime.parse(horaDeFinalizacion, timeFormatter);
                LocalDate hoy = LocalDate.now();
                // le da formato de fecha, hora y minuto a inicio - fin
                inicio = LocalDateTime.of(hoy, inicioTime);
                fin = LocalDateTime.of(hoy, finTime);
                if (!fin.isAfter(inicio)) {
                    System.out.println("*** Error: la hora fin debe ser mayor que hora inicio");
                    return;
                }
            } catch (Exception ex) {
                System.out.println("*** Error: " + ex.getMessage());
                return;
            }
            */
            // instancia de clase
            Employee employee = new Employee();
            // mediante los SETTERS asigna valores a cada atributo
            employee.setEmployeeID(listEmployee.getLast().getEmployeeID()+1);
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
            /*
            employee.setRoom(sala);
            employee.setCapacity(capacidad);
            employee.setLocation(ubicacion);
            employee.setMeetingSubject(reunion);
            employee.setStartTime(inicio);
            employee.setEndTime(fin);
            */
            // agrega registro a la LISTA
            listEmployee.add(employee);
            System.out.println("*** Empleado registrado");
        } catch (Exception ex) {
            System.out.println("*** Error: " + ex.getMessage());
        }
    }
    // permite actualizar empleado en la lista
    public void actualizaEmpleado(int employeeID, Employee employee, List<Employee> listEmployee) {
        try {
            // segun el id se actualiza el empleado
            for (int i = 0;  i < listEmployee.size(); i ++) {
                if (listEmployee.get(i).getEmployeeID() == employeeID) {
                    Employee emp = listEmployee.get(i);
                    if (employee.getFirstName()!= null && !employee.getFirstName().isEmpty()) emp.setFirstName(employee.getFirstName());
                    if (employee.getLastName() != null && !employee.getLastName().isEmpty()) emp.setLastName(employee.getLastName());
                    if (employee.getDocumentNumber() != null && !employee.getDocumentNumber().isEmpty()) emp.setDocumentNumber(employee.getDocumentNumber());
                    if (employee.getDocumentType() != null && employee.getDocumentType() >= 0) emp.setDocumentType(employee.getDocumentType());
                    if (employee.getAge() != null && employee.getAge() >= 0) emp.setAge(employee.getAge());
                    if (employee.getBirthday() != null) emp.setBirthday(employee.getBirthday());
                    if (employee.getGender() == 'F' || employee.getGender() == 'M') emp.setGender(employee.getGender());
                    if (employee.getMaritalStatus() != null && !employee.getMaritalStatus().isEmpty()) emp.setMaritalStatus(employee.getMaritalStatus());
                    if (employee.getDistrict() != null && !employee.getDistrict().isEmpty()) emp.setDistrict(employee.getDistrict());
                    if (employee.getNationality() != null && !employee.getNationality().isEmpty()) emp.setNationality(employee.getNationality());
                    if (employee.getSalary() != 0.0) emp.setSalary(employee.getSalary());
                    if (employee.getPosition() != null && !employee.getPosition().isEmpty()) emp.setPosition(employee.getPosition());
                    if (employee.getEmail() != null && !employee.getEmail().isEmpty()) emp.setEmail(employee.getEmail());
                    if (employee.getRoom() != null) emp.setRoom(employee.getRoom());
                    if (employee.getCapacity() != null) emp.setCapacity(employee.getCapacity());
                    if (employee.getLocation() != null) emp.setLocation(employee.getLocation());
                    if (employee.getMeetingSubject() != null) emp.setMeetingSubject(employee.getMeetingSubject());
                    if (employee.getStartTime() != null) emp.setStartTime(employee.getStartTime());
                    if (employee.getEndTime() != null) emp.setEndTime(employee.getEndTime());
                    System.out.print("*** Registro actualizado: " + emp.toString());
                    return;
                }
            }
            System.out.println("*** No existe empleado con ID: " + employeeID);
        } catch (Exception ex) {
            System.out.println("*** Error: " + ex.getMessage());
        }
    }
    // busca sala en la lista, si existe retorna true, sino false
    public boolean selectRoom(List<Employee> listEmployee) {
        // se consume metodo checkAvailability enviando dos parametros, la lista de empleado y la sala
        // retorna true si sala esta disponible, sino false
        boolean bool = this.checkAvailability(listEmployee, this.room);
        // establece valor por defecto para variable msg
        String msg = String.format("*** La sala %s si se encuentra disponible", this.room);
        // si es falso muestra mensaje y limpia atributo sala
        if (!bool) {
            // sobre escribe valor de variable
            msg = String.format("*** La sala %s no se encuentra disponible", this.room);
            // se limpia el valor del atributo sala
            this.setRoom("");
            this.setCapacity(null);
            this.setLocation("");
            this.setMeetingSubject("");
            this.setStartTime(null);
            this.setEndTime(null);
            this.actualizaEmpleado(this.employeeID, this, listEmployee);
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
    // inicia la creacion de la reunion, espera parametro lista de empleados
    // retorna true / false, en caso se quiera realizar alguna accion
    public boolean create(List<Employee> listEmployee) {
        // verifica disponibilidad de la sala
        boolean bool = this.checkAvailability(listEmployee, this.room);
        System.out.print("Reunion: ");
        String reunion=scan.nextLine();
        System.out.print("Hora de Inicio (HH:mm): ");
        String horaDeInicio=scan.nextLine();
        System.out.print("Hora de Finalizacion (HH:mm): ");
        String horaDeFinalizacion=scan.nextLine();
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalDateTime inicio = null;
        LocalDateTime fin = null;
        // try {} catch () {} es usado para controlar errores
        try {
            // le da formato hora y minuto a los valore singresados inicio - fin
            LocalTime inicioTime = LocalTime.parse(horaDeInicio, timeFormatter);
            LocalTime finTime = LocalTime.parse(horaDeFinalizacion, timeFormatter);
            LocalDate hoy = LocalDate.now();
            // le da formato de fecha, hora y minuto a inicio - fin
            inicio = LocalDateTime.of(hoy, inicioTime);
            fin = LocalDateTime.of(hoy, finTime);
            if (!fin.isAfter(inicio)) {
                System.out.println("Error: la hora fin debe ser mayor que hora inicio");
                return false;
            }
            this.setMeetingSubject(reunion);
            this.setStartTime(inicio);
            this.setEndTime(fin);
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
            return false;
        }
        // ejecuta metodo que realiza la programacion
        this.release(listEmployee, bool);
        // libera salas en base a reuniones finalizadas
        // this.liberarReunionesSalas(listEmployee); 
        return bool;
    }
    // realiza la programacion, espera como parametro la lista de empleados, y una confirmacion de programacion
    public void release(List<Employee> listEmployee, boolean commit) {
        // si confirmacion es falsa ejecuta metodo que limpia valores
        if (!commit) {
            // ejecuta metodo para cancelar reunion
            this.cancelMeeting(listEmployee);
            System.out.print("Progrmacion no realizada: \n" + this.getEmployeeMeet());
            return;
        }
        // ejecuta metodo que actualiza informacion de empleado en la lista
        this.actualizaEmpleado(this.employeeID, this, listEmployee);
        System.out.print("Programacion realizada: \n" + this.getEmployeeMeet());
    }
    // cancela reunion limpiando valores de sala y reunion
    public void cancelMeeting(List<Employee> listEmployee) {
        this.room = "";
        this.capacity = null;
        this.location = "";
        this.meetingSubject = "";
        this.startTime = null;
        this.endTime = null;
        // ejecuta metodo que actualiza informacion de empleado en la lista
        this.actualizaEmpleado(this.employeeID, this, listEmployee);
    }
    public void rescheduleMeeting(List<Employee> listEmployee) {
        boolean bool = this.selectRoom(listEmployee);
        if (bool) {
            this.create(listEmployee);
        }
        
    }
    // busca empleados en la lista que tengan mayor o igual salario buscado mediante parametro salary
    public void getEmployeeBySalary(List<Employee> listEmployee, double salary) {
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
    public void getEmployeeByDistrict(List<Employee> listEmployee, String district){
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
    public void liberarReunionesSalas(List<Employee> listEmployee) {
        try {
            LocalDateTime now = LocalDateTime.now();
            for (Employee emp: listEmployee) {
                LocalDateTime inicio = emp.getStartTime();
                LocalDateTime fin = emp.getEndTime();
                if (inicio != null && fin != null && fin.isBefore(now)){
                    emp.setRoom(null);
                    emp.setCapacity(null);
                    emp.setLocation(null);
                    emp.setMeetingSubject(null);
                    emp.setStartTime(null);
                    emp.setEndTime(null);
                }
            }
        } catch (Exception ex) {
            System.out.println("*** Error: " + ex.getMessage());
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
    public String getEmployeeMeet() {
        return String.format("employeID: %d, firstName: %s, lastName: %s, room: %s, capacity: %d, location: %s, "
                + "meetingSubject: %s, startTime: %s, endTime: %s\n", 
                this.employeeID, this.firstName, this.lastName, this.room, this.capacity, this.location, 
                this.meetingSubject,this.startTime, this.endTime);
    }
}
