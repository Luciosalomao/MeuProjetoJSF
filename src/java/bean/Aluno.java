package bean;


import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Named;
import java.io.Serializable;

@Named("aluno")
@SessionScoped
public class Aluno implements Serializable {
    String nome;
    String senha;
        
    public Aluno() {
            
    }
        
    public String validar() {
        if(nome.equals("Lucio") && senha.equals("123"))
        {
            return "principal";
        }
        else {
            FacesMessage fm = new FacesMessage("Login ou senha incorreto");
            FacesContext.getCurrentInstance().addMessage("msg",fm);
            return null;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
}
