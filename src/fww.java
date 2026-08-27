public class fww extends fwv<cbl> {
   private static final agm a = new agm("textures/entity/illager/illusioner.png");

   public fww(fwc.a $$0) {
      super($$0, new fii<>($$0.a(fks.ao)), 0.5F);
      this.a(new gad<cbl, fii<cbl>>(this, $$0.d()) {
         public void a(eob $$0, fqz $$1, int $$2, cbl $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
            if ($$3.gp() || $$3.fX()) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            }
         }
      });
      this.f.c().k = true;
   }

   public agm a(cbl $$0) {
      return a;
   }

   public void a(cbl $$0, float $$1, float $$2, eob $$3, fqz $$4, int $$5) {
      if ($$0.ce()) {
         ejz[] $$6 = $$0.E($$2);
         float $$7 = this.a($$0, $$2);

         for (int $$8 = 0; $$8 < $$6.length; $$8++) {
            $$3.a();
            $$3.a(
               $$6[$$8].c + (double)atq.b((float)$$8 + $$7 * 0.5F) * 0.025,
               $$6[$$8].d + (double)atq.b((float)$$8 + $$7 * 0.75F) * 0.0125,
               $$6[$$8].e + (double)atq.b((float)$$8 + $$7 * 0.7F) * 0.025
            );
            super.a($$0, $$1, $$2, $$3, $$4, $$5);
            $$3.b();
         }
      } else {
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   protected boolean b(cbl $$0) {
      return true;
   }
}
