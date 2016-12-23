package pokemonG;

abstract class Pokemon {
    protected int curretnHp;
    protected int maxHp;
    protected int cp;  //combat power
    protected int maxCp;

    Pokemon(int maxCp,int maxHp){
        this.curretnHp=this.maxHp=maxHp;
        this.cp=this.maxCp=maxCp;
    }

    abstract public void wierdSound();
    abstract public int attack(Pokemon aim);

    public void sleep(int time){
        System.out.println("(∪｡∪)｡｡｡zzz");
        restore(maxHp);
    }

    public void evolve(int k1, int k2){
        maxHp*=k1;
        cp*=k2;
        if(cp>maxCp) cp=maxCp;

    }
    public void restore(int hp){
         curretnHp+=hp;
        if(curretnHp>maxHp)curretnHp=maxHp;
     }


}
