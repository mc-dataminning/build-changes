import java.util.function.Function;
import java.util.function.Supplier;

public enum fvy implements fhv {
   a(() -> a(5, 8, ($$0, $$1) -> -1)),
   b(() -> {
      int $$0 = 5;
      int $$1 = 8;
      return a(5, 8, ($$0x, $$1x) -> {
         boolean $$2 = $$0x == 0 || $$0x + 1 == 5 || $$1x == 0 || $$1x + 1 == 8;
         return $$2 ? -1 : 0;
      });
   });

   final fiz c;

   private static fiz a(int $$0, int $$1, fvy.a $$2) {
      fiz $$3 = new fiz(fiz.a.a, $$0, $$1, false);

      for (int $$4 = 0; $$4 < $$1; $$4++) {
         for (int $$5 = 0; $$5 < $$0; $$5++) {
            $$3.b($$5, $$4, $$2.getColor($$5, $$4));
         }
      }

      $$3.g();
      return $$3;
   }

   private fvy(final Supplier<fiz> $$0) {
      this.c = $$0.get();
   }

   @Override
   public float getAdvance() {
      return (float)(this.c.a() + 1);
   }

   @Override
   public fvw bake(Function<fhx, fvw> $$0) {
      return $$0.apply(new fhx() {
         @Override
         public int a() {
            return fvy.this.c.a();
         }

         @Override
         public int b() {
            return fvy.this.c.b();
         }

         @Override
         public float d() {
            return 1.0F;
         }

         @Override
         public void a(int $$0, int $$1, fjw $$2) {
            $$2.a(fvy.this.c, 0, $$0, $$1, fvy.this.c.a(), fvy.this.c.b(), 0, 0);
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
