import java.util.Arrays;

public class got extends gos<clk, guu> {
   private static final alh a = alh.b("textures/entity/illager/illusioner.png");

   public got(gnz.a $$0) {
      super($$0, new fyn<>($$0.a(gba.aZ)), 0.5F);
      this.a(new gsf<guu, fyn<guu>>(this, $$0.b()) {
         public void a(fdt $$0, ghw $$1, int $$2, guu $$3, float $$4, float $$5) {
            if ($$3.i || $$3.c) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5);
            }
         }
      });
      this.h.c().k = true;
   }

   public alh a(guu $$0) {
      return a;
   }

   public guu c() {
      return new guu();
   }

   public void a(clk $$0, guu $$1, float $$2) {
      super.a($$0, $$1, $$2);
      ezh[] $$3 = $$0.J($$2);
      $$1.a = Arrays.copyOf($$3, $$3.length);
      $$1.i = $$0.gF();
   }

   public void a(guu $$0, fdt $$1, ghw $$2, int $$3) {
      if ($$0.u) {
         ezh[] $$4 = $$0.a;

         for (int $$5 = 0; $$5 < $$4.length; $$5++) {
            $$1.a();
            $$1.a(
               $$4[$$5].d + (double)azj.b((float)$$5 + $$0.p * 0.5F) * 0.025,
               $$4[$$5].e + (double)azj.b((float)$$5 + $$0.p * 0.75F) * 0.0125,
               $$4[$$5].f + (double)azj.b((float)$$5 + $$0.p * 0.7F) * 0.025
            );
            super.a($$0, $$1, $$2, $$3);
            $$1.b();
         }
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   protected boolean b(guu $$0) {
      return true;
   }

   protected ezc a(clk $$0) {
      return super.a($$0).c(3.0, 0.0, 3.0);
   }
}
