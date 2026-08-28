public class gfy implements gfm<drw> {
   private final geg a;

   public gfy(gfn.a $$0) {
      this.a = $$0.b();
   }

   public void a(drw $$0, float $$1, ezw $$2, gdm $$3, int $$4, int $$5) {
      dbw $$6 = $$0.i();
      if ($$6 != null) {
         iz $$7 = $$0.az_().a($$0.f().g());
         dsa $$8 = $$0.j();
         if (!$$8.i()) {
            gei.a();
            $$2.a();
            $$2.a($$0.b($$1), $$0.c($$1), $$0.d($$1));
            if ($$8.a(dez.bz) && $$0.a($$1) <= 4.0F) {
               $$8 = $$8.a(dru.d, Boolean.valueOf($$0.a($$1) <= 0.5F));
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            } else if ($$0.d() && !$$0.b()) {
               dtc $$9 = $$8.a(dez.br) ? dtc.b : dtc.a;
               dsa $$10 = dez.bz.o().a(dru.c, $$9).a(dru.a, $$8.c(drt.a));
               $$10 = $$10.a(dru.d, Boolean.valueOf($$0.a($$1) >= 0.5F));
               this.a($$7, $$10, $$2, $$3, $$6, false, $$5);
               iz $$11 = $$7.a($$0.f());
               $$2.b();
               $$2.a();
               $$8 = $$8.a(drt.c, Boolean.valueOf(true));
               this.a($$11, $$8, $$2, $$3, $$6, true, $$5);
            } else {
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            }

            $$2.b();
            gei.b();
         }
      }
   }

   private void a(iz $$0, dsa $$1, ezw $$2, gdm $$3, dbw $$4, boolean $$5, int $$6) {
      gdu $$7 = gdh.b($$1);
      faa $$8 = $$3.getBuffer($$7);
      this.a.b().a($$4, this.a.a($$1), $$1, $$0, $$2, $$8, $$5, azf.a(), $$1.a($$0), $$6);
   }

   @Override
   public int aP_() {
      return 68;
   }
}
