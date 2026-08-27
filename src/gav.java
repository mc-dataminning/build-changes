import java.io.IOException;

public class gav extends aoy<int[]> {
   private static final afw a = new afw("textures/colormap/grass.png");

   protected int[] a(aot $$0, bes $$1) {
      try {
         return gax.a($$0, a);
      } catch (IOException var4) {
         throw new IllegalStateException("Failed to load grass color texture", var4);
      }
   }

   protected void a(int[] $$0, aot $$1, bes $$2) {
      cqx.a($$0);
   }
}
