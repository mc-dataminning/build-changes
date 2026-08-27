public class gdd implements gci<doq> {
   private final ggp a;
   private final axt b = axt.a();

   public gdd(gcj.a $$0) {
      this.a = $$0.d();
   }

   public void a(doq $$0, float $$1, ewr $$2, gai $$3, int $$4, int $$5) {
      if (doq.a.a($$0.c())) {
         czg $$6 = $$0.i();
         if ($$6 != null) {
            crs $$7 = $$0.c().a();
            if (!$$7.d()) {
               this.b.b((long)ggn.a($$7));
               dor $$8 = $$0.d();
               a($$1, $$6, $$2, $$3, $$4, $$7, this.a, $$8.b(), $$8.a(), this.b);
            }
         }
      }
   }

   public static void a(float $$0, czg $$1, ewr $$2, gai $$3, int $$4, crs $$5, ggp $$6, float $$7, float $$8, axt $$9) {
      $$2.a();
      $$2.a(0.5F, 0.4F, 0.5F);
      $$2.a(a.d.rotationDegrees(axm.j($$0, $$7, $$8)));
      ggn.a($$6, $$2, $$3, $$4, $$5, $$9, $$1);
      $$2.b();
   }
}
