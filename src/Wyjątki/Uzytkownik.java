package Wyjątki;

public class Uzytkownik {
    public void wprowadzHaslo(String haslo) throws NiezbytTajneHasloException{
        if(!haslo.contains("tajne")){
            throw new NiezbytTajneHasloException();
        }

    }

    public void wprowadzMail(String mail){
        if(!mail.contains("@")){
            throw new NiepoprawnyEmailException();
        }

    }

}
