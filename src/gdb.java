public class gdb extends gcw<byv, flv<byv>> {
   private final ftz a;
   private final fzj b;

   public gdb(gag<byv, flv<byv>> $$0, ftz $$1, fzj $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   public void a(epz $$0, ftf $$1, int $$2, byv $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.w()) {
         boolean $$10 = evg.O().b($$3) && $$3.ce();
         if (!$$3.ce() || $$10) {
            $$0.a();
            this.c().c().a($$0);
            float $$11 = 0.625F;
            $$0.a(0.0F, -0.34375F, 0.0F);
            $$0.a(a.d.rotationDegrees(180.0F));
            $$0.b(0.625F, -0.625F, -0.625F);
            cmx $$12 = new cmx(cwr.ee);
            if ($$10) {
               djg $$13 = cwr.ee.o();
               ggl $$14 = this.a.a($$13);
               int $$15 = fzm.c($$3, 0.0F);
               $$0.a(-0.5F, -0.5F, -0.5F);
               this.a.b().a($$0.c(), $$1.getBuffer(ftn.r(gek.e)), $$13, $$14, 0.0F, 0.0F, 0.0F, $$2, $$15);
            } else {
               this.b.a($$3, $$12, cmu.f, false, $$0, $$1, $$3.dM(), $$2, fzm.c($$3, 0.0F), $$3.aj());
            }

            $$0.b();
         }
      }
   }
}
