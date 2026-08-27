public class gdq implements gde<dpu> {
   private final gby a;

   public gdq(gdf.a $$0) {
      this.a = $$0.b();
   }

   public void a(dpu $$0, float $$1, exn $$2, gbe $$3, int $$4, int $$5) {
      czu $$6 = $$0.i();
      if ($$6 != null) {
         im $$7 = $$0.az_().a($$0.f().g());
         dpy $$8 = $$0.j();
         if (!$$8.i()) {
            gca.a();
            $$2.a();
            $$2.a($$0.b($$1), $$0.c($$1), $$0.d($$1));
            if ($$8.a(dcx.bz) && $$0.a($$1) <= 4.0F) {
               $$8 = $$8.a(dps.d, Boolean.valueOf($$0.a($$1) <= 0.5F));
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            } else if ($$0.d() && !$$0.b()) {
               dra $$9 = $$8.a(dcx.br) ? dra.b : dra.a;
               dpy $$10 = dcx.bz.n().a(dps.c, $$9).a(dps.a, $$8.c(dpr.a));
               $$10 = $$10.a(dps.d, Boolean.valueOf($$0.a($$1) >= 0.5F));
               this.a($$7, $$10, $$2, $$3, $$6, false, $$5);
               im $$11 = $$7.a($$0.f());
               $$2.b();
               $$2.a();
               $$8 = $$8.a(dpr.c, Boolean.valueOf(true));
               this.a($$11, $$8, $$2, $$3, $$6, true, $$5);
            } else {
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            }

            $$2.b();
            gca.b();
         }
      }
   }

   private void a(im $$0, dpy $$1, exn $$2, gbe $$3, czu $$4, boolean $$5, int $$6) {
      gbm $$7 = gaz.b($$1);
      exr $$8 = $$3.getBuffer($$7);
      this.a.b().a($$4, this.a.a($$1), $$1, $$0, $$2, $$8, $$5, ayd.a(), $$1.a($$0), $$6);
   }

   @Override
   public int aP_() {
      return 68;
   }
}
