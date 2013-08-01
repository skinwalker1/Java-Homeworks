
package pkgclass.to.hold.objects;


public class AnimalList {
    private Animal[] thelist = new Animal[10];
    private int i = 1;
    
    public void add(Animal a){
        if(i < thelist.length){
            thelist[i]=a;
            System.out.println("Animal added at index " + i);
            i++;
        }
    }
}

