import java.util.ArrayList;
public class Graph {
    private ArrayList<Node> node = new ArrayList<Node>();
    private ArrayList<Edges> edge = new ArrayList<Edges>();

    public Graph(Node[] nodes, Edges[] edges){
        for(int i=0; i<nodes.length; ++i){

        node.add(nodes[i]);}

        for(int i=0; i<edges.length; ++i){

            edge.add(edges[i]);}    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("List of nodes:\n");
        for(Node i : node){
            sb.append(i + "\n");
        }
        sb.append("List of edges:\n");
        for(Edges i : edge){
            sb.append(i + "\n");
        }
        return sb.toString();
    }
    public void addEdge(int pos1, int pos2){
        if(pos2 > node.size() || pos1 >node.size()) {System.out.println("not real node");
            return;}
        Edges toadd = new Edges(node.get(pos1), node.get(pos2));
        edge.add(toadd);
    }
    public void addNode(int add){
        node.add(new Node(add));
    }
    public void addNode(Node add){
        node.add(add);
    }

}
