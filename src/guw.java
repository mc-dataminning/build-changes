public class guw implements gua<eax> {
   private final hhg a;
   private final bai b = bai.a();
   private final hez c = new hez();

   public guw(gub.a $$0) {
      this.a = $$0.d();
   }

   public void a(eax $$0, float $$1, fld $$2, grn $$3, int $$4, int $$5, fgc $$6) {
      if (eax.a.a($$0.c())) {
         dkj $$7 = $$0.i();
         if ($$7 != null) {
            dak $$8 = $$0.c().a();
            if (!$$8.f()) {
               this.a.a(this.c.a, $$8, dai.h, $$7, null, 0);
               this.c.b = hez.a($$8.M());
               this.c.c = hez.a($$8);
               eay $$9 = $$0.d();
               $$2.a();
               $$2.a(0.5F, 0.4F, 0.5F);
               $$2.a(a.d.rotationDegrees(azz.i($$1, $$9.b(), $$9.a())));
               gyr.a($$2, $$3, $$4, this.c, this.b);
               $$2.b();
            }
         }
      }
   }
}
