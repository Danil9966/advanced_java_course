package pokemonG;


import java.util.LinkedList;


 class Trainer {
    private LinkedList<Pokemon> pokemons;
    private int lvl=0;
    boolean sex;//true man, false woman
     Trainer(boolean sex,Pokemon first){
         pokemons.add(first);
         this.sex=sex;
     }

}
