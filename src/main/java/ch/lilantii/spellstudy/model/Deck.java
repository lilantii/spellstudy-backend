package ch.lilantii.spellstudy.model;

import ch.lilantii.spellstudy.enums.Color;
import ch.lilantii.spellstudy.enums.DeckType;
import io.magicthegathering.javasdk.resource.Card;

import java.util.List;

public class Deck {
    private int deckId;
    private String deckName;
    private List<Color> deckColors;
    private Card commander;
    private List<Card> deckCards;
    private DeckType deckType;
}
