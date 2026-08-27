public class fux extends fuw<caj> {
   private static final afw a = new afw("textures/entity/illager/illusioner.png");

   public fux(fud.a $$0) {
      super($$0, new fgl<>($$0.a(fiv.ao)), 0.5F);
      this.a(new fye<caj, fgl<caj>>(this, $$0.d()) {
         public void a(emh $$0, fpb $$1, int $$2, caj $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
            if ($$3.go() || $$3.fW()) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            }
         }
      });
      this.f.c().k = true;
   }

   public afw a(caj $$0) {
      return a;
   }

   public void a(caj $$0, float $$1, float $$2, emh $$3, fpb $$4, int $$5) {
      if ($$0.cd()) {
         eif[] $$6 = $$0.E($$2);
         float $$7 = this.a($$0, $$2);

         for (int $$8 = 0; $$8 < $$6.length; $$8++) {
            $$3.a();
            $$3.a(
               $$6[$$8].c + (double)asy.b((float)$$8 + $$7 * 0.5F) * 0.025,
               $$6[$$8].d + (double)asy.b((float)$$8 + $$7 * 0.75F) * 0.0125,
               $$6[$$8].e + (double)asy.b((float)$$8 + $$7 * 0.7F) * 0.025
            );
            super.a($$0, $$1, $$2, $$3, $$4, $$5);
            $$3.b();
         }
      } else {
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   protected boolean b(caj $$0) {
      return true;
   }
}
