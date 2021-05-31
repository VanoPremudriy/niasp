package pr141.models;

public class Card {
    String cardNumber;
    int code;

    public Card(String cardNumber, int code) {
        this.cardNumber = cardNumber;
        this.code = code;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public int getCode() {
        return code;
    }
}
