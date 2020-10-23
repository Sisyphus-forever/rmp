

public class Weather {
   // private int id;

    private String main;
    private String description;
    //private String icon;

   /* public void setId(int id) {
        this.id = id;
    }*/



    public void setMain(String main) {
        this.main = main;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Weather() {
    }

    public Weather(String main, String description) {
        this.main = main;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Weather now:"
                 + main +
                "\nwith more interesting facts: "+ description;
    }
}
