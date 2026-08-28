import java.io.IOException;

public class hjr extends avi<int[]> {
   private static final alg a = alg.b("textures/colormap/grass.png");

   protected int[] a(avd $$0, bqo $$1) {
      try {
         return hjt.a($$0, a);
      } catch (IOException var4) {
         throw new IllegalStateException("Failed to load grass color texture", var4);
      }
   }

   protected void a(int[] $$0, avd $$1, bqo $$2) {
      diy.a($$0);
   }
}
