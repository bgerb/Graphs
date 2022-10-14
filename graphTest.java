import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class graphTest{
    @Test
    void BNode(){ // basic node test
        Node test = new Node(123);
        assertEquals("123", test.toString());


    }
    @Test
    void BEdges(){ // basic edge test
        Node test1 = new Node(123);
        Node test2 = new Node(567);
        Edges test = new Edges(test1,test2);
        assertEquals("123 connects 567", test.toString());

    }
    @Test
    void BGraph(){ // basic graph test
        Node test1 = new Node(123);
        Node test2 = new Node(567);
        Edges test = new Edges(test1, test2);
        Node[] node = new Node[] {test1,test2};
        Edges[] edge = new Edges[]{test};
        Graph fin = new Graph(node,edge);
        assertEquals("List of nodes:\n123\n567\nList of edges:\n123 connects 567\n", fin.toString());

    }
    @Test
    void ManyNodes(){
        Node test1 = new Node(1);
        Node test2 = new Node(2);
        Node test3 = new Node(3);
        Node test4 = new Node(4);
        Node test5 = new Node(5);
        Node test6 = new Node(6);
        Node test7 = new Node(7);
        Node test8 = new Node(8);
        assertEquals("12345678", test1.toString()+test2.toString()+test3.toString()+test4.toString()+test5.toString()+test6.toString()+test7.toString()+test8.toString());
    }
    @Test
    void GraphaddFakeEdge(){ // should print text
        Node test1 = new Node(123);
        Node test2 = new Node(567);
        Edges test = new Edges(test1, test2);
        Node[] node = new Node[] {test1,test2};
        Edges[] edge = new Edges[]{test};
        Graph fin = new Graph(node,edge);
        fin.addEdge(3,7);

    }
}
