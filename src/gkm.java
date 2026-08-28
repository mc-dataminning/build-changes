public class gkm implements gjr<dtw> {
   private final goh a;
   private final azl b = azl.a();

   public gkm(gjs.a $$0) {
      this.a = $$0.d();
   }

   public void a(dtw $$0, float $$1, fde $$2, ghg $$3, int $$4, int $$5) {
      if (dtw.a.a($$0.c())) {
         deg $$6 = $$0.i();
         if ($$6 != null) {
            cvp $$7 = $$0.c().a();
            if (!$$7.f()) {
               this.b.b((long)gof.a($$7));
               dtx $$8 = $$0.d();
               a($$1, $$6, $$2, $$3, $$4, $$7, this.a, $$8.b(), $$8.a(), this.b);
            }
         }
      }
   }

   public static void a(float $$0, deg $$1, fde $$2, ghg $$3, int $$4, cvp $$5, goh $$6, float $$7, float $$8, azl $$9) {
      $$2.a();
      $$2.a(0.5F, 0.4F, 0.5F);
      $$2.a(a.d.rotationDegrees(azd.i($$0, $$7, $$8)));
      gof.a($$6, $$2, $$3, $$4, $$5, $$9, $$1);
      $$2.b();
   }
}
