public class gtz implements gtd<eaa> {
   private final hgg a;
   private final azv b = azv.a();
   private final hea c = new hea();

   public gtz(gte.a $$0) {
      this.a = $$0.d();
   }

   public void a(eaa $$0, float $$1, fkd $$2, gqr $$3, int $$4, int $$5, ffc $$6) {
      if (eaa.a.a($$0.c())) {
         djm $$7 = $$0.i();
         if ($$7 != null) {
            czn $$8 = $$0.c().a();
            if (!$$8.f()) {
               this.a.a(this.c.a, $$8, czl.h, $$7, null, 0);
               this.c.b = hea.a($$8.M());
               this.c.c = hea.a($$8);
               eab $$9 = $$0.d();
               $$2.a();
               $$2.a(0.5F, 0.4F, 0.5F);
               $$2.a(a.d.rotationDegrees(azm.i($$1, $$9.b(), $$9.a())));
               gxu.a($$2, $$3, $$4, this.c, this.b);
               $$2.b();
            }
         }
      }
   }
}
