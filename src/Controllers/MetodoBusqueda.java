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
    public int findPersonByCode(int code){
for(int i= 0; i < people.length; i++){
if(people[i].getCode() == code){
    return -1;


}
    
}
return -1;

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
        
    }
}


