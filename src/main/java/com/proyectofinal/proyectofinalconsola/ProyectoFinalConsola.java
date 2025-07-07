/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.proyectofinal.proyectofinalconsola;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ecastillo
 */
public class ProyectoFinalConsola {
    
    public static Employee instanciaEmployee = new Employee(); // DECLARACIÓN DE INSTANCIA GENERAL DE ENTIDAD
    public static List<Employee> listEmployee = new ArrayList<>(); // DECLARACIÓN DE LISTA, SIEMPRE EN MEMORIA    
    
    public static final int[] idSalas = { 1,2,3,4,5,6,7,8,9,10 };
    public static final String[] salas = { "sala 01", "sala 02", "sala 03", "sala 04", "sala 05", 
        "sala 06", "sala 07", "sala 08", "sala 09", "sala 10" };
    public static final int[] salaCapacidad = { 10, 15, 20, 10, 12, 25, 16, 15, 20, 15 };
    public static final String[] salaUbicacion = { "Piso 01 - norte", "Piso 01 - sur", "Piso 01 - centro", 
        "Piso 02 - norte", "Piso 02 - sur", "Piso 2 - centro","Piso 03 - norte" , "Piso 03 - sur", 
        "Piso 03 - centro", "Piso 04 - centro" };
               
    static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        // DECLARACIÓN DE INSTANCIA A LA PROPIA CLASE PARA USO DE METODOS NON-STATIC
        ProyectoFinalConsola instanciaClasePrincipal = new ProyectoFinalConsola();
        // INICIALIZA LISTA EMPLEADO CON DATOS POR DEFECTO
        listEmployee.add(new Employee(1, "Ana", "Garcia", "12345678", 1, 28, Date.valueOf("1997-03-15"), 'F', 
                "Soltera", "Miraflores", "Av. Larco 123", "Peruana",3200.00, "Analista", "ana.garcia@example.com", 
                "Sala 01", 10, "Piso 01 - norte", "Planificacion sprint", LocalDateTime.of(2025, 7,  5,  9,  0), 
                LocalDateTime.of(2025, 7,  5, 10,  0)));
        listEmployee.add(new Employee(2, "Luis", "Ramirez", "87654321", 1, 35,Date.valueOf("1990-11-02"), 'M', "Casado","San Isidro", "Calle Los Eucaliptos 45", "Peruano",4500.50, "Arquitecto SW", "luis.ramirez@example.com","Sala 02", 15, "Piso 01 - sur","Revision de arquitectura",LocalDateTime.of(2025, 7,  5, 15, 30),LocalDateTime.of(2025, 7,  5, 17,  0)));
        listEmployee.add(new Employee(3, "Maria", "Perez", "10203040", 2, 30,Date.valueOf("1995-01-20"), 'F', "Soltera","La Molina", "Jr. Los Alamos 337", "Peruana",3800.00, "QA Lead", "maria.perez@example.com","Sala 03", 20, "Piso 01 - centro","Testing release 1.2",LocalDateTime.of(2025, 7, 5, 10,  0),LocalDateTime.of(2025, 7, 5, 12,  0)));
        listEmployee.add(new Employee(4, "Carlos", "Diaz", "99887766", 1, 41,Date.valueOf("1984-06-07"), 'M', "Casado","Surco", "Av. Primavera 820", "Peruano",5200.75, "PM", "carlos.diaz@example.com","Sala 04", 10, "Piso 02 - norte","Kick-off proyecto X",LocalDateTime.of(2025, 7, 5,  8, 30),LocalDateTime.of(2025, 7, 5,  9, 30)));
        listEmployee.add(new Employee(5, "Patricia", "Lozano", "55667788", 1, 26,Date.valueOf("1999-09-11"), 'F', "Soltera","Barranco", "Malecon Souza 110", "Peruana",3000.00, "UX Designer", "patricia.lozano@example.com","Sala 05", 12, "Piso 02 - sur","Sesion de ideacion",LocalDateTime.of(2025, 7, 5, 14,  0),LocalDateTime.of(2025, 7, 5, 16,  0)));
        listEmployee.add(new Employee(6, "Jorge", "Ruiz", "33445566", 1, 32,Date.valueOf("1993-05-22"), 'M', "Conviviente","Pueblo Libre", "Av. Bolivar 660", "Peruano",4100.00, "DevOps", "jorge.ruiz@example.com","Sala 06", 25, "Piso 02 - centro","Pipeline review",LocalDateTime.of(2025, 7, 5, 11,  0),LocalDateTime.of(2025, 7, 5, 12, 30)));
        listEmployee.add(new Employee(7, "Lucia", "Torres", "11223344", 2, 29,Date.valueOf("1996-12-05"), 'F', "Soltera","Magdalena", "Jr. Tacna 155", "Peruana",3700.00, "Data Scientist", "lucia.torres@example.com","Sala 07", 16, "Piso 03 - norte","Modelos predictivos",LocalDateTime.of(2025, 7, 5,  9, 15),LocalDateTime.of(2025, 7, 5, 11, 15)));
        listEmployee.add(new Employee(8, "Daniel", "Vega", "77889900", 1, 45,Date.valueOf("1980-04-18"), 'M', "Casado","Jesus Maria", "Av. Arenales 1002", "Peruano",6000.00, "CTO", "daniel.vega@example.com","Sala 08", 15, "Piso 03 - sur","Reunión estrategica",LocalDateTime.of(2025, 7, 5, 17,  0),LocalDateTime.of(2025, 7, 5, 18, 30)));
        listEmployee.add(new Employee(9, "Veronica", "Campos", "66778899", 2, 33,Date.valueOf("1992-07-30"), 'F', "Casada","San Borja", "Jr. Montecarlo 55", "Peruana",4200.00, "Scrum Master", "veronica.campos@example.com","Sala 09", 20, "Piso 03 - centro","Sprint retrospective",LocalDateTime.of(2025, 7, 5, 13,  0),LocalDateTime.of(2025, 7, 5, 14,  0)));
        listEmployee.add(new Employee(10, "Oscar", "Paredes", "44556677", 1, 38,Date.valueOf("1987-02-14"), 'M', "Casado","Chorrillos", "Av. Defensores 321", "Peruano",4800.00, "Full Stack", "oscar.paredes@example.com","Sala 10", 15, "Piso 04 - centro","Demo funcional",LocalDateTime.of(2025, 7, 5, 10, 30),LocalDateTime.of(2025, 7, 5, 11, 30)));

        boolean salir = false;
        while (!salir) { // al agregar signo ! se niega, entonces evalua false
            System.out.print("Lista Opciones\n"
                    + "1. Mantenimiento empleado\n"
                    + "2. Seleccionar Sala\n"
                    + "0. Salir\n"
                    + "Escoge la opcion: ");
            int option = scan.nextInt();
            scan.nextLine();        
            switch (option) {
                case 0:
                    salir = true;
                    break;
                case 1:
                    instanciaClasePrincipal.mantenimientoEmpleado(); // LLAMADA AL METODO MANTENIMIENTO
                    break;
                case 2:
                    instanciaClasePrincipal.selecionarSala();
                    break;
                default:
                    System.out.println("Opcion invalida.");
                    break;
            }
        }
    }
                
    public void mantenimientoEmpleado() {
        boolean salir = false; 
        while (!salir) { // al agregar signo ! se niega, entonces evalua false
            System.out.print("Lista de opciones\n"
                    + "1. registrar\n"
                    + "2. actualizar\n"
                    + "3. eliminar\n"
                    + "4. listar\n"
                    + "0. Salir\n"
                    + "Escoge opcion: ");
            int option = scan.nextInt();
            scan.nextLine();
            switch (option) {
                case 0:
                    salir = true;
                    break;
                case 1:
                    instanciaEmployee.registraEmpleado(listEmployee); // LLAMADO AL METODO DE LA ENTIDAD QUE REGISTRA
                    break;
                case 2:
                    System.out.print("Ingrsa ID de empleado: ");
                    int id = scan.nextInt();
                    scan.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = scan.nextLine();
                    System.out.print("Apellido: ");
                    String apellido = scan.nextLine();
                    // NUEVA INSTANCIA DE ENTIDAD PARA ALMACENAR NUEVOS VALORES
                    Employee employee = new Employee();
                    // ASIGNACIÓN DE VALORES MEDIANTE LOS SETTERS
                    employee.setFirstName(nombre);
                    employee.setLastName(apellido);
                    // CONSUMO DE METODO QUE ACTUALIZA, USA PARAMETROS
                    instanciaEmployee.actualizaEmpleado(id, employee,listEmployee);
                    break;
                case 4:
                    litaEmpleados(); // CONSUMO DE METODO QUE LEE LA LISTA QUE PERSISTE EN EL TIEMPO
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }
    }
    public void litaEmpleados() {
        // RECORRE O ITERA LISTA
        System.out.println("*** Lista de empleados: ");
        for(int x = 0; x < listEmployee.size(); x++) {
            // OBTIENE VALORES MEDIANTE LOS GETTERS
            System.out.print(listEmployee.get(x).toString());
        }
        System.out.println("***");
    }
    public void selecionarSala(){
        System.out.print("Ingrese ID empleado:");
        int id = scan.nextInt();
        scan.nextLine();
        // stream es similar a for pero mucho mejor y mas rapido
        Employee emp = listEmployee.stream().filter(e -> id == e.getEmployeeID()).findFirst().orElse(null);
        if (emp != null){
            System.out.print("Ingrese ID sala: ");
            int idSala = scan.nextInt();
            boolean existeSala = false;
            for(int x = 0; x < salas.length; x++) { // itera elementos de array
                if (idSala == idSalas[x]) { // verifica existencia
                    existeSala = true;
                    emp.setRoom(salas[x]); // setea sala en atributo room
                    boolean bool = emp.selectRoom(listEmployee); // ejecuta metodo que verifica disponibilidad usando la lista
                    if (bool) {
                        emp.actualizaEmpleado(id, emp, listEmployee);
                        System.out.print(emp.toString());
                    }
                }
            }
            if (!existeSala) {
                System.out.println("No existe sala con ID: " + idSala);                
            }
        } else {
            System.out.println("No existe empleado con ID: " + id);
        }
    }
}
