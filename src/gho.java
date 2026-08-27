public class gho extends ghj<ccb, fqd<ccb>> {
   private final fyk a;
   private final gdw b;

   public gho(get<ccb, fqd<ccb>> $$0, fyk $$1, gdw $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   public void a(etz $$0, fxq $$1, int $$2, ccb $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.s()) {
         boolean $$10 = ezg.Q().b($$3) && $$3.ce();
         if (!$$3.ce() || $$10) {
            $$0.a();
            this.c().c().a($$0);
            float $$11 = 0.625F;
            $$0.a(0.0F, -0.34375F, 0.0F);
            $$0.a(a.d.rotationDegrees(180.0F));
            $$0.b(0.625F, -0.625F, -0.625F);
            cqk $$12 = new cqk(dac.ee);
            if ($$10) {
               dmz $$13 = dac.ee.o();
               gkz $$14 = this.a.a($$13);
               int $$15 = gdz.c($$3, 0.0F);
               $$0.a(-0.5F, -0.5F, -0.5F);
               this.a.b().a($$0.c(), $$1.getBuffer(fxy.r(giy.e)), $$13, $$14, 0.0F, 0.0F, 0.0F, $$2, $$15);
            } else {
               this.b.a($$3, $$12, cqh.f, false, $$0, $$1, $$3.dM(), $$2, gdz.c($$3, 0.0F), $$3.aj());
            }

            $$0.b();
         }
      }
   }
}
