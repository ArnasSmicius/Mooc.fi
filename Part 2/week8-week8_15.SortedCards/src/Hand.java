import java.util.ArrayList;
import java.util.Collections;

public class Hand implements Comparable<Hand>{
    private ArrayList<Card> cards;

    public Hand(){
        this.cards = new ArrayList<>();
    }

    public void add(Card card){
        this.cards.add(card);
    }

    public void print(){
        for (Card card : this.cards){
            System.out.println(card);
        }
    }
    public void sort(){
        Collections.sort(cards);
    }

    public int totalHandScore(){
        int result = 0;
        for (Card card : cards){
            result += card.getValue();
        }
        return result;
    }

    public void sortAgainstSuit(){
        Collections.sort(cards, new SortAgainstSuitAndValue());
    }

    @Override
    public int compareTo(Hand hand){
        return totalHandScore() - hand.totalHandScore();
    }
}
