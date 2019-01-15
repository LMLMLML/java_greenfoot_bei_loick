import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Rover extends Actor
{
private Display anzeige;
private int  Anzahl_an_gefahrenden_Feldern =0;
private double energy=100;
   
    
public void act() 
    {
    }
    
























/**
     * Der Rover bewegt sich ein Feld in Fahrtrichtung weiter.
     * Sollte sich in Fahrtrichtung ein Objekt der Klasse Huegel befinden oder er sich an der Grenze der Welt befinden,
     * dann erscheint eine entsprechende Meldung auf dem Display.
     */
     
public void fahre()
   { if (energy >=2) {
        int posX = getX();
        int posY = getY();

        if(huegelVorhanden("vorne"))
        {
            nachricht("Es geht nicht weiter!! ");
        }
        else if(getRotation()==270 && getY()==1)
        {
            nachricht("Ich kann mich nicht bewegen.");
        }
        else
        {
            move(1);
         Anzahl_an_gefahrenden_Feldern++;
           System.out.println("Bewegung hat stattgefunden.");
            System.out.println("X Position: "+posX);
            System.out.println("Y Position: " +posY);
            System.out.println("Anzahl an gefahrenen Feldern " + Anzahl_an_gefahrenden_Feldern);
            Greenfoot.delay(1);
            energy--;
        if(energy <= 10) {
                nachricht("Low battery power");
            }   
        }   

        if(posX==getX()&&posY==getY()&&!huegelVorhanden("vorne"))
        {
            nachricht("Ich kann mich nicht bewegen");
        }
    }
    else
    {nachricht("No action due to unsufficient battery power!");
}
}
























/**
 * Dieser Befehl lädt die Energie auf!
 **/

public void chargingStation() {
    double x;
    x=100-energy;
    if(energy>=100) { 
        nachricht("no charging");
    }        
    else
    {        
    energy=energy+x;nachricht("fully charged");
    }
        
}    































/**
*Dieser Befehl reduziert die Akkuleistung energy auf 12!
**/
public void reducebatterypower(){double z; z= energy-12; energy=energy-z;} 




























/**
*Dieser Befehl öffnet ein Eingabefenster, bei dem man eingeben kann, um wie viele Einheiten man den Akku aufladen will(auch Kommazahlen).
*Es geht nur bis maximal 100 
*/

public double gasStation(double pAmount) {
    if(energy < 100) {
    energy=energy+pAmount;
    nachricht("Battery has been charged successfully");
    return pAmount;
    }
    return pAmount;
}    
























           
/**
     * Der Rover dreht sich um 90 Grad in die Richtung, die mit richtung (Ã¢â‚¬Å¾linksÃ¢â‚¬Å“ oder Ã¢â‚¬Å¾rechtsÃ¢â‚¬Å“) ÃƒÂ¼bergeben wurde.
     * Sollte ein anderer Text (String) als "rechts" oder "links" ÃƒÂ¼bergeben werden, dann erscheint eine entsprechende Meldung auf dem Display.
     */
    public void drehe(String richtung)
    {if (energy >=2) {
        if(energy <= 10) {
                nachricht("Low battery power");
            }   
        if(richtung=="rechts")
        {
            setRotation(getRotation()+90);
            energy=energy-0.5;
        }
        else if (richtung=="links")
        {
            setRotation(getRotation()-90);
            energy=energy-0.5;
        }
        else
        {
            nachricht("Befehl nicht korrekt!");
        }
    }
}
    }
    























/**
*Dieses Programm ist nur dafür gedacht, den Akku lehrzubekommen. Der Rover fährt zehn mal hin und her
**/


    public void z() { for (int a=0; a <=10; a++) {fahre(); fahre(); fahre(); fahre(); fahre(); fahre();drehe("rechts");drehe("rechts");}}
   
    {
        aufgabe3();
    } 

























    
   /**
     * Dieser Algorithmus funktioniert nur mit der exakten Abbildung aus dem Buch! (siehe S.50)
     */
    
    public void aufgabe3() { // Seite 50, Aufgabe 3b,c; a im Heft
        int x=0;
        
        while(!markeVorhanden()) { // Teilaufgabe B
                fahre();
            if(gesteinVorhanden()) {
                if((huegelVorhanden("links")) || (huegelVorhanden("rechts"))) {                
                    analysiereGestein();
                }    
            }
        x++;    
        }
        
        if(markeVorhanden()) { // Teilaufgabe C
            setRotation(getRotation()+180);
            for(int y=x;y>0;y--) {
                fahre();
            }
            setRotation(getRotation()+180);
        }                   
    }
    
    /**
 * 
 */



















/**
*Dieser Befehl fährt viermal und gibt die Nachricht Jürgen Pfeiffer aus!
**/

public void zaehlschleifen()
{ for (int i = 0; i < 4; i++) {
    fahre();
    nachricht("Jürgen Pfeiffer");
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  /**
* Dieses Programm gibt unendlich lange den Buchstaben i untereinander aus. Es öffnet sich ein Fenster. Solange, bis der Computer abstürtzt
**/
}
}
public void computerabsturz() {
for (int i = 0; i < 10; i--)
System.out.println(i);
}






































/**
*Dieses Programm gibt in einem neuen Fenster 1 Millionen Mal den Buchstaben r untereinander aus. Bis der Computer abstürzt. Nicht machen!
**/

public void computerabturzmitlimit(){
    for (int i = 0; i >-1000000; i--)
    { 
        System.out.println("rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr");
    }
}

























 /**
 * Dieses Programm fährt solange keine Marke vorhanden ist. Wenn rechts Hügel vorhanden dann rechts drehen und fahren!
 */    
    public void macheaufgabe(){
 while(!markeVorhanden()) {
 fahre();
 if(!huegelVorhanden("rechts")) {
 drehe("rechts");
  fahre();
}
}}

























/**
*Dieses Programm soll ein Feld, das rechts und links abgegrenzt ist und nach oben und unten nicht, befahren, und
*zwar jedes einzelne Kästchen. Das funktioniert. Eigentlich soll das Programm auch Hindernisse innerhalb des Feldes abfahren;
*funktioniert aber nicht
*//

public void abc() {
drehe("links");setzeMarke();int a=0;

while(huegelVorhanden("links")){fahre();setzeMarke();a++;}

entferneMarke();drehe("rechts");drehe("rechts");fahre();drehe("links");int b=0;

while(!huegelVorhanden("vorne")){fahre();setzeMarke();b++;}

int d=0;drehe("rechts");
System.out.println(a);

for(int g=1; g<a;g++){fahre();setzeMarke();}

drehe("rechts"); drehe("rechts");

for(int g=1; g<a;g++){fahre();}

drehe("rechts");


for (int c =1;c<a;c++){
    
if ((c%2) == 0) { drehe("links"); fahre(); setzeMarke(); drehe("links");}
else {drehe("rechts"); fahre(); setzeMarke(); drehe("rechts");}

for(int x=0; x<b; x++){fahre();setzeMarke();d++;}

int e= ((d/c)-1);

if((huegelVorhanden("vorne")) &&(e<b) && (!markeVorhanden())) { drehe("rechts"); fahre(); drehe("rechts"); fahre(); drehe("links");}
}}





























/**
*Bei diesem Programm kann man in einem Fenster einen Namen eingeben und das Programm gibt einen in einem neuen Fenster eine tolle Nachricht aus
**/
 public void woitkowski(String name) {
    System.out.println("Hallo, " + name + ". Ich hoffe es geht dir gut. Sag mal bald dein Alter."
}


                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
         
                       
                       
                       
                       
                       
                       

    /**
     * Fahre durch das Labyrinth
     */          
    
    public void radtkew() { // S.59 Aufg. 3
        while(true) {    
        if((huegelVorhanden("vorne")) && (huegelVorhanden("rechts"))) {
            drehe("links");
        }
        if((huegelVorhanden("vorne")) && (huegelVorhanden("links"))) {
            drehe("rechts");
        }
        if(gesteinVorhanden()) {
            analysiereGestein();
        }    
        fahre();  
        nachricht("Jürgen Pfeiffer ist der Heilland aus Rostock");
    } 
}    
  
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
              
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
    
    public void burnOut() {
        setRotation(getRotation()+180);
    }
        
    /**
     * Der Rover dreht sich um 90 Grad in die Richtung, die mit richtung (â€žlinksâ€œ oder â€žrechtsâ€œ) Ã¼bergeben wurde.
     * Sollte ein anderer Text (String) als "rechts" oder "links" Ã¼bergeben werden, dann erscheint eine entsprechende Meldung auf dem Display.
     */
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
               
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
    public void drehe(String richtung)
    {
        if(richtung=="rechts")
        {
            setRotation(getRotation()+90);
        }
        else if (richtung=="links")
        {
            setRotation(getRotation()-90);
        }
        else
        {
            nachricht("Befehl nicht korrekt!");
        }
    }

                       
                       
                       
                       
                       
                       
                       
                       
           
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
    /** 
     * Fahre endlos lange im Quadrat, bis das Programm geschlossen wird.
     */
    public void quadratTour() {
        int x; 
        x=1;
        while (x <= 100) {
        
        move(4);
        Greenfoot.delay(1);
        drehe("rechts");
        move(4);
        Greenfoot.delay(1);
        drehe("rechts");
        move(4);
        Greenfoot.delay(1);
        drehe("rechts");
        move(4);
        Greenfoot.delay(1);
        drehe("rechts");
    }
}
                       
                       
                       
                       
                       
                       
                       
                       
                       
          
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
    /**
     * Umfahre einen Hügel, wenn vorhanden.
     */
    public void umfahreHügel() {   
    
    if(huegelVorhanden("vorne"))
    { 
        drehe("rechts");
        Greenfoot.delay(1);
        move(1);
        Greenfoot.delay(1);
        drehe("links");
        Greenfoot.delay(1);
        move(2);
        Greenfoot.delay(1);
        drehe("links");
        Greenfoot.delay(1);
        move(1);
        drehe("rechts");
    }
    else
        nachricht("Hier ist kein Hügel!");
    }
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       

    /**
     * Dieses Programm umfährt automatisch ein Qadrat
     */
    public void umkreiseObjekt() {
        int z;
        z=5;
        while(z <= 100) {
  
        while(huegelVorhanden("rechts"))
       
        move(1);
        Greenfoot.delay(1);
        drehe("rechts");
        move(1);
        }
    }

                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                      
    /**
     * Fahre vorwärts, wenn ein Hügel vorhanden ist.
     */
    public void quadratHügelTour() {

        int loop;
        loop=1;
        while(loop <= 100) {
        
        // Fahrtrichtung Links
            if (huegelVorhanden("links")) 
                do {
                    fahre();
                    nachricht("IMPEACH TRUMP!");
                } while(huegelVorhanden("links"));
            else {
                drehe("rechts"); // Hat Greenfoot eine Rechts/Links Schwäche?
                fahre();
            }
        
        // Fahrtrichtung Rechts
            if (huegelVorhanden("rechts"))
                do {
                    fahre();
                    nachricht("IMPEACH TRUMP!");
                } while(huegelVorhanden("rechts"));
            else {
                drehe("links"); // Hat Greenfoot eine Rechts/Links Schwäche?
                fahre();            
            }
    }
}
    
    /**
     * Fahre eine Spirale
     */                     
                       
    public void Spirale() {
        for(int y=0;y<40;y++) {
            for(int x=0;x<y;x++) {
                setzeMarke();
                fahre();
                nachricht("IMPEACH TRUMP!");
            }
        drehe("rechts");
    }
}
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
             
    /**
     * Der Rover gibt durch einen Wahrheitswert (true oder false )zurÃ¼ck, ob sich auf seiner Position ein Objekt der Klasse Gestein befindet.
     * Eine entsprechende Meldung erscheint auch auf dem Display.
     */
                       
    public boolean gesteinVorhanden()
    {
        if(getOneIntersectingObject(Gestein.class)!=null)
        {
            nachricht("Gestein gefunden!");
            return true;

        }

        return false;
    }

                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
    /**
     * Der Rover Ã¼berprÃ¼ft, ob sich in richtung ("rechts", "links", oder "vorne") ein Objekt der Klasse Huegel befindet.
     * Das Ergebnis wird auf dem Display angezeigt.
     * Sollte ein anderer Text (String) als "rechts", "links" oder "vorne" Ã¼bergeben werden, dann erscheint eine entsprechende Meldung auf dem Display.
     */
                       
                 
                       
    public boolean huegelVorhanden(String richtung)
    {
        int rot = getRotation();

        if (richtung=="vorne" && rot==0 || richtung=="rechts" && rot==270 || richtung=="links" && rot==90)
        {
            if(getOneObjectAtOffset(1,0,Huegel.class)!=null && ((Huegel)getOneObjectAtOffset(1,0,Huegel.class)).getSteigung() >30)
            {
                return true;
            }
        }

        if (richtung=="vorne" && rot==180 || richtung=="rechts" && rot==90 || richtung=="links" && rot==270)
        {
            if(getOneObjectAtOffset(-1,0,Huegel.class)!=null && ((Huegel)getOneObjectAtOffset(-1,0,Huegel.class)).getSteigung() >30)
            {
                return true;
            }
        }

        if (richtung=="vorne" && rot==90 || richtung=="rechts" && rot==0 || richtung=="links" && rot==180)
        {
            if(getOneObjectAtOffset(0,1,Huegel.class)!=null && ((Huegel)getOneObjectAtOffset(0,1,Huegel.class)).getSteigung() >30)
            {
                return true;
            }

        }

        if (richtung=="vorne" && rot==270 || richtung=="rechts" && rot==180 || richtung=="links" && rot==0)
        {
            if(getOneObjectAtOffset(0,-1,Huegel.class)!=null && ((Huegel)getOneObjectAtOffset(0,-1,Huegel.class)).getSteigung() >30)
            {
                return true;
            }

        }

        if(richtung!="vorne" && richtung!="links" && richtung!="rechts")
        {
            nachricht("Befehl nicht korrekt!");
        }

        return false;
    }
    
/**
    * Dieses Programm gibt es nur um Arrays zu testen. Mit der Zahlenliste wird diverses gemacht
    */
                  
   public void ichtestearrays(String zahlliste) {
       int juergen[] =  {1,2,3,4,5,6,7,8,9,10};
       if((zahlliste=="1") || (zahlliste=="eins"))
       {
           System.out.println(juergen[0]);
        }
        if((zahlliste=="2") || (zahlliste=="zwei"))
       {
           System.out.println(juergen[1]);
        }
       if((zahlliste=="3") || (zahlliste=="drei"))
       {
           System.out.println(juergen[2]);
        }
        if((zahlliste=="4") || (zahlliste=="vier"))
       {
           System.out.println(juergen[3]);
        }
       System.out.println("Du bist " + juergen[5] + " Jahre alt.");
       System.out.println("AMERICA");
    }
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
    /**
    * Dieses Programm gibt es nur um Arrays zu testen
    *
    */
                     
                       
   public void ichtestearrays(int alter) {
       int juergen[] =  {1,2,3,4,5,6,7,8,9,10};
       if(alter ==1)
       {
           System.out.println(juergen[0]);
       
        }
        if(alter==2) 
       {
           System.out.println(juergen[1]);
        }
     if(alter==3) 
       {
           System.out.println(juergen[2]);
        }
        if(alter==4) 
       {
           System.out.println(juergen[3]);
        }
       System.out.println("Du bist " + juergen[5] + " Jahre alt.");
       System.out.println("AMERICA");
    }
    
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
    
    /**
 * Seite 59 NR2 c
 */   
public void aufgabeseite59(){
    while(!markeVorhanden()){
        if((huegelVorhanden("rechts") && (huegelVorhanden("links") && (!gesteinVorhanden()))))
        {setzeMarke();
           fahre();
        }
        else
        {fahre();
        }}}
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
    /**
  * Dieses Programm umfährt das Qadrat, bis die Marke vorhanden ist
  */
 public void macheaufgabe(){
 while(!markeVorhanden()) {
 fahre();
 if(!huegelVorhanden("rechts")) {
 drehe("rechts");
  fahre();
}
 
}
}
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
    /**
     * Der Rover ermittelt den Wassergehalt des Gesteins auf seiner Position und gibt diesen auf dem Display aus.
     * Sollte kein Objekt der Klasse Gestein vorhanden sein, dann erscheint eine entsprechende Meldung auf dem Display.
     */
                       
                   
                       
    public void analysiereGestein()
    {
        if(gesteinVorhanden())
        {
            nachricht("Gestein untersucht! Wassergehalt ist " + ((Gestein)getOneIntersectingObject(Gestein.class)).getWassergehalt()+"%.");
            Greenfoot.delay(1);
            removeTouching(Gestein.class);
        }
        else 
        {
            nachricht("Hier ist kein Gestein");
        }
    }

    /**
     * Der Rover erzeugt ein Objekt der Klasse â€žMarkierungâ€œ auf seiner Position.
     */
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
    public void setzeMarke()
    {
        getWorld().addObject(new Marke(), getX(), getY());
    }

    /**
     * *Der Rover gibt durch einen Wahrheitswert (true oder false )zurÃ¼ck, ob sich auf seiner Position ein Objekt der Marke befindet.
     * Eine entsprechende Meldung erscheint auch auf dem Display.
     */
    public boolean markeVorhanden()
    {
        if(getOneIntersectingObject(Marke.class)!=null)
        {
            return true;
        }

        return false;
    }

                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
    public void entferneMarke()
    {
        if(markeVorhanden())
        {
            removeTouching(Marke.class);
        }
    }

                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
    private void nachricht(String pText)
    {
        if(anzeige!=null)
        {
            anzeige.anzeigen(pText);
            Greenfoot.delay(1);
            anzeige.loeschen();
        }
    }

                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
    private void displayAusschalten()
    {
        getWorld().removeObject(anzeige);

    }

                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
    protected void addedToWorld(World world)
    {

        setImage("images/rover.png");
        world = getWorld();
        anzeige = new Display();
        anzeige.setImage("images/nachricht.png");
        world.addObject(anzeige, 7, 0);
        if(getY()==0)
        {
            setLocation(getX(),1);
        }
        anzeige.anzeigen("Ich bin unnötig");
    }

    class Display extends Actor
    {
        GreenfootImage bild; 

        public Display()
        {
          bild = getImage();
        }

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        public void act() 
        {

        }  
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

        public void anzeigen(String pText)
        {
           loeschen();
           getImage().drawImage(new GreenfootImage(pText, 25, Color.BLACK, new Color(0, 0, 0, 0)),10,10);

        }

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        public void loeschen()
        {
            getImage().clear();
            setImage("images/nachricht.png");
        }

    }
}
