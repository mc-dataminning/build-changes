import com.mojang.blaze3d.systems.RenderSystem;

public class hks implements AutoCloseable {
   private static final int e = 16;
   public static final int a = 0;
   public static final int b = 3;
   public static final int c = 10;
   public static final int d = a(0, 10);
   private final hkp f = new hkp("Entity Color Overlay", 16, 16, false);

   public hks() {
      fki $$0 = this.f.c();

      for (int $$1 = 0; $$1 < 16; $$1++) {
         for (int $$2 = 0; $$2 < 16; $$2++) {
            if ($$1 < 8) {
               $$0.b($$2, $$1, -1291911168);
            } else {
               int $$3 = (int)((1.0F - (float)$$2 / 15.0F * 0.75F) * 255.0F);
               $$0.b($$2, $$1, aya.c($$3, -1));
            }
         }
      }

      this.f.a(false, false);
      this.f.a(true);
      this.f.b();
   }

   @Override
   public void close() {
      this.f.close();
   }

   public void a() {
      RenderSystem.setupOverlayColor(this.f.a());
   }

   public static int a(float $$0) {
      return (int)($$0 * 15.0F);
   }

   public static int a(boolean $$0) {
      return $$0 ? 3 : 10;
   }

   public static int a(int $$0, int $$1) {
      return $$0 | $$1 << 16;
   }

   public static int a(float $$0, boolean $$1) {
      return a(a($$0), a($$1));
   }

   public void b() {
      RenderSystem.teardownOverlayColor();
   }
}
