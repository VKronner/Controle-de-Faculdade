package Faculdade;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Pessoa {

    private String nome;
    private String sobrenome;
    private String dataNascimento;
    private int idade;

    Pessoa(String nome, String sobrenome)
    {
        this.nome = nome;
        this.sobrenome = sobrenome;

        setDataNascimento("15/07/1994"); //TODO: Substituir por Input da Data de Nascimento, Seja String ou DataFormat.

        setIdade(getDataNascimento());
        System.out.println(nome + " " + sobrenome + " \nIdade: " + getIdade());

    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public int getIdade() {
        return idade;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setIdade(String dataNascimento) {
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate localDate = LocalDate.parse(dataNascimento, formatador);
        this.idade = Period.between(localDate, LocalDate.now()).getYears();
    }
}
