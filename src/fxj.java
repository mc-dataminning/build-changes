import com.mojang.blaze3d.systems.RenderSystem;
import java.util.function.Function;
import java.util.function.Supplier;

public enum fxj implements fij {
   a(() -> a(5, 8, ($$0, $$1) -> -1)),
   b(() -> {
      int $$0 = 5;
      int $$1 = 8;
      return a(5, 8, ($$0x, $$1x) -> {
         boolean $$2 = $$0x == 0 || $$0x + 1 == 5 || $$1x == 0 || $$1x + 1 == 8;
         return $$2 ? -1 : 0;
      });
   });

   final fkg c;

   private static fkg a(int $$0, int $$1, fxj.a $$2) {
      fkg $$3 = new fkg(fkg.a.a, $$0, $$1, false);

      for (int $$4 = 0; $$4 < $$1; $$4++) {
         for (int $$5 = 0; $$5 < $$0; $$5++) {
            $$3.b($$5, $$4, $$2.getColor($$5, $$4));
         }
      }

      $$3.g();
      return $$3;
   }

   private fxj(final Supplier<fkg> $$0) {
      this.c = $$0.get();
   }

   @Override
   public float getAdvance() {
      return (float)(this.c.a() + 1);
   }

   @Override
   public fxh bake(Function<fil, fxh> $$0) {
      return $$0.apply(new fil() {
         @Override
         public int a() {
            return fxj.this.c.a();
         }

         @Override
         public int b() {
            return fxj.this.c.b();
         }

         @Override
         public float d() {
            return 1.0F;
         }

         @Override
         public void a(int $$0, int $$1, flh $$2) {
            RenderSystem.getDevice().b().a($$2, fxj.this.c, 0, $$0, $$1, fxj.this.c.a(), fxj.this.c.b(), 0, 0);
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
