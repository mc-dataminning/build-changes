public class fzg extends fzf<ccm> {
   private static final ahg a = new ahg("textures/entity/illager/illusioner.png");

   public fzg(fym.a $$0) {
      super($$0, new fkk<>($$0.a(fmv.ar)), 0.5F);
      this.a(new gcq<ccm, fkk<ccm>>(this, $$0.d()) {
         public void a(eqa $$0, ftg $$1, int $$2, ccm $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
            if ($$3.go() || $$3.fW()) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            }
         }
      });
      this.f.c().k = true;
   }

   public ahg a(ccm $$0) {
      return a;
   }

   public void a(ccm $$0, float $$1, float $$2, eqa $$3, ftg $$4, int $$5) {
      if ($$0.ce()) {
         els[] $$6 = $$0.E($$2);
         float $$7 = this.a($$0, $$2);

         for (int $$8 = 0; $$8 < $$6.length; $$8++) {
            $$3.a();
            $$3.a(
               $$6[$$8].c + (double)aun.b((float)$$8 + $$7 * 0.5F) * 0.025,
               $$6[$$8].d + (double)aun.b((float)$$8 + $$7 * 0.75F) * 0.0125,
               $$6[$$8].e + (double)aun.b((float)$$8 + $$7 * 0.7F) * 0.025
            );
            super.a($$0, $$1, $$2, $$3, $$4, $$5);
            $$3.b();
         }
      } else {
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   protected boolean b(ccm $$0) {
      return true;
   }
}
