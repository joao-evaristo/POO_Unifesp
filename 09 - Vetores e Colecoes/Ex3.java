package exercicios;

/**
 *
 * @author joaoe
 */
public class Ex3 {
    private String sobreNome;
    private String nome;
    private double salarioHora;
    private int anosNaEmpresa;

    public Ex3(String sobreNome, String nome, double salarioHora, int anosNaEmpresa) {
        this.sobreNome = sobreNome;
        this.nome = nome;
        this.salarioHora = salarioHora;
        this.anosNaEmpresa = anosNaEmpresa;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(double salarioHora) {
        this.salarioHora = salarioHora;
    }

    public int getAnosNaEmpresa() {
        return anosNaEmpresa;
    }

    public void setAnosNaEmpresa(int anosNaEmpresa) {
        this.anosNaEmpresa = anosNaEmpresa;
    }
    public void busca(Ex3 Ex3[], int anos){
        int i = 1;
        for (Ex3 funcionario : Ex3){
            if(funcionario.getAnosNaEmpresa() >= anos){
                System.out.println("Funcionario "+i+": "+funcionario.getNome()+" "+funcionario.getSobreNome()+" recebe "+funcionario.getSalarioHora()+" por hora e está a "+funcionario.getAnosNaEmpresa()+" anos na empresa");
            }
            i++;
        }
        System.out.println("\n");
    }
    public static void main(String[] args) {
        Ex3 f1 = new Ex3("Tavares", "Alex", 2, 4);
        Ex3 f2 = new Ex3("Costa", "Fernando", 2, 1);
        Ex3 f3 = new Ex3("Silva", "Felipe", 2, 1);
        Ex3 f4 = new Ex3("Evaristo", "João Pedro", 10, 9);

        Ex3[] vet = {f1,f2,f3, f4};
        f1.busca(vet, 1);
        f1.busca(vet, 8);
    }
    
}