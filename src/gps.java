import java.io.IOException;

public class gps extends aut<int[]> {
   private static final ale a = new ale("textures/colormap/grass.png");

   protected int[] a(auo $$0, bnh $$1) {
      try {
         return gpu.a($$0, a);
      } catch (IOException var4) {
         throw new IllegalStateException("Failed to load grass color texture", var4);
      }
   }

   protected void a(int[] $$0, auo $$1, bnh $$2) {
      dbv.a($$0);
   }
}
