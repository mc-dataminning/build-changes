import java.io.IOException;

public class gjw extends ast<int[]> {
   private static final ajh a = new ajh("textures/colormap/grass.png");

   protected int[] a(aso $$0, bjr $$1) {
      try {
         return gjy.a($$0, a);
      } catch (IOException var4) {
         throw new IllegalStateException("Failed to load grass color texture", var4);
      }
   }

   protected void a(int[] $$0, aso $$1, bjr $$2) {
      cwz.a($$0);
   }
}
