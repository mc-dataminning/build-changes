import java.util.Arrays;

public class gyp extends gyo<cpi, hex> {
   private static final alr a = alr.b("textures/entity/illager/illusioner.png");

   public gyp(gxv.a $$0) {
      super($$0, new gic<>($$0.a(gkq.bz)), 0.5F);
      this.a(new hcb<hex, gic<hex>>(this) {
         public void a(fld $$0, grn $$1, int $$2, hex $$3, float $$4, float $$5) {
            if ($$3.n || $$3.c) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5);
            }
         }
      });
      this.g.c().k = true;
   }

   public alr a(hex $$0) {
      return a;
   }

   public hex b() {
      return new hex();
   }

   public void a(cpi $$0, hex $$1, float $$2) {
      super.a($$0, $$1, $$2);
      fgc[] $$3 = $$0.J($$2);
      $$1.a = Arrays.copyOf($$3, $$3.length);
      $$1.n = $$0.gE();
   }

   public void a(hex $$0, fld $$1, grn $$2, int $$3) {
      if ($$0.A) {
         fgc[] $$4 = $$0.a;

         for (int $$5 = 0; $$5 < $$4.length; $$5++) {
            $$1.a();
            $$1.a(
               $$4[$$5].d + (double)azz.b((float)$$5 + $$0.v * 0.5F) * 0.025,
               $$4[$$5].e + (double)azz.b((float)$$5 + $$0.v * 0.75F) * 0.0125,
               $$4[$$5].f + (double)azz.b((float)$$5 + $$0.v * 0.7F) * 0.025
            );
            super.a($$0, $$1, $$2, $$3);
            $$1.b();
         }
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   protected boolean b(hex $$0) {
      return true;
   }

   protected ffx a(cpi $$0) {
      return super.a($$0).c(3.0, 0.0, 3.0);
   }
}
