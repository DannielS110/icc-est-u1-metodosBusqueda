package Controllers;

import views.ShowConsole;
import models.Persona;

public class MetodoBusqueda {

    private ShowConsole showConsole;
    private Persona[] people;
    public MetodoBusqueda(Persona[] persons) {
        showConsole = new ShowConsole();
        this.people = persons;
        showPerson();       
        showPersonByName(); 
    }

    public int busquedaLineal(int[] arreglo, int valorBuscar) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == valorBuscar) {
                return i;
            }
        }
        return -1;
    }

    /*
     * 
     * @param code a buscar
     * 
     * @return posicion de la persona encontrada
     */
    public int findPersonByCode(int code) {
        for (int i = 0; i < people.length; i++) {
            if (people[i].getCode() == code) {
                return i; // Return the index when found, not -1
            }
        }
        return -1; // Return -1 when not found
    }

    public void showPerson() {
        int codeToFind = showConsole.inputCode();
        int indexPerson = findPersonByCode(codeToFind);
        if (indexPerson >= 0) {
            showConsole.showMessage("Persona con codigo "
                    + codeToFind + " encontrada");
            showConsole.showMessage(people[indexPerson].toString());
            // showConsole.showMessage((String) people[indexPerson]);
            // showConsole.showMessage(people[indexPerson] + "");
        } else {
            showConsole.showMessage("Persona no encontrada");
        }
    }
    
    public int findPersonByName(String name) {
        for (int i = 0; i < people.length; i++) {
            if (people[i].getName().equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1;
    }

    public void showPersonByName() {
        String nameToFind = showConsole.inputName();
        int indexPerson = findPersonByName(nameToFind);
        
        if (indexPerson >= 0) {
            showConsole.showMessage("Persona con nombre '" + nameToFind + "' encontrada");
            showConsole.showMessage(people[indexPerson].toString());
        } else {
            showConsole.showMessage("Persona con nombre '" + nameToFind + "' no encontrada");
        }
    }
    
}


