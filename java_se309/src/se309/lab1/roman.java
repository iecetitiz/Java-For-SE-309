package se309.lab1;

public class roman {
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public roman(String romanNumber){
        try {
            convert(romanNumber);
        } catch (romanException e) {
            System.out.println("You have entered inappropriate value! number set to I...");
            number = 1;
            e.printStackTrace();
        }
    }

    public void add(roman n){
        number = (number + n.getNumber())%10;
    }

    public void increment(){
        number++;
        if(number>10){
            number = number%10;
        }
    }

    public void decrement(){
        number--;
        if(number<0){
            number = 1;
        }
    }

    public void convert(String x) throws romanException {
        switch(x){
            case "I": number = 1; break;
            case "II": number = 2; break;
            case "III": number = 3; break;
            case "IV": number = 4; break;
            case "V": number = 5; break;
            case "VI": number = 6; break;
            case "VII": number = 7; break;
            case "VIII": number = 8; break;
            case "IX": number = 9; break;
            case "X": number = 10; break;
            default: number = -1;
        }
        if(number==-1){throw new romanException();}
    }

    public String toString(){
        String temp;
        switch(number){
            case 1: temp = "I"; break;
            case 2: temp = "II"; break;
            case 3: temp = "III"; break;
            case 4: temp = "IV"; break;
            case 5: temp = "V"; break;
            case 6: temp = "VI"; break;
            case 7: temp = "VII"; break;
            case 8: temp = "VIII"; break;
            case 9: temp = "IX"; break;
            case 10: temp = "X"; break;
            default: temp = "Unknown";
        }
        return String.format(temp);
    }
}
