public class gfv implements gfj<drt> {
   private final ged a;

   public gfv(gfk.a $$0) {
      this.a = $$0.b();
   }

   public void a(drt $$0, float $$1, ezt $$2, gdj $$3, int $$4, int $$5) {
      dbt $$6 = $$0.i();
      if ($$6 != null) {
         iz $$7 = $$0.aA_().a($$0.f().g());
         drx $$8 = $$0.j();
         if (!$$8.i()) {
            gef.a();
            $$2.a();
            $$2.a($$0.b($$1), $$0.c($$1), $$0.d($$1));
            if ($$8.a(dew.bz) && $$0.a($$1) <= 4.0F) {
               $$8 = $$8.a(drr.d, Boolean.valueOf($$0.a($$1) <= 0.5F));
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            } else if ($$0.d() && !$$0.b()) {
               dsz $$9 = $$8.a(dew.br) ? dsz.b : dsz.a;
               drx $$10 = dew.bz.n().a(drr.c, $$9).a(drr.a, $$8.c(drq.a));
               $$10 = $$10.a(drr.d, Boolean.valueOf($$0.a($$1) >= 0.5F));
               this.a($$7, $$10, $$2, $$3, $$6, false, $$5);
               iz $$11 = $$7.a($$0.f());
               $$2.b();
               $$2.a();
               $$8 = $$8.a(drq.c, Boolean.valueOf(true));
               this.a($$11, $$8, $$2, $$3, $$6, true, $$5);
            } else {
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            }

            $$2.b();
            gef.b();
         }
      }
   }

   private void a(iz $$0, drx $$1, ezt $$2, gdj $$3, dbt $$4, boolean $$5, int $$6) {
      gdr $$7 = gde.b($$1);
      ezx $$8 = $$3.getBuffer($$7);
      this.a.b().a($$4, this.a.a($$1), $$1, $$0, $$2, $$8, $$5, azc.a(), $$1.a($$0), $$6);
   }

   @Override
   public int aQ_() {
      return 68;
   }
}
