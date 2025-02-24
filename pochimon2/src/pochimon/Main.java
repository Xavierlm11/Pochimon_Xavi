package pochimon;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Type fire = new Type();
        fire.setType(TypeEnum.FIRE);
        ArrayList<Type> typesPochi1 = new ArrayList<>();
        typesPochi1.add(fire);
        ArrayList<Move> moves = new ArrayList<>();
        Move firePunch = new Move();

        firePunch.setType(fire);
        moves.add(firePunch);

        PochimonSpecies speciePochi1 = new PochimonSpecies("dog", typesPochi1);
        PochimonSpecies speciePochi2 = new PochimonSpecies("big dog", typesPochi1);
        Pochimon pochi2 = new Pochimon("Pochita", 5, 0, 20, 1, speciePochi1, "A fire dog", true, true, moves,
                speciePochi2, 50, 50, 14, 11, 14, 7, 15);

        System.out.println(pochi2.getName());
        System.out.println(pochi2.getSpecie().getTypes());
        System.out.println(pochi2.getSpecie().getSpeciesName());
        System.out.println(pochi2.getMoves().toString());

    }
}