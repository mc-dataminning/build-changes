public class ggb implements gfp<drz> {
   private final gej a;

   public ggb(gfq.a $$0) {
      this.a = $$0.b();
   }

   public void a(drz $$0, float $$1, ezz $$2, gdp $$3, int $$4, int $$5) {
      dbz $$6 = $$0.i();
      if ($$6 != null) {
         iz $$7 = $$0.ay_().a($$0.f().g());
         dsd $$8 = $$0.j();
         if (!$$8.i()) {
            gel.a();
            $$2.a();
            $$2.a($$0.b($$1), $$0.c($$1), $$0.d($$1));
            if ($$8.a(dfc.bz) && $$0.a($$1) <= 4.0F) {
               $$8 = $$8.a(drx.d, Boolean.valueOf($$0.a($$1) <= 0.5F));
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            } else if ($$0.d() && !$$0.b()) {
               dtf $$9 = $$8.a(dfc.br) ? dtf.b : dtf.a;
               dsd $$10 = dfc.bz.o().a(drx.c, $$9).a(drx.a, $$8.c(drw.a));
               $$10 = $$10.a(drx.d, Boolean.valueOf($$0.a($$1) >= 0.5F));
               this.a($$7, $$10, $$2, $$3, $$6, false, $$5);
               iz $$11 = $$7.a($$0.f());
               $$2.b();
               $$2.a();
               $$8 = $$8.a(drw.c, Boolean.valueOf(true));
               this.a($$11, $$8, $$2, $$3, $$6, true, $$5);
            } else {
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            }

            $$2.b();
            gel.b();
         }
      }
   }

   private void a(iz $$0, dsd $$1, ezz $$2, gdp $$3, dbz $$4, boolean $$5, int $$6) {
      gdx $$7 = gdk.b($$1);
      fad $$8 = $$3.getBuffer($$7);
      this.a.b().a($$4, this.a.a($$1), $$1, $$0, $$2, $$8, $$5, azh.a(), $$1.a($$0), $$6);
   }

   @Override
   public int aP_() {
      return 68;
   }
}
