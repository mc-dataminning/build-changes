public class gak extends gaf<bxp, fjp<bxp>> {
   private final fro a;
   private final fwv b;

   public gak(fxs<bxp, fjp<bxp>> $$0, fro $$1, fwv $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   public void a(enw $$0, fqu $$1, int $$2, bxp $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.w()) {
         boolean $$10 = etd.N().b($$3) && $$3.ce();
         if (!$$3.ce() || $$10) {
            $$0.a();
            this.c().c().a($$0);
            float $$11 = 0.625F;
            $$0.a(0.0F, -0.34375F, 0.0F);
            $$0.a(a.d.rotationDegrees(180.0F));
            $$0.b(0.625F, -0.625F, -0.625F);
            clj $$12 = new clj(cvc.ee);
            if ($$10) {
               dhi $$13 = cvc.ee.o();
               gdv $$14 = this.a.a($$13);
               int $$15 = fwy.c($$3, 0.0F);
               $$0.a(-0.5F, -0.5F, -0.5F);
               this.a.b().a($$0.c(), $$1.getBuffer(frc.q(gbt.e)), $$13, $$14, 0.0F, 0.0F, 0.0F, $$2, $$15);
            } else {
               this.b.a($$3, $$12, clg.f, false, $$0, $$1, $$3.dN(), $$2, fwy.c($$3, 0.0F), $$3.aj());
            }

            $$0.b();
         }
      }
   }
}
