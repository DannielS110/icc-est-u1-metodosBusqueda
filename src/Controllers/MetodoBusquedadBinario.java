package Controllers;

import models.Persona;
import views.ShowConsole;

public class MetodoBusquedadBinario {
    private Persona[] people;
    private ShowConsole pantalla;
    
    public MetodoBusquedadBinario(Persona[] people) {
        this.people = people;
        this.pantalla = new ShowConsole();
        pantalla.showMessage("Metodo de busqueda binario");
    }

    public int findPersonaByCode(int code) {
        int bajo = 0;
        int alto = people.length - 1;

        while (alto >= bajo) {
            int central = (alto + bajo) / 2;

            if (people[central].getCode() == code) {
                return central;
            }
            if (people[central].getCode() > code) {
                alto = central - 1;
            } else {
                bajo = central + 1;
            }
        }
        return -1;
    }

    public void showPersonaByCode() {
        int codeToFind = pantalla.inputCode();
        int indexPerson = findPersonaByCode(codeToFind);
        
        if (indexPerson >= 0) {
            pantalla.showMessage("Persona con codigo " + codeToFind + " encontrada");
            pantalla.showMessage(people[indexPerson].toString());
        } else {
            pantalla.showMessage("Persona no encontrada");
        }
    }
   
}