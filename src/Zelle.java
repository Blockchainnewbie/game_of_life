public class Zelle 
{   
    // Eine Zelle im Spiel des Lebens
    // Sie kann lebendig oder tot sein
    // Sie kann Nachbarn haben, die ebenfalls Zellen sind
    // Sie stirbt wenn sie weniger als 2 oder mehr als 3 lebendige Nachbarn hat
    // Sie wird lebendig wenn sie genau 3 lebendige Nachbarn hat
    // Sie bleibt lebendig wenn sie 2 oder 3 lebendige Nachbarn hat
    
    // 1. Eigenschaft
    private boolean istLebendig;
    
    // 2. Eigenschaft
    public Zelle (boolean istLebendig) 
    {
        this.istLebendig = istLebendig;
    }

    // 3. Methoden
    public char zeichneZeichen()
    {
        if (istLebendig) 
        {
            return '#'; // Lebendige Zelle
        } 
        else 
        {
            return '-'; // Tote Zelle
        }
    }


    public void naechsteGeneration(int anzahlLebendigeNachbarn) 
    {
        
        if (this.istLebendig) 
        {
            // Lebendige Zelle
            // Stirbt wenn weniger als 2 oder mehr als 3 lebendige Nachbarn
            // Bleibt lebendig wenn 2 oder 3 lebendige Nachbarn
            if (anzahlLebendigeNachbarn < 2 || anzahlLebendigeNachbarn > 3) 
            {
                this.istLebendig = false; // Zelle stirbt
            }
        } 
        else 
        {
            // Tote Zelle
            if (anzahlLebendigeNachbarn == 3) 
            {
                this.istLebendig = true; // Zelle wird lebendig
            }
        }
    }
}