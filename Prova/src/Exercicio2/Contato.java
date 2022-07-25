package EstudoFérias.src.SegundoTrimestre.Prova.src.Exercicio2;

public class Contato {
    
    private int codigo;
    private String nome;
    private int telefone;
    private String email;

    public Contato() {
    }

    public Contato(int codigo, String nome, int telefone, String email) {
        this.codigo = codigo;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contato [Codigo=" + codigo + ", Email=" + email + ", Nome=" + nome + ", Telefone=" + telefone + "]";
    }

    

    

}
