public class gof extends gpi<gef, fww<gef>> {
   public gof(gmp<gef, fww<gef>> $$0) {
      super($$0);
   }

   public void a(fbc $$0, gfg $$1, int $$2, gef $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.cm() && $$3.a(clz.a)) {
         gry $$10 = $$3.b();
         if ($$10.c() != null) {
            cuh $$11 = $$3.d(bsc.e);
            if (!$$11.a(cuk.pj) && !$$11.a(cuk.At)) {
               $$0.a();
               $$0.a(0.0F, 0.0F, 0.125F);
               double $$12 = aym.d((double)$$6, $$3.cx, $$3.cA) - aym.d((double)$$6, $$3.M, $$3.dz());
               double $$13 = aym.d((double)$$6, $$3.cy, $$3.cB) - aym.d((double)$$6, $$3.N, $$3.dB());
               double $$14 = aym.d((double)$$6, $$3.cz, $$3.cC) - aym.d((double)$$6, $$3.O, $$3.dF());
               float $$15 = aym.j($$6, $$3.bk, $$3.bj);
               double $$16 = (double)aym.a($$15 * (float) (Math.PI / 180.0));
               double $$17 = (double)(-aym.b($$15 * (float) (Math.PI / 180.0)));
               float $$18 = (float)$$13 * 10.0F;
               $$18 = aym.a($$18, -6.0F, 32.0F);
               float $$19 = (float)($$12 * $$16 + $$14 * $$17) * 100.0F;
               $$19 = aym.a($$19, 0.0F, 150.0F);
               float $$20 = (float)($$12 * $$17 - $$14 * $$16) * 100.0F;
               $$20 = aym.a($$20, -20.0F, 20.0F);
               if ($$19 < 0.0F) {
                  $$19 = 0.0F;
               }

               float $$21 = aym.i($$6, $$3.ct, $$3.cu);
               $$18 += aym.a(aym.i($$6, $$3.Z, $$3.aa) * 6.0F) * 32.0F * $$21;
               if ($$3.cf()) {
                  $$18 += 25.0F;
               }

               $$0.a(a.b.rotationDegrees(6.0F + $$19 / 2.0F + $$18));
               $$0.a(a.f.rotationDegrees($$20 / 2.0F));
               $$0.a(a.d.rotationDegrees(180.0F - $$20 / 2.0F));
               fbg $$22 = $$1.getBuffer(gfo.c($$10.c()));
               this.c().b($$0, $$22, $$2, gqp.d);
               $$0.b();
            }
         }
      }
   }
}
