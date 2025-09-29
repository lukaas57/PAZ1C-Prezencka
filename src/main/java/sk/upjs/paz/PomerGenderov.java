package sk.upjs.paz;

public record PomerGenderov(
        int pocetChlapcov,
        int pocetDievcat,
        int pocetMutant
) {

    public double pomerChlapcov(){
        var celkovo = pocetChlapcov + pocetDievcat + pocetMutant;

        return (double) pocetChlapcov / (double) celkovo;
    }

    public double pomerDievcat(){
        var celkovo = pocetChlapcov + pocetDievcat + pocetMutant;

        return (double) pocetDievcat / (double) celkovo;
    }

}
