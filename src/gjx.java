public class gjx implements gjc<dti> {
   private final gnq a;
   private final azk b = azk.a();

   public gjx(gjd.a $$0) {
      this.a = $$0.d();
   }

   public void a(dti $$0, float $$1, fcu $$2, ggv $$3, int $$4, int $$5) {
      if (dti.a.a($$0.c())) {
         dds $$6 = $$0.i();
         if ($$6 != null) {
            cvl $$7 = $$0.c().a();
            if (!$$7.f()) {
               this.b.b((long)gno.a($$7));
               dtj $$8 = $$0.d();
               a($$1, $$6, $$2, $$3, $$4, $$7, this.a, $$8.b(), $$8.a(), this.b);
            }
         }
      }
   }

   public static void a(float $$0, dds $$1, fcu $$2, ggv $$3, int $$4, cvl $$5, gnq $$6, float $$7, float $$8, azk $$9) {
      $$2.a();
      $$2.a(0.5F, 0.4F, 0.5F);
      $$2.a(a.d.rotationDegrees(azc.i($$0, $$7, $$8)));
      gno.a($$6, $$2, $$3, $$4, $$5, $$9, $$1);
      $$2.b();
   }
}
