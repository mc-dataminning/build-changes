import java.io.IOException;

public class gxd extends auy<int[]> {
   private static final alb a = alb.b("textures/colormap/foliage.png");

   protected int[] a(aus $$0, bny $$1) {
      try {
         return gxg.a($$0, a);
      } catch (IOException var4) {
         throw new IllegalStateException("Failed to load foliage color texture", var4);
      }
   }

   protected void a(int[] $$0, aus $$1, bny $$2) {
      ddm.a($$0);
   }
}
