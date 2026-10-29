import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class space here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Space extends World
{
    private int pontuacao = 0;
    /**
     * Constructor for objects of class space.
     * 
     */
    public Space()
    {    
        super(600, 600, 1); 
        prepararCenario();
    }
    private void prepararCenario(){
        addObject(new Nave(),300,540);
        
        for (int linha = 0; linha <3; linha ++){
            for(int coluna = 0 ; coluna < 6; coluna++){
                int x = 100 + (coluna * 80);
                int y = 60 + (linha * 50);
                
                addObject(new Alien(), x, y);
            }
        }
        atualizarPlacar();
    }
    
    public void aumentarPontuacao(int pontos){
        pontuacao += pontos;
        atualizarPlacar();
    }
    
    public void atualizarPlacar(){
        showText("Pontos:" + pontuacao,80, 25);
    }
    
    public void atualizarVida(){
        showText("Vidas:" + pontuacao,520, 25);
    }
    
    public void gameOver(){
        showText("Você morreu kkkkk babaca, banana!!!" + 300,300);
        Greenfoot.stop();
    }
    
    public void verificarVitoria(){
        if(getObjects(Alien.class).isEmpty()){
            showText("Vocẽ ganhouuuuu!!",300,300);
            Greenfoot.stop();
        }
    }
}
