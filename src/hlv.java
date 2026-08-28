import java.io.IOException;

public class hlv extends avm<int[]> {
   private static final alk a = alk.b("textures/colormap/dry_foliage.png");

   protected int[] a(avh $$0, brd $$1) {
      try {
         return hlz.a($$0, a);
      } catch (IOException var4) {
         throw new IllegalStateException("Failed to load dry foliage color texture", var4);
      }
   }

   protected void a(int[] $$0, avh $$1, brd $$2) {
      djn.a($$0);
   }
}
