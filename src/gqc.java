import java.io.IOException;

public class gqc extends atz<int[]> {
   private static final akk a = new akk("textures/colormap/grass.png");

   protected int[] a(atu $$0, bmr $$1) {
      try {
         return gqe.a($$0, a);
      } catch (IOException var4) {
         throw new IllegalStateException("Failed to load grass color texture", var4);
      }
   }

   protected void a(int[] $$0, atu $$1, bmr $$2) {
      dcb.a($$0);
   }
}
