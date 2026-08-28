import java.io.IOException;

public class gym extends avf<int[]> {
   private static final alh a = alh.b("textures/colormap/grass.png");

   protected int[] a(ava $$0, bok $$1) {
      try {
         return gyo.a($$0, a);
      } catch (IOException var4) {
         throw new IllegalStateException("Failed to load grass color texture", var4);
      }
   }

   protected void a(int[] $$0, ava $$1, bok $$2) {
      det.a($$0);
   }
}
