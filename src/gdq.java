public class gdq extends gdl<bza, fmj<bza>> {
   private final fun a;
   private final fzy b;

   public gdq(gav<bza, fmj<bza>> $$0, fun $$1, fzy $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   public void a(eqk $$0, ftt $$1, int $$2, bza $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.w()) {
         boolean $$10 = evr.O().b($$3) && $$3.ce();
         if (!$$3.ce() || $$10) {
            $$0.a();
            this.c().c().a($$0);
            float $$11 = 0.625F;
            $$0.a(0.0F, -0.34375F, 0.0F);
            $$0.a(a.d.rotationDegrees(180.0F));
            $$0.b(0.625F, -0.625F, -0.625F);
            cng $$12 = new cng(cxa.ee);
            if ($$10) {
               djp $$13 = cxa.ee.o();
               ghb $$14 = this.a.a($$13);
               int $$15 = gab.c($$3, 0.0F);
               $$0.a(-0.5F, -0.5F, -0.5F);
               this.a.b().a($$0.c(), $$1.getBuffer(fub.r(gfa.e)), $$13, $$14, 0.0F, 0.0F, 0.0F, $$2, $$15);
            } else {
               this.b.a($$3, $$12, cnd.f, false, $$0, $$1, $$3.dL(), $$2, gab.c($$3, 0.0F), $$3.aj());
            }

            $$0.b();
         }
      }
   }
}
