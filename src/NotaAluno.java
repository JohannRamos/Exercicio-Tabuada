public class NotaAluno {
    public static void main(String[] args) {
        int Nota = 3;
        if (Nota > 6){
            System.out.println(Nota + " Aprovado");
        } else {
            if (Nota >= 4){
                System.out.println(Nota + " Verificação Suplementar");
            } else {
                System.out.println(Nota + " Reprovado");
            }
        }
    }
}
