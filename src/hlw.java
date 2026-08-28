import java.io.IOException;

public class hlw extends avm<int[]> {
   private static final alk a = alk.b("textures/colormap/foliage.png");

   protected int[] a(avh $$0, brd $$1) {
      try {
         return hlz.a($$0, a);
      } catch (IOException var4) {
         throw new IllegalStateException("Failed to load foliage color texture", var4);
      }
   }

   protected void a(int[] $$0, avh $$1, brd $$2) {
      dju.a($$0);
   }
}
