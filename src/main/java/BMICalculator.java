public class BMICalculator {

    private String firstname;
    private String lastname;
    private int bodyHeight;
    private double bodyWeight;
    private char gender;

    public BMICalculator(String firstname, String lastname, int bodyHeight, double bodyWeight, char gender) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.bodyHeight = bodyHeight;
        this.bodyWeight = bodyWeight;
        this.gender = gender;
    }

    public double calculateBMI()
    {
        double bmi = 0;

        bmi = (bodyWeight / (((double) bodyHeight /100)*((double) bodyHeight /100)));

        return Math.round(bmi)/100.00;
    }

    public int calculateBMICategory()
    {
        double bmi = calculateBMI();
        int kategorie = 0;

        if(gender=='m')
        {
            if(bmi<16)  { kategorie=-2;}
                else if (bmi >=16 && bmi <=18.4) { kategorie=-1; }
            else if (bmi >=18.5 && bmi <=24.9) { kategorie=0; }
            else if (bmi >=25 && bmi <=34.9) { kategorie=1; }
            else if (bmi >= 35) { kategorie=2; }
        } else if (gender=='w') {
            if(bmi<15)  { kategorie=-2;}
            else if (bmi >=15 && bmi <=17.4) { kategorie=-1; }
            else if (bmi >=17.5 && bmi <=23.9) { kategorie=0; }
            else if (bmi >=24.0 && bmi <=33.9) { kategorie=1; }
            else if (bmi >= 34) { kategorie=2; }
        }
        return kategorie;
    }

    public String getBMICategoryName()
    {
        int kategorie = calculateBMICategory();
        String katName = "";
        switch(kategorie)
        {
            case -2:
                katName="Sehr starkes Untergewicht";
                break;
            case -1:
                katName="Untergewicht";
                break;
            case 0:
                katName="Normalgewicht";
                break;
            case 1:
                katName="";
                break;
            case 2:
                katName="Sehr starkes Übergewicht";
                break;
        }

        return "nicht kategorisiert";
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getBodyHeight() {
        return bodyHeight;
    }

    public void setBodyHeight(int bodyHeight) {
        this.bodyHeight = bodyHeight;
    }

    public double getBodyWeight() {
        return bodyWeight;
    }

    public void setBodyWeight(double bodyWeight) {
        this.bodyWeight = bodyWeight;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
