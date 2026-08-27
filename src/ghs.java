public class ghs implements ghg<dsy> {
   private final gga a;

   public ghs(ghh.a $$0) {
      this.a = $$0.b();
   }

   public void a(dsy $$0, float $$1, fbc $$2, gfg $$3, int $$4, int $$5) {
      dca $$6 = $$0.i();
      if ($$6 != null) {
         ir $$7 = $$0.az_().a($$0.f().g());
         dtc $$8 = $$0.j();
         if (!$$8.i()) {
            ggc.a();
            $$2.a();
            $$2.a($$0.b($$1), $$0.c($$1), $$0.d($$1));
            if ($$8.a(dfe.cj) && $$0.a($$1) <= 4.0F) {
               $$8 = $$8.a(dsw.d, Boolean.valueOf($$0.a($$1) <= 0.5F));
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            } else if ($$0.d() && !$$0.b()) {
               due $$9 = $$8.a(dfe.cb) ? due.b : due.a;
               dtc $$10 = dfe.cj.n().a(dsw.c, $$9).a(dsw.a, $$8.c(dsv.a));
               $$10 = $$10.a(dsw.d, Boolean.valueOf($$0.a($$1) >= 0.5F));
               this.a($$7, $$10, $$2, $$3, $$6, false, $$5);
               ir $$11 = $$7.a($$0.f());
               $$2.b();
               $$2.a();
               $$8 = $$8.a(dsv.c, Boolean.valueOf(true));
               this.a($$11, $$8, $$2, $$3, $$6, true, $$5);
            } else {
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            }

            $$2.b();
            ggc.b();
         }
      }
   }

   private void a(ir $$0, dtc $$1, fbc $$2, gfg $$3, dca $$4, boolean $$5, int $$6) {
      gfo $$7 = gfb.b($$1);
      fbg $$8 = $$3.getBuffer($$7);
      this.a.b().a($$4, this.a.a($$1), $$1, $$0, $$2, $$8, $$5, ayt.a(), $$1.a($$0), $$6);
   }

   @Override
   public int aQ_() {
      return 68;
   }
}
