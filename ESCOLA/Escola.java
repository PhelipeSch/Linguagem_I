public class Escola {
    public static void main(String[] args) {
        Aluno Riciery = new Aluno("010", "Riciery", 2007, 7, 22, 9.5, 9.4);
        Aluno Tiago = new Aluno("020", "Tiago", 2009, 8, 5, 7.0, 6.5);
        Aluno Erika = new Aluno("030", "Erika", 2010, 9, 9, 8.5, 9.6);
        
        Riciery.write();
        Tiago.write();
        Erika.write();
    }
    
}