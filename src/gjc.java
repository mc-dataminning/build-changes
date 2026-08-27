public class gjc extends gkc<fzh, fsa<fzh>> {
   public gjc(ghm<fzh, fsa<fzh>> $$0) {
      super($$0);
   }

   public void a(ewr $$0, gai $$1, int $$2, fzh $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.ce() && $$3.a(ckb.a)) {
         gmr $$10 = $$3.b();
         if ($$10.c() != null) {
            crs $$11 = $$3.d(bqh.e);
            if (!$$11.a(crv.nS)) {
               $$0.a();
               $$0.a(0.0F, 0.0F, 0.125F);
               double $$12 = axm.d((double)$$6, $$3.cg, $$3.cj) - axm.d((double)$$6, $$3.K, $$3.dr());
               double $$13 = axm.d((double)$$6, $$3.ch, $$3.ck) - axm.d((double)$$6, $$3.L, $$3.dt());
               double $$14 = axm.d((double)$$6, $$3.ci, $$3.cl) - axm.d((double)$$6, $$3.M, $$3.dx());
               float $$15 = axm.j($$6, $$3.aY, $$3.aX);
               double $$16 = (double)axm.a($$15 * (float) (Math.PI / 180.0));
               double $$17 = (double)(-axm.b($$15 * (float) (Math.PI / 180.0)));
               float $$18 = (float)$$13 * 10.0F;
               $$18 = axm.a($$18, -6.0F, 32.0F);
               float $$19 = (float)($$12 * $$16 + $$14 * $$17) * 100.0F;
               $$19 = axm.a($$19, 0.0F, 150.0F);
               float $$20 = (float)($$12 * $$17 - $$14 * $$16) * 100.0F;
               $$20 = axm.a($$20, -20.0F, 20.0F);
               if ($$19 < 0.0F) {
                  $$19 = 0.0F;
               }

               float $$21 = axm.i($$6, $$3.cd, $$3.ce);
               $$18 += axm.a(axm.i($$6, $$3.X, $$3.Y) * 6.0F) * 32.0F * $$21;
               if ($$3.bX()) {
                  $$18 += 25.0F;
               }

               $$0.a(a.b.rotationDegrees(6.0F + $$19 / 2.0F + $$18));
               $$0.a(a.f.rotationDegrees($$20 / 2.0F));
               $$0.a(a.d.rotationDegrees(180.0F - $$20 / 2.0F));
               ewv $$22 = $$1.getBuffer(gaq.c($$10.c()));
               this.c().b($$0, $$22, $$2, glj.d);
               $$0.b();
            }
         }
      }
   }
}
