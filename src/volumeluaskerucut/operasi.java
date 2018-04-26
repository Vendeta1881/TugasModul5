
package volumeluaskerucut;

public class operasi {
    public float r, t;
    
        public float perkalianvolume () {
            float perkalian;
            perkalian = r * r * t;
            return perkalian;
        }
        public float perkalianluas() {
            float perkalianl;
            perkalianl = r * (r + garispelukis());
            return perkalianl;
        }
        
        public float garispelukis() {
            float pelukis;
            pelukis = (r * r )+ (t*t);
            return pelukis;
        }
    
}
