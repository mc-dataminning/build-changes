public class gti implements gsm<dzo> {
   private final hfo a;
   private final azv b = azv.a();
   private final hdi c = new hdi();

   public gti(gsn.a $$0) {
      this.a = $$0.d();
   }

   public void a(dzo $$0, float $$1, fjj $$2, gqa $$3, int $$4, int $$5, feq $$6) {
      if (dzo.a.a($$0.c())) {
         dja $$7 = $$0.i();
         if ($$7 != null) {
            czd $$8 = $$0.c().a();
            if (!$$8.f()) {
               this.a.a(this.c.a, $$8, czb.h, false, $$7, null, 0);
               this.c.b = hdi.a($$8.M());
               this.c.c = hdi.a($$8);
               dzp $$9 = $$0.d();
               $$2.a();
               $$2.a(0.5F, 0.4F, 0.5F);
               $$2.a(a.d.rotationDegrees(azm.i($$1, $$9.b(), $$9.a())));
               gxd.a($$2, $$3, $$4, this.c, this.b);
               $$2.b();
            }
         }
      }
   }
}
