package KlasyAbstrakcyjne;

public class KlasaZewnetrzna {
     int poleZewnetrzne;

     int metodaZewnetrzna(){
         Wewnetrzna obiektWewnetrzna = new Wewnetrzna();
         obiektWewnetrzna.poleWewnetrzne = 202;

         return -1;


     }

    class Wewnetrzna{
         int poleWewnetrzne;
         int metodaWewnetrzna(){
             metodaZewnetrzna();
             poleZewnetrzne =100;
             return -2;

         };
    }

}
