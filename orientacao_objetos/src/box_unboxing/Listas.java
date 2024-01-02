package box_unboxing;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Listas {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Matheus");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");

        // inserir entre

        list.add(2, "Marco");
        System.out.println(list.size());

        // remover
        // list.remove("Anna");
        // list.removeIf(x -> x.charAt(0) == 'M');

        // achar
        System.out.println("Achando o bob:" + list.indexOf("Bob"));
        // se nao achar ele retorna -1

        // retornar apenas com quem tem m. filter

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

        for (String string : result) {
            System.out.println(string);
        }
        for (String string : list) {
            System.out.println(string);
        }

        System.out.println("----------------------------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);
    }
}
