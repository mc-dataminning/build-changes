public class gcl extends gdl<fss, flo<fss>> {
   public gcl(gav<fss, flo<fss>> $$0) {
      super($$0);
   }

   public void a(eqk $$0, ftt $$1, int $$2, fss $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.ce() && $$3.a(cfr.a)) {
         gga $$10 = $$3.b();
         if ($$10.c() != null) {
            cng $$11 = $$3.c(bmd.e);
            if (!$$11.a(cnj.nS)) {
               $$0.a();
               $$0.a(0.0F, 0.0F, 0.125F);
               double $$12 = aup.d((double)$$6, $$3.cc, $$3.cf) - aup.d((double)$$6, $$3.K, $$3.dq());
               double $$13 = aup.d((double)$$6, $$3.cd, $$3.cg) - aup.d((double)$$6, $$3.L, $$3.ds());
               double $$14 = aup.d((double)$$6, $$3.ce, $$3.ch) - aup.d((double)$$6, $$3.M, $$3.dw());
               float $$15 = aup.j($$6, $$3.aV, $$3.aU);
               double $$16 = (double)aup.a($$15 * (float) (Math.PI / 180.0));
               double $$17 = (double)(-aup.b($$15 * (float) (Math.PI / 180.0)));
               float $$18 = (float)$$13 * 10.0F;
               $$18 = aup.a($$18, -6.0F, 32.0F);
               float $$19 = (float)($$12 * $$16 + $$14 * $$17) * 100.0F;
               $$19 = aup.a($$19, 0.0F, 150.0F);
               float $$20 = (float)($$12 * $$17 - $$14 * $$16) * 100.0F;
               $$20 = aup.a($$20, -20.0F, 20.0F);
               if ($$19 < 0.0F) {
                  $$19 = 0.0F;
               }

               float $$21 = aup.i($$6, $$3.bZ, $$3.ca);
               $$18 += aup.a(aup.i($$6, $$3.X, $$3.Y) * 6.0F) * 32.0F * $$21;
               if ($$3.bX()) {
                  $$18 += 25.0F;
               }

               $$0.a(a.b.rotationDegrees(6.0F + $$19 / 2.0F + $$18));
               $$0.a(a.f.rotationDegrees($$20 / 2.0F));
               $$0.a(a.d.rotationDegrees(180.0F - $$20 / 2.0F));
               eqo $$22 = $$1.getBuffer(fub.c($$10.c()));
               this.c().b($$0, $$22, $$2, ges.d);
               $$0.b();
            }
         }
      }
   }
}
