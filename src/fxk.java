public class fxk extends fxf<bvh, fgt<bvh>> {
   private final fon a;
   private final ftv b;

   public fxk(fus<bvh, fgt<bvh>> $$0, fon $$1, ftv $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   public void a(elf $$0, fnu $$1, int $$2, bvh $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.q()) {
         boolean $$10 = eql.O().b($$3) && $$3.cd();
         if (!$$3.cd() || $$10) {
            $$0.a();
            this.c().c().a($$0);
            float $$11 = 0.625F;
            $$0.a(0.0F, -0.34375F, 0.0F);
            $$0.a(a.d.rotationDegrees(180.0F));
            $$0.b(0.625F, -0.625F, -0.625F);
            cix $$12 = new cix(csm.ef);
            if ($$10) {
               dez $$13 = csm.ef.n();
               gav $$14 = this.a.a($$13);
               int $$15 = fty.c($$3, 0.0F);
               $$0.a(-0.5F, -0.5F, -0.5F);
               this.a.b().a($$0.c(), $$1.getBuffer(foc.q(fyt.e)), $$13, $$14, 0.0F, 0.0F, 0.0F, $$2, $$15);
            } else {
               this.b.a($$3, $$12, ciu.f, false, $$0, $$1, $$3.dK(), $$2, fty.c($$3, 0.0F), $$3.ah());
            }

            $$0.b();
         }
      }
   }
}
