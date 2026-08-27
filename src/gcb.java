import java.io.IOException;

public class gcb extends api<int[]> {
   private static final agg a = new agg("textures/colormap/foliage.png");

   protected int[] a(apd $$0, bfh $$1) {
      try {
         return gce.a($$0, a);
      } catch (IOException var4) {
         throw new IllegalStateException("Failed to load foliage color texture", var4);
      }
   }

   protected void a(int[] $$0, apd $$1, bfh $$2) {
      crm.a($$0);
   }
}
