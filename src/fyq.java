public class fyq extends fyl<bws, fhx<bws>> {
   private final fpu a;
   private final fvb b;

   public fyq(fvy<bws, fhx<bws>> $$0, fpu $$1, fvb $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   public void a(emh $$0, fpb $$1, int $$2, bws $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.t()) {
         boolean $$10 = ero.O().b($$3) && $$3.cd();
         if (!$$3.cd() || $$10) {
            $$0.a();
            this.c().c().a($$0);
            float $$11 = 0.625F;
            $$0.a(0.0F, -0.34375F, 0.0F);
            $$0.a(a.d.rotationDegrees(180.0F));
            $$0.b(0.625F, -0.625F, -0.625F);
            ckj $$12 = new ckj(cuc.ee);
            if ($$10) {
               dgb $$13 = cuc.ee.o();
               gcb $$14 = this.a.a($$13);
               int $$15 = fve.c($$3, 0.0F);
               $$0.a(-0.5F, -0.5F, -0.5F);
               this.a.b().a($$0.c(), $$1.getBuffer(fpj.q(fzz.e)), $$13, $$14, 0.0F, 0.0F, 0.0F, $$2, $$15);
            } else {
               this.b.a($$3, $$12, ckg.f, false, $$0, $$1, $$3.dL(), $$2, fve.c($$3, 0.0F), $$3.ah());
            }

            $$0.b();
         }
      }
   }
}
