package efs.task.collections.data;

import efs.task.collections.entity.Hero;
import efs.task.collections.entity.Town;

import java.util.*;

public class DataProvider {

    public static final String DATA_SEPARATOR = ",";

    // TODO Utwórz listę miast na podstawie tablicy Data.baseTownsArray.
    //  Tablica zawiera String zawierający nazwę miasta oraz dwie klasy bohatera związane z tym miastem oddzielone przecinkami.
    //  Korzystając z funkcji split() oraz stałej DATA_SEPARATOR utwórz listę obiektów klasy efs.task.collections.entities.Town.
    //  Funkcja zwraca listę obiektów typu Town ze wszystkimi dziewięcioma podstawowymi miastami.
    public List<Town> getTownsList() {
        List<Town> TownsList = new ArrayList<>();
        for (String townData : Data.baseTownsArray) {
            String[] townDataSplit = townData.split(DATA_SEPARATOR);
            Town town = new Town(townDataSplit[0].trim(), Arrays.asList(townDataSplit[1].trim(), townDataSplit[2].trim()));
            TownsList.add(town);
        }
        return TownsList;
    }

    //TODO Analogicznie do getTownsList utwórz listę miast na podstawie tablicy Data.DLCTownsArray
    public List<Town> getDLCTownsList() {
        List<Town> TownsList = new ArrayList<>();
        for (String townData : Data.dlcTownsArray) {
            String[] townDataSplit = townData.split(DATA_SEPARATOR);
            Town town = new Town(townDataSplit[0].trim(), Arrays.asList(townDataSplit[1].trim(), townDataSplit[2].trim()));
            TownsList.add(town);
        }
        return TownsList;
    }

    //TODO Na podstawie tablicy Data.baseCharactersArray utworzyć listę bohaterów dostępnych w grze.
    // Tablica Data.baseCharactersArray zawiera oddzielone przecinkiem imie bohatera, klasę bohatera.
    // Korzystając z funkcji split() oraz DATA_SEPARATOR utwórz listę unikalnych obiektów efs.task.collections.entities.Hero.
    // UWAGA w Data.baseCharactersArray niektórzy bohaterowie powtarzają się, do porównania bohaterów używamy zarówno imie jak i jego klasę;
    public Set<Hero> getHeroesSet() {
        Set<Hero> heroesSet = new HashSet<>();
        for (String characterData : Data.baseCharactersArray) {
            String[] characterDataSplit = characterData.split(DATA_SEPARATOR);
            Hero hero = new Hero(characterDataSplit[0].trim(), characterDataSplit[1].trim());
            heroesSet.add(hero);
        }
        return heroesSet;
    }

    //TODO Analogicznie do getHeroesSet utwórz listę bohaterów na podstawie tablicy Data.DLCCharactersArray
    public Set<Hero> getDLCHeroesSet() {
        Set<Hero> heroesSet = new HashSet<>();
        for (String characterData : Data.dlcCharactersArray) {
            String[] characterDataSplit = characterData.split(DATA_SEPARATOR);
            Hero hero = new Hero(characterDataSplit[0].trim(), characterDataSplit[1].trim());
            heroesSet.add(hero);
        }
        return heroesSet;
    }
}
