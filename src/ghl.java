public class ghl implements ggz<dsy> {
   private final gft a;

   public ghl(gha.a $$0) {
      this.a = $$0.b();
   }

   public void a(dsy $$0, float $$1, fbi $$2, gez $$3, int $$4, int $$5) {
      dcw $$6 = $$0.i();
      if ($$6 != null) {
         jd $$7 = $$0.aD_().a($$0.f().g());
         dtc $$8 = $$0.j();
         if (!$$8.i()) {
            gfv.a();
            $$2.a();
            $$2.a($$0.b($$1), $$0.c($$1), $$0.d($$1));
            if ($$8.a(dga.bz) && $$0.a($$1) <= 4.0F) {
               $$8 = $$8.a(dsw.d, Boolean.valueOf($$0.a($$1) <= 0.5F));
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            } else if ($$0.d() && !$$0.b()) {
               due $$9 = $$8.a(dga.br) ? due.b : due.a;
               dtc $$10 = dga.bz.o().a(dsw.c, $$9).a(dsw.a, $$8.c(dsv.a));
               $$10 = $$10.a(dsw.d, Boolean.valueOf($$0.a($$1) >= 0.5F));
               this.a($$7, $$10, $$2, $$3, $$6, false, $$5);
               jd $$11 = $$7.a($$0.f());
               $$2.b();
               $$2.a();
               $$8 = $$8.a(dsv.c, Boolean.valueOf(true));
               this.a($$11, $$8, $$2, $$3, $$6, true, $$5);
            } else {
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            }

            $$2.b();
            gfv.b();
         }
      }
   }

   private void a(jd $$0, dtc $$1, fbi $$2, gez $$3, dcw $$4, boolean $$5, int $$6) {
      gfh $$7 = geu.b($$1);
      fbm $$8 = $$3.getBuffer($$7);
      this.a.b().a($$4, this.a.a($$1), $$1, $$0, $$2, $$8, $$5, ayw.a(), $$1.a($$0), $$6);
   }

   @Override
   public int aW_() {
      return 68;
   }
}
