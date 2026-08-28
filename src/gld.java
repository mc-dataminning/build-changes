public class gld extends glc<ckb> {
   private static final akr a = akr.b("textures/entity/illager/illusioner.png");

   public gld(gkj.a $$0) {
      super($$0, new fvy<>($$0.a(fyj.av)), 0.5F);
      this.a(new goo<ckb, fvy<ckb>>(this, $$0.d()) {
         public void a(fbi $$0, gez $$1, int $$2, ckb $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
            if ($$3.gu() || $$3.gb()) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            }
         }
      });
      this.g.c().k = true;
   }

   public akr a(ckb $$0) {
      return a;
   }

   public void a(ckb $$0, float $$1, float $$2, fbi $$3, gez $$4, int $$5) {
      if ($$0.ci()) {
         exc[] $$6 = $$0.H($$2);
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
