public class Cachorro extends Animal {
   
    public Cachorro(String nome){
        super(nome);
    }


    @Override
    public void fazerSom(){
        System.out.println(getNome() + " diz: Au Au!");
    }
}

