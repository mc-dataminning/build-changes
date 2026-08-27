public class gcu implements gbz<doh> {
   private final ggg a;
   private final axr b = axr.a();

   public gcu(gca.a $$0) {
      this.a = $$0.d();
   }

   public void a(doh $$0, float $$1, ewi $$2, fzz $$3, int $$4, int $$5) {
      if (doh.a.a($$0.c())) {
         cyx $$6 = $$0.i();
         if ($$6 != null) {
            crj $$7 = $$0.c().a();
            if (!$$7.d()) {
               this.b.b((long)gge.a($$7));
               doi $$8 = $$0.d();
               a($$1, $$6, $$2, $$3, $$4, $$7, this.a, $$8.b(), $$8.a(), this.b);
            }
         }
      }
   }

   public static void a(float $$0, cyx $$1, ewi $$2, fzz $$3, int $$4, crj $$5, ggg $$6, float $$7, float $$8, axr $$9) {
      $$2.a();
      $$2.a(0.5F, 0.4F, 0.5F);
      $$2.a(a.d.rotationDegrees(axk.j($$0, $$7, $$8)));
      gge.a($$6, $$2, $$3, $$4, $$5, $$9, $$1);
      $$2.b();
   }
}
