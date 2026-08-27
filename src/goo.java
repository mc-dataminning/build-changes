import java.io.IOException;

public class goo extends auc<int[]> {
   private static final akn a = new akn("textures/colormap/foliage.png");

   protected int[] a(atx $$0, bmk $$1) {
      try {
         return gor.a($$0, a);
      } catch (IOException var4) {
         throw new IllegalStateException("Failed to load foliage color texture", var4);
      }
   }

   protected void a(int[] $$0, atx $$1, bmk $$2) {
      dat.a($$0);
   }
}
