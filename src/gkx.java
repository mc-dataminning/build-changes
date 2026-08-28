public class gkx extends gkw<cjz> {
   private static final akq a = akq.b("textures/entity/illager/illusioner.png");

   public gkx(gkd.a $$0) {
      super($$0, new fvs<>($$0.a(fyd.av)), 0.5F);
      this.a(new goi<cjz, fvs<cjz>>(this, $$0.d()) {
         public void a(fbc $$0, get $$1, int $$2, cjz $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
            if ($$3.gw() || $$3.gd()) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            }
         }
      });
      this.f.c().k = true;
   }

   public akq a(cjz $$0) {
      return a;
   }

   public void a(cjz $$0, float $$1, float $$2, fbc $$3, get $$4, int $$5) {
      if ($$0.ci()) {
         eww[] $$6 = $$0.H($$2);
         float $$7 = this.a($$0, $$2);

         for (int $$8 = 0; $$8 < $$6.length; $$8++) {
            $$3.a();
            $$3.a(
               $$6[$$8].c + (double)ayn.b((float)$$8 + $$7 * 0.5F) * 0.025,
               $$6[$$8].d + (double)ayn.b((float)$$8 + $$7 * 0.75F) * 0.0125,
               $$6[$$8].e + (double)ayn.b((float)$$8 + $$7 * 0.7F) * 0.025
            );
            super.a($$0, $$1, $$2, $$3, $$4, $$5);
            $$3.b();
         }
      } else {
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   protected boolean b(cjz $$0) {
      return true;
   }
}
