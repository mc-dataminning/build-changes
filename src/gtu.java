public class gtu implements gsy<dzv> {
   private final hga a;
   private final azv b = azv.a();
   private final hdu c = new hdu();

   public gtu(gsz.a $$0) {
      this.a = $$0.d();
   }

   public void a(dzv $$0, float $$1, fjy $$2, gqm $$3, int $$4, int $$5, fex $$6) {
      if (dzv.a.a($$0.c())) {
         djh $$7 = $$0.i();
         if ($$7 != null) {
            czk $$8 = $$0.c().a();
            if (!$$8.f()) {
               this.a.a(this.c.a, $$8, czi.h, $$7, null, 0);
               this.c.b = hdu.a($$8.M());
               this.c.c = hdu.a($$8);
               dzw $$9 = $$0.d();
               $$2.a();
               $$2.a(0.5F, 0.4F, 0.5F);
               $$2.a(a.d.rotationDegrees(azm.i($$1, $$9.b(), $$9.a())));
               gxp.a($$2, $$3, $$4, this.c, this.b);
               $$2.b();
            }
         }
      }
   }
}
