package pokemonG;


public class Squirtle extends Pokemon {
    private void superAttack(Pokemon aim){
        //something
        return ;
    }
    private void runAway(){
        System.out.println("٩๏̯͡๏۶(̅_̅_̅_̅(̅_̅_̅_̅_̅_̅_̅_̅_̅̅_̅()ڪے~");
    }
    private void vampirize(Pokemon aim){
        while(aim.cp>10) {
            this.cp++;
            aim.cp--;
        }
    }
    Squirtle(){
        super(70,40);
    }
    @Override
    public void wierdSound() {
        System.out.println("squirt");
    }

    @Override
public int attack(Pokemon aim){
        if(aim.curretnHp==aim.maxHp){
            superAttack(aim);
            return 0;
        }
        else if(this.curretnHp<(aim.curretnHp-100)&&this.cp<aim.cp){
            runAway();
            wierdSound();
            return 0;
        }
        else if(this.cp<aim.cp){
            vampirize(aim);

            return 0;
        }
        else{
            aim.curretnHp-=this.cp;
        }
        return 0;
    }
}
