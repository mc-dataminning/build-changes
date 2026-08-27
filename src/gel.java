public class gel extends gfl<fus, fnn<fus>> {
   public gel(gcv<fus, fnn<fus>> $$0) {
      super($$0);
   }

   public void a(esh $$0, fvt $$1, int $$2, fus $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.ce() && $$3.a(chm.a)) {
         gia $$10 = $$3.b();
         if ($$10.c() != null) {
            cpd $$11 = $$3.c(bnx.e);
            if (!$$11.a(cpg.nS)) {
               $$0.a();
               $$0.a(0.0F, 0.0F, 0.125F);
               double $$12 = awi.d((double)$$6, $$3.cc, $$3.cf) - awi.d((double)$$6, $$3.J, $$3.dr());
               double $$13 = awi.d((double)$$6, $$3.cd, $$3.cg) - awi.d((double)$$6, $$3.K, $$3.dt());
               double $$14 = awi.d((double)$$6, $$3.ce, $$3.ch) - awi.d((double)$$6, $$3.L, $$3.dx());
               float $$15 = awi.j($$6, $$3.aV, $$3.aU);
               double $$16 = (double)awi.a($$15 * (float) (Math.PI / 180.0));
               double $$17 = (double)(-awi.b($$15 * (float) (Math.PI / 180.0)));
               float $$18 = (float)$$13 * 10.0F;
               $$18 = awi.a($$18, -6.0F, 32.0F);
               float $$19 = (float)($$12 * $$16 + $$14 * $$17) * 100.0F;
               $$19 = awi.a($$19, 0.0F, 150.0F);
               float $$20 = (float)($$12 * $$17 - $$14 * $$16) * 100.0F;
               $$20 = awi.a($$20, -20.0F, 20.0F);
               if ($$19 < 0.0F) {
                  $$19 = 0.0F;
               }

               float $$21 = awi.i($$6, $$3.bZ, $$3.ca);
               $$18 += awi.a(awi.i($$6, $$3.W, $$3.X) * 6.0F) * 32.0F * $$21;
               if ($$3.bX()) {
                  $$18 += 25.0F;
               }

               $$0.a(a.b.rotationDegrees(6.0F + $$19 / 2.0F + $$18));
               $$0.a(a.f.rotationDegrees($$20 / 2.0F));
               $$0.a(a.d.rotationDegrees(180.0F - $$20 / 2.0F));
               esl $$22 = $$1.getBuffer(fwb.c($$10.c()));
               this.c().b($$0, $$22, $$2, ggs.d);
               $$0.b();
            }
         }
      }
   }
}
