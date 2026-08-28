import java.io.IOException;

public class hcc extends awa<int[]> {
   private static final alz a = alz.b("textures/colormap/foliage.png");

   protected int[] a(avv $$0, bps $$1) {
      try {
         return hcf.a($$0, a);
      } catch (IOException var4) {
         throw new IllegalStateException("Failed to load foliage color texture", var4);
      }
   }

   protected void a(int[] $$0, avv $$1, bps $$2) {
      dhb.a($$0);
   }
}
