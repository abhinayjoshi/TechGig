public class Competitors {
    String name;
    int allies;

    public Competitors getCompetitorsByName(){
        Competitors comp = new Competitors();
        comp.name = this.name;
        comp.allies = this.allies;
        return comp;
    }
}
