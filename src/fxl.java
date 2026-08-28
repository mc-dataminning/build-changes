import com.mojang.blaze3d.systems.RenderSystem;
import java.util.function.Function;
import java.util.function.Supplier;

public enum fxl implements fil {
   a(() -> a(5, 8, ($$0, $$1) -> -1)),
   b(() -> {
      int $$0 = 5;
      int $$1 = 8;
      return a(5, 8, ($$0x, $$1x) -> {
         boolean $$2 = $$0x == 0 || $$0x + 1 == 5 || $$1x == 0 || $$1x + 1 == 8;
         return $$2 ? -1 : 0;
      });
   });

   final fki c;

   private static fki a(int $$0, int $$1, fxl.a $$2) {
      fki $$3 = new fki(fki.a.a, $$0, $$1, false);

      for (int $$4 = 0; $$4 < $$1; $$4++) {
         for (int $$5 = 0; $$5 < $$0; $$5++) {
            $$3.b($$5, $$4, $$2.getColor($$5, $$4));
         }
      }

      $$3.g();
      return $$3;
   }

   private fxl(final Supplier<fki> $$0) {
      this.c = $$0.get();
   }

   @Override
   public float getAdvance() {
      return (float)(this.c.a() + 1);
   }

   @Override
   public fxj bake(Function<fin, fxj> $$0) {
      return $$0.apply(new fin() {
         @Override
         public int a() {
            return fxl.this.c.a();
         }

         @Override
         public int b() {
            return fxl.this.c.b();
         }

         @Override
         public float d() {
            return 1.0F;
         }

         @Override
         public void a(int $$0, int $$1, flj $$2) {
            RenderSystem.getDevice().b().a($$2, fxl.this.c, 0, $$0, $$1, fxl.this.c.a(), fxl.this.c.b(), 0, 0);
         }

         @Override
         public boolean c() {
            return true;
         }
      });
   }

   @FunctionalInterface
   interface a {
      int getColor(int var1, int var2);
   }
}
