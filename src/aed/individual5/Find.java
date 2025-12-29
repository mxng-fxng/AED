package aed.individual5;
import es.upm.aedlib.tree.Tree;
import es.upm.aedlib.Position;

public class Find {

    public static void find(String fileName, Tree<String> directory) {
        if (!directory.isEmpty()) {
            preorder(directory, directory.root(), fileName);
        }
    }

    public static void preorder(Tree<String> directory, Position<String> v, String fileName) {

        if (v.element().equals(fileName)) {
            ruta(directory, v);
        }
        
        for (Position<String> w : directory.children(v)) {
            preorder(directory, w, fileName);
        }
    }

    public static void ruta(Tree<String> directory, Position<String> v) {
        String res = v.element();
        
        while (!v.equals(directory.root())) {
            v = directory.parent(v);
            res = v.element() + "/" + res;
        }
        
        res = "/" + res;
        Printer.println(res);  
    }
}
