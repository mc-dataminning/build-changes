public class gce extends gbz<byg, fky<byg>> {
   private final ftc a;
   private final fym b;

   public gce(fzj<byg, fky<byg>> $$0, ftc $$1, fym $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   public void a(epd $$0, fsi $$1, int $$2, byg $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.w()) {
         boolean $$10 = euk.N().b($$3) && $$3.ce();
         if (!$$3.ce() || $$10) {
            $$0.a();
            this.c().c().a($$0);
            float $$11 = 0.625F;
            $$0.a(0.0F, -0.34375F, 0.0F);
            $$0.a(a.d.rotationDegrees(180.0F));
            $$0.b(0.625F, -0.625F, -0.625F);
            cmh $$12 = new cmh(cwb.ee);
            if ($$10) {
               dip $$13 = cwb.ee.o();
               gfp $$14 = this.a.a($$13);
               int $$15 = fyp.c($$3, 0.0F);
               $$0.a(-0.5F, -0.5F, -0.5F);
               this.a.b().a($$0.c(), $$1.getBuffer(fsq.r(gdn.e)), $$13, $$14, 0.0F, 0.0F, 0.0F, $$2, $$15);
            } else {
               this.b.a($$3, $$12, cme.f, false, $$0, $$1, $$3.dM(), $$2, fyp.c($$3, 0.0F), $$3.aj());
            }

            $$0.b();
         }
      }
   }
}
