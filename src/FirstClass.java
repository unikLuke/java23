public class FirstClass extends ShapeTest implements Shape {

    public String ShapeT_vertices,ShapeT_edges;
    void  printMessage(String message){
        System.out.println(message);
    }



    @Override
    public String getNumberOfEdges1() {
       return null;
    }
    @Override
    public  String getNumberOfVertices1(){

        return null;
    }

    @Override
    public int getNumberOfVertices() {
        ShapeT_vertices = "this is from ShapeTest get Number of Vertices Method()";

        return 0;
    }

    @Override
    public int getNumberOfEdges() {
        ShapeT_edges = "this in ShapeTest GetNumber method()";

        return 0;
    }


    public static void main(String[] args) {
        FirstClass firstClass = new FirstClass();
        firstClass.printMessage(firstClass.ShapeT_edges);
        System.out.println("Hello World");
        firstClass.printMessage(firstClass.ShapeT_vertices);
    }

}

