import java.io.IOException;

public class hjq extends avi<int[]> {
   private static final alg a = alg.b("textures/colormap/foliage.png");

   protected int[] a(avd $$0, bqo $$1) {
      try {
         return hjt.a($$0, a);
      } catch (IOException var4) {
         throw new IllegalStateException("Failed to load foliage color texture", var4);
      }
   }

   protected void a(int[] $$0, avd $$1, bqo $$2) {
      div.a($$0);
   }
}
