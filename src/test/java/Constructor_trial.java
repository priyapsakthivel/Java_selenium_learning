public class Constructor_trial {
    public static void main (String[]args){
        Constructor_trial oops_concepts= new Constructor_trial();
        Constructor_trial paraInt= new Constructor_trial(1);
        Constructor_trial paraString= new Constructor_trial("a");
        Constructor_trial paraStrings= new Constructor_trial("ewq","trew");

    }
    public Constructor_trial(){
        System.out.println("constructor 1");
    }
    public Constructor_trial(int a){
        System.out.println("constructor  with int ");
    }
    public Constructor_trial(String b){
        System.out.println("constructor 1 string");
    }
    public Constructor_trial(String a,String c){
        System.out.println("constructor 2 string");
    }
}

