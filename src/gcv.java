public class gcv extends gcq<byq, flp<byq>> {
   private final ftt a;
   private final fzd b;

   public gcv(gaa<byq, flp<byq>> $$0, ftt $$1, fzd $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   public void a(ept $$0, fsz $$1, int $$2, byq $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.w()) {
         boolean $$10 = eva.N().b($$3) && $$3.ce();
         if (!$$3.ce() || $$10) {
            $$0.a();
            this.c().c().a($$0);
            float $$11 = 0.625F;
            $$0.a(0.0F, -0.34375F, 0.0F);
            $$0.a(a.d.rotationDegrees(180.0F));
            $$0.b(0.625F, -0.625F, -0.625F);
            cmr $$12 = new cmr(cwl.ee);
            if ($$10) {
               dja $$13 = cwl.ee.o();
               ggg $$14 = this.a.a($$13);
               int $$15 = fzg.c($$3, 0.0F);
               $$0.a(-0.5F, -0.5F, -0.5F);
               this.a.b().a($$0.c(), $$1.getBuffer(fth.r(gee.e)), $$13, $$14, 0.0F, 0.0F, 0.0F, $$2, $$15);
            } else {
               this.b.a($$3, $$12, cmo.f, false, $$0, $$1, $$3.dM(), $$2, fzg.c($$3, 0.0F), $$3.aj());
            }

            $$0.b();
         }
      }
   }
}
