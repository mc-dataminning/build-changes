import java.io.IOException;

public class gff extends aqm<int[]> {
   private static final ahg a = new ahg("textures/colormap/foliage.png");

   protected int[] a(aqh $$0, bgr $$1) {
      try {
         return gfi.a($$0, a);
      } catch (IOException var4) {
         throw new IllegalStateException("Failed to load foliage color texture", var4);
      }
   }

   protected void a(int[] $$0, aqh $$1, bgr $$2) {
      cti.a($$0);
   }
}
