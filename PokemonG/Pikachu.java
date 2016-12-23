package pokemonG;


public class Pikachu extends Pokemon{

    private int thunderAttack(Pokemon aim){
        System.out.println(
                "███████▀────▄██\n" +
                "█████▀────▄████\n" +
                "███▀────▄██████\n" +
                "█▀───────────▄█\n" +
                "█████▀────▄████\n" +
                "███▀───▄███████\n" +
                "█▀─▄▄██████████\n" +
                "███████████████");
        return 1;
    }
    private int begMercy(){
        System.out.println("(╯︵╰,)");
        return 0;
    }
    private int parallize(Pokemon aim){
        System.out.println("" +
                "▕▔╲┊┊┊┊┊┊┊╱▔▏┊┊┊\n" +
                "┊╲╱╲┊┊┊┊┊╱╲╱┊┊┊┊\n" +
                "┊┊╲┈╲▂▂▂╱┈╱┊┊┊╱╲\n" +
                "┊┊╱┈┈┈┈┈┈┈╲┊┊╱┈┈╲\n" +
                "┊┊▏▕▆▍▂▕▆▍▕┊╱┈┈┈╱\n" +
                "┊▕╭╮┈┳┻┳┈╭╮▏╲┈┈╱\n" +
                "┊┊╲╯┈╰━╯┈╰╱┊╱┈┈╲\n" +
                "┊┊╱┈┈┈┈┈┈┈╲┊╲┈┈┈╲\n" +
                "┊▕╲┈▕┈┈┈▏┈╱▏┊╱┈╱\n" +
                "┊▕┈▔▔┈┈┈▔▔┈▏╱┈╱┊\n" +
                "┊▕┈┈┈┈┈┈┈┈▕▔┈╱┊┊\n" +
                "┈┈╲┈┈┈┈┈┈┈╱▔▔┈┈┈\n" +
                "┈┈▕▂╱▔▔▔╲▂▏┈┈┈┈┈\n");
        //something bad
        return 0;
    }



    Pikachu(){

        super(100, 50);

    }


    @Override
    public int attack(Pokemon aim) {
        if(aim.curretnHp==aim.maxHp){
            thunderAttack(aim);
            return 0;
        }
        else if(this.curretnHp<(aim.curretnHp-100)&&this.cp<aim.cp){
            begMercy();
            return 0;
        }
        else if(this.cp<aim.cp){
            parallize(aim);

            return 0;
        }
        else{
            aim.curretnHp-=this.cp;
        }
        return 0;
    }
    @Override
    public void wierdSound() {
        System.out.println("ピカチュウ");
    }
}
