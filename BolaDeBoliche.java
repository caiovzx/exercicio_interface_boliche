public class BolaDeBoliche extends Bola {
    public BolaDeBoliche(String nomeDaMarca){
        super(nomeDaMarca);
    } 
    public void lancar(){
        System.out.println("Bolas de Boliche Da Marca "+ getNomeDaMarca() + "Sao boas para lançar.");
    }
    public void quicar(){
        System.out.println("Bolas Nao quicam muito.");
    }
}
