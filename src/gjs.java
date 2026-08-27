import java.io.IOException;

public class gjs extends ast<int[]> {
   private static final ajh a = new ajh("textures/colormap/foliage.png");

   protected int[] a(aso $$0, bjq $$1) {
      try {
         return gjv.a($$0, a);
      } catch (IOException var4) {
         throw new IllegalStateException("Failed to load foliage color texture", var4);
      }
   }

   protected void a(int[] $$0, aso $$1, bjq $$2) {
      cwt.a($$0);
   }
}
