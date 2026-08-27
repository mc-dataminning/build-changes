import java.io.IOException;

public class gau extends aoy<int[]> {
   private static final afw a = new afw("textures/colormap/foliage.png");

   protected int[] a(aot $$0, bes $$1) {
      try {
         return gax.a($$0, a);
      } catch (IOException var4) {
         throw new IllegalStateException("Failed to load foliage color texture", var4);
      }
   }

   protected void a(int[] $$0, aot $$1, bes $$2) {
      cqt.a($$0);
   }
}
