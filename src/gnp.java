public class gnp extends gop<gds, fwj<gds>> {
   public gnp(glz<gds, fwj<gds>> $$0) {
      super($$0);
   }

   public void a(fbc $$0, get $$1, int $$2, gds $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.ci() && $$3.a(cmw.a)) {
         grf $$10 = $$3.b();
         if ($$10.c() != null) {
            cuo $$11 = $$3.a(bsx.e);
            if (!$$11.a(cur.nT)) {
               $$0.a();
               $$0.a(0.0F, 0.0F, 0.125F);
               double $$12 = ayn.d((double)$$6, $$3.cj, $$3.cm) - ayn.d((double)$$6, $$3.L, $$3.dv());
               double $$13 = ayn.d((double)$$6, $$3.ck, $$3.cn) - ayn.d((double)$$6, $$3.M, $$3.dx());
               double $$14 = ayn.d((double)$$6, $$3.cl, $$3.co) - ayn.d((double)$$6, $$3.N, $$3.dB());
               float $$15 = ayn.j($$6, $$3.aZ, $$3.aY);
               double $$16 = (double)ayn.a($$15 * (float) (Math.PI / 180.0));
               double $$17 = (double)(-ayn.b($$15 * (float) (Math.PI / 180.0)));
               float $$18 = (float)$$13 * 10.0F;
               $$18 = ayn.a($$18, -6.0F, 32.0F);
               float $$19 = (float)($$12 * $$16 + $$14 * $$17) * 100.0F;
               $$19 = ayn.a($$19, 0.0F, 150.0F);
               float $$20 = (float)($$12 * $$17 - $$14 * $$16) * 100.0F;
               $$20 = ayn.a($$20, -20.0F, 20.0F);
               if ($$19 < 0.0F) {
                  $$19 = 0.0F;
               }

               float $$21 = ayn.i($$6, $$3.cg, $$3.ch);
               $$18 += ayn.a(ayn.i($$6, $$3.Y, $$3.Z) * 6.0F) * 32.0F * $$21;
               if ($$3.cb()) {
                  $$18 += 25.0F;
               }

               $$0.a(a.b.rotationDegrees(6.0F + $$19 / 2.0F + $$18));
               $$0.a(a.f.rotationDegrees($$20 / 2.0F));
               $$0.a(a.d.rotationDegrees(180.0F - $$20 / 2.0F));
               fbg $$22 = $$1.getBuffer(gfb.c($$10.c()));
               this.c().c($$0, $$22, $$2, gpw.d);
               $$0.b();
            }
         }
      }
   }
}
