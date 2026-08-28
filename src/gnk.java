public class gnk extends gne<cfy, fvv<cfy>> {
   private final ged a;
   private final gjq b;

   public gnk(gko<cfy, fvv<cfy>> $$0, ged $$1, gjq $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   public void a(ezt $$0, gdj $$1, int $$2, cfy $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.u()) {
         boolean $$10 = ffa.Q().b($$3) && $$3.ch();
         if (!$$3.ch() || $$10) {
            $$0.a();
            this.c().c().a($$0);
            float $$11 = 0.625F;
            $$0.a(0.0F, -0.34375F, 0.0F);
            $$0.a(a.d.rotationDegrees(180.0F));
            $$0.b(0.625F, -0.625F, -0.625F);
            cuk $$12 = new cuk(dew.ee);
            if ($$10) {
               drx $$13 = dew.ee.n();
               gqv $$14 = this.a.a($$13);
               int $$15 = gjt.c($$3, 0.0F);
               $$0.a(-0.5F, -0.5F, -0.5F);
               this.a.b().a($$0.c(), $$1.getBuffer(gdr.r(got.e)), $$13, $$14, 0.0F, 0.0F, 0.0F, $$2, $$15);
            } else {
               this.b.a($$3, $$12, cuh.f, false, $$0, $$1, $$3.dP(), $$2, gjt.c($$3, 0.0F), $$3.al());
            }

            $$0.b();
         }
      }
   }
}
