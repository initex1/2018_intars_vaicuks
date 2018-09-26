package homeWork10.ticTacToe;

public class FieldLayout {


    char [] gameLayout ={'\u0000','\u0000','\u0000','\u0000','\u0000','\u0000','\u0000','\u0000','\u0000'};
   // int [] availibleNumbers={1,2,3,4,5,6,7,8,9};


    public FieldLayout() {
    }

    public void printLayout(){
        System.out.println("\t"+ gameLayout[0]+"\t"+"|"+"\t"+ gameLayout[1]+"\t"+"|"+"\t"+ gameLayout[2]);
        System.out.println("\t-----------------");
        System.out.println("\t"+ gameLayout[3]+"\t"+"|"+"\t"+ gameLayout[4]+"\t"+"|"+"\t"+ gameLayout[5]);
        System.out.println("\t-----------------");
        System.out.println("\t"+ gameLayout[6]+"\t"+"|"+"\t"+ gameLayout[7]+"\t"+"|"+"\t"+ gameLayout[8]);


    }
}
