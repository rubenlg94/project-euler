package problems;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Problem54 {

    public static String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "T", "Q", "K", "A"};

    public static String[] suits = {"H", "S", "C", "D"};

    public static void pokerHands(){

    }

    public static boolean hasRoyalFlush(String hand){
        String[] cards = hand.split(" ");
        List<String> values = new ArrayList<>();
        List<String> suits = new ArrayList<>();
        for(String card : cards) {
            values.add(card.substring(0, 1));
            suits.add(card.substring(1));
        }
        return false;
    }


    public static boolean hasRoyalFlush(List<String> values, List<String> suits){
        if(values.contains("10") && values.contains("J") && values.contains("Q") && values.contains("K") && values.contains("A") && suits.stream().distinct().count() == 1){
            return true;
        }
        return false;
    }

    public static boolean hasStraightFlush(List<String> values, List<String> suits){
        return hasStraight(values, suits) && suits.stream().distinct().count() == 1;
    }

    public static boolean hasFourOfAKind(List<String> values, List<String> suits){
        for(String value:values){
            if(values.stream().filter(s -> s.equals(value)).count() == 4){
                return true;
            }
        }
        return false;
    }

    public static boolean hasFullHouse(List<String> values, List<String> suits){
        List<String> distinctValues = values.stream().distinct().collect(Collectors.toList());
        if(distinctValues.size() == 2){
            if(values.stream().filter(s -> s.equals(distinctValues.get(0))).count() == 2){
                if(values.stream().filter(s -> s.equals(distinctValues.get(1))).count() == 3){
                    return true;
                }
            }
            if(values.stream().filter(s -> s.equals(distinctValues.get(0))).count() == 3){
                if(values.stream().filter(s -> s.equals(distinctValues.get(1))).count() == 2){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean hasFlush(List<String> values, List<String> suits){
        return suits.stream().distinct().count() == 1;
    }

    public static boolean hasStraight(List<String> values, List<String> suits){
        int consecutive = 0;
        boolean startCounting = false;
        for(String value:Problem54.values){
            if(values.contains(value)){
                startCounting = true;
                consecutive++;
            }
            else {
                if(startCounting){
                    break;
                }
            }
        }
        return consecutive == 5;
    }

//    public static boolean hasThreeOfAKind(List<String> values, List<String> suits)

}
