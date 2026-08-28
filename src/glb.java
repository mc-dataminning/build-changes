public class glb extends gla<ckb> {
   private static final akr a = akr.b("textures/entity/illager/illusioner.png");

   public glb(gkh.a $$0) {
      super($$0, new fvw<>($$0.a(fyh.av)), 0.5F);
      this.a(new gom<ckb, fvw<ckb>>(this, $$0.d()) {
         public void a(fbg $$0, gex $$1, int $$2, ckb $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
            if ($$3.gv() || $$3.gc()) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            }
         }
      });
      this.g.c().k = true;
   }

   public akr a(ckb $$0) {
      return a;
   }

   public void a(ckb $$0, float $$1, float $$2, fbg $$3, gex $$4, int $$5) {
      if ($$0.ci()) {
         exa[] $$6 = $$0.H($$2);
         float $$7 = this.a($$0, $$2);

         for (int $$8 = 0; $$8 < $$6.length; $$8++) {
            $$3.a();
            $$3.a(
               $$6[$$8].c + (double)ayo.b((float)$$8 + $$7 * 0.5F) * 0.025,
               $$6[$$8].d + (double)ayo.b((float)$$8 + $$7 * 0.75F) * 0.0125,
               $$6[$$8].e + (double)ayo.b((float)$$8 + $$7 * 0.7F) * 0.025
            );
            super.a($$0, $$1, $$2, $$3, $$4, $$5);
            $$3.b();
         }
      } else {
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   protected boolean b(ckb $$0) {
      return true;
   }
}
