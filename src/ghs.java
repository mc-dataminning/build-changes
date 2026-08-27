public class ghs extends ghm<ccc, fqf<ccc>> {
   private final fym a;
   private final gdz b;

   public ghs(gew<ccc, fqf<ccc>> $$0, fym $$1, gdz $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   public void a(eub $$0, fxs $$1, int $$2, ccc $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.s()) {
         boolean $$10 = ezi.Q().b($$3) && $$3.ce();
         if (!$$3.ce() || $$10) {
            $$0.a();
            this.c().c().a($$0);
            float $$11 = 0.625F;
            $$0.a(0.0F, -0.34375F, 0.0F);
            $$0.a(a.d.rotationDegrees(180.0F));
            $$0.b(0.625F, -0.625F, -0.625F);
            cqm $$12 = new cqm(dae.ee);
            if ($$10) {
               dnb $$13 = dae.ee.o();
               glc $$14 = this.a.a($$13);
               int $$15 = gec.c($$3, 0.0F);
               $$0.a(-0.5F, -0.5F, -0.5F);
               this.a.b().a($$0.c(), $$1.getBuffer(fya.r(gjb.e)), $$13, $$14, 0.0F, 0.0F, 0.0F, $$2, $$15);
            } else {
               this.b.a($$3, $$12, cqj.f, false, $$0, $$1, $$3.dM(), $$2, gec.c($$3, 0.0F), $$3.aj());
            }

            $$0.b();
         }
      }
   }
}
