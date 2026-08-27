import java.io.IOException;

public class gcp extends apm<int[]> {
   private static final agi a = new agi("textures/colormap/grass.png");

   protected int[] a(aph $$0, bfo $$1) {
      try {
         return gcr.a($$0, a);
      } catch (IOException var4) {
         throw new IllegalStateException("Failed to load grass color texture", var4);
      }
   }

   protected void a(int[] $$0, aph $$1, bfo $$2) {
      cry.a($$0);
   }
}
