import java.io.IOException;

public class fvo extends alc<int[]> {
   private static final acq a = new acq("textures/colormap/foliage.png");

   protected int[] a(akx $$0, ban $$1) {
      try {
         return fvr.a($$0, a);
      } catch (IOException var4) {
         throw new IllegalStateException("Failed to load foliage color texture", var4);
      }
   }

   protected void a(int[] $$0, akx $$1, ban $$2) {
      cmg.a($$0);
   }
}
