import java.io.IOException;

public class gjt extends ast<int[]> {
   private static final ajh a = new ajh("textures/colormap/grass.png");

   protected int[] a(aso $$0, bjq $$1) {
      try {
         return gjv.a($$0, a);
      } catch (IOException var4) {
         throw new IllegalStateException("Failed to load grass color texture", var4);
      }
   }

   protected void a(int[] $$0, aso $$1, bjq $$2) {
      cwx.a($$0);
   }
}
