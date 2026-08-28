public class ggc implements gfq<dsa> {
   private final gek a;

   public ggc(gfr.a $$0) {
      this.a = $$0.b();
   }

   public void a(dsa $$0, float $$1, faa $$2, gdq $$3, int $$4, int $$5) {
      dca $$6 = $$0.i();
      if ($$6 != null) {
         iz $$7 = $$0.ay_().a($$0.f().g());
         dse $$8 = $$0.j();
         if (!$$8.i()) {
            gem.a();
            $$2.a();
            $$2.a($$0.b($$1), $$0.c($$1), $$0.d($$1));
            if ($$8.a(dfd.bz) && $$0.a($$1) <= 4.0F) {
               $$8 = $$8.a(dry.d, Boolean.valueOf($$0.a($$1) <= 0.5F));
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            } else if ($$0.d() && !$$0.b()) {
               dtg $$9 = $$8.a(dfd.br) ? dtg.b : dtg.a;
               dse $$10 = dfd.bz.o().a(dry.c, $$9).a(dry.a, $$8.c(drx.a));
               $$10 = $$10.a(dry.d, Boolean.valueOf($$0.a($$1) >= 0.5F));
               this.a($$7, $$10, $$2, $$3, $$6, false, $$5);
               iz $$11 = $$7.a($$0.f());
               $$2.b();
               $$2.a();
               $$8 = $$8.a(drx.c, Boolean.valueOf(true));
               this.a($$11, $$8, $$2, $$3, $$6, true, $$5);
            } else {
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            }

            $$2.b();
            gem.b();
         }
      }
   }

   private void a(iz $$0, dse $$1, faa $$2, gdq $$3, dca $$4, boolean $$5, int $$6) {
      gdy $$7 = gdl.b($$1);
      fae $$8 = $$3.getBuffer($$7);
      this.a.b().a($$4, this.a.a($$1), $$1, $$0, $$2, $$8, $$5, azh.a(), $$1.a($$0), $$6);
   }

   @Override
   public int aP_() {
      return 68;
   }
}
