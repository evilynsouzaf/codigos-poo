import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class alien here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alien extends Actor
{
    /**
     * Act - do whatever the alien wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        movimentar();
        verificarColisaoComNave();
    }
    
    private void movimentar(){
        setLocation(getX() + velocidade, getY());
        
        if (isAtEdge()){
            velocidade =- velocidade;
            setLocation(getX() + velocidade, getY() + 25);
        }
        
        if(getY() >= 580{
            SpaceWorld mundo = (SpaceWorld) getWorld();
            
            if(mundo != null){
                if(!mundo.getObjects(Nave.class).isEmpty()){
                    Nave nave = mundo.getObjects(Nave.class);
                    nave.receberDano();
                }
                mundo.removeobject(this);
            }
        }
        
        private void verificarColisao(){
            Actor naveColidida = getOneIntersectingObject(Nave.class);
            if(naveColididda != null){
                Nave nave = (Nave) naveColidida;
                nave.receberDano();
            }
        }
    }
}
