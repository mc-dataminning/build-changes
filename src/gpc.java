public class gpc implements goh<dwd> {
   private final hbi a;
   private final azg b = azg.a();
   private final gzc c = new gzc();

   public gpc(goi.a $$0) {
      this.a = $$0.d();
   }

   public void a(dwd $$0, float $$1, ffs $$2, glv $$3, int $$4, int $$5) {
      if (dwd.a.a($$0.c())) {
         dgg $$6 = $$0.i();
         if ($$6 != null) {
            cwn $$7 = $$0.c().a();
            if (!$$7.f()) {
               this.a.a(this.c.a, $$7, cwl.h, false, $$6, null, 0);
               this.c.b = gzc.a($$7.M());
               this.c.c = gzc.a($$7);
               dwe $$8 = $$0.d();
               $$2.a();
               $$2.a(0.5F, 0.4F, 0.5F);
               $$2.a(a.d.rotationDegrees(ayy.i($$1, $$8.b(), $$8.a())));
               gsx.a($$2, $$3, $$4, this.c, this.b);
               $$2.b();
            }
         }
      }
   }
}
