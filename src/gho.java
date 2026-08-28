public class gho implements ggt<dsi> {
   private final glb a;
   private final ayv b = ayv.a();

   public gho(ggu.a $$0) {
      this.a = $$0.d();
   }

   public void a(dsi $$0, float $$1, fbc $$2, get $$3, int $$4, int $$5) {
      if (dsi.a.a($$0.c())) {
         dcu $$6 = $$0.i();
         if ($$6 != null) {
            cuo $$7 = $$0.c().a();
            if (!$$7.e()) {
               this.b.b((long)gkz.a($$7));
               dsj $$8 = $$0.d();
               a($$1, $$6, $$2, $$3, $$4, $$7, this.a, $$8.b(), $$8.a(), this.b);
            }
         }
      }
   }

   public static void a(float $$0, dcu $$1, fbc $$2, get $$3, int $$4, cuo $$5, glb $$6, float $$7, float $$8, ayv $$9) {
      $$2.a();
      $$2.a(0.5F, 0.4F, 0.5F);
      $$2.a(a.d.rotationDegrees(ayn.j($$0, $$7, $$8)));
      gkz.a($$6, $$2, $$3, $$4, $$5, $$9, $$1);
      $$2.b();
   }
}
