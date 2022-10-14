public class Edges {
    private Node start;
    private Node end;
    public Edges(Node starts, Node ends){
        start = starts;
        end = ends;
    }
    public String toString(){
        return(start + " connects " + end);
    }
}
