package homeWork10.ticTacToe;

public class FieldLayout {


    char []gamelLayout={'\u0000','\u0000','\u0000','\u0000','\u0000','\u0000','\u0000','\u0000','\u0000'};
   // int [] availibleNumbers={1,2,3,4,5,6,7,8,9};


    public FieldLayout() {
    }

    public void printLayout(){
        System.out.println("\t"+gamelLayout[0]+"\t"+"|"+"\t"+gamelLayout[1]+"\t"+"|"+"\t"+gamelLayout[2]);
        System.out.println("\t-----------------");
        System.out.println("\t"+gamelLayout[3]+"\t"+"|"+"\t"+gamelLayout[4]+"\t"+"|"+"\t"+gamelLayout[5]);
        System.out.println("\t-----------------");
        System.out.println("\t"+gamelLayout[6]+"\t"+"|"+"\t"+gamelLayout[7]+"\t"+"|"+"\t"+gamelLayout[8]);


    }
}
