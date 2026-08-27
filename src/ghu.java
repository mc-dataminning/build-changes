import java.io.IOException;

public class ghu extends asg<int[]> {
   private static final aiy a = new aiy("textures/colormap/foliage.png");

   protected int[] a(asb $$0, bin $$1) {
      try {
         return ghx.a($$0, a);
      } catch (IOException var4) {
         throw new IllegalStateException("Failed to load foliage color texture", var4);
      }
   }

   protected void a(int[] $$0, asb $$1, bin $$2) {
      cvl.a($$0);
   }
}
