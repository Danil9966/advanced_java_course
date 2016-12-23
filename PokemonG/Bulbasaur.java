package pokemonG;


public class Bulbasaur extends Pokemon {

    Bulbasaur(){
        super(60,60);
    }
    private void agress(Pokemon aim){
        System.out.println("'(◣_◢)'");
    }

    @Override
    public void wierdSound() {
        System.out.println("brrbrbbbr");
    }

    @Override
    public int attack(Pokemon aim) {
        agress(aim);

        return 0;
    }
}
