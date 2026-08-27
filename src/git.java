public class git extends gjt<fyy, frr<fyy>> {
   public git(ghd<fyy, frr<fyy>> $$0) {
      super($$0);
   }

   public void a(ewi $$0, fzz $$1, int $$2, fyy $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.ce() && $$3.a(cju.a)) {
         gmi $$10 = $$3.b();
         if ($$10.c() != null) {
            crj $$11 = $$3.d(bqc.e);
            if (!$$11.a(crm.nS)) {
               $$0.a();
               $$0.a(0.0F, 0.0F, 0.125F);
               double $$12 = axk.d((double)$$6, $$3.ce, $$3.ch) - axk.d((double)$$6, $$3.K, $$3.dr());
               double $$13 = axk.d((double)$$6, $$3.cf, $$3.ci) - axk.d((double)$$6, $$3.L, $$3.dt());
               double $$14 = axk.d((double)$$6, $$3.cg, $$3.cj) - axk.d((double)$$6, $$3.M, $$3.dx());
               float $$15 = axk.j($$6, $$3.aY, $$3.aX);
               double $$16 = (double)axk.a($$15 * (float) (Math.PI / 180.0));
               double $$17 = (double)(-axk.b($$15 * (float) (Math.PI / 180.0)));
               float $$18 = (float)$$13 * 10.0F;
               $$18 = axk.a($$18, -6.0F, 32.0F);
               float $$19 = (float)($$12 * $$16 + $$14 * $$17) * 100.0F;
               $$19 = axk.a($$19, 0.0F, 150.0F);
               float $$20 = (float)($$12 * $$17 - $$14 * $$16) * 100.0F;
               $$20 = axk.a($$20, -20.0F, 20.0F);
               if ($$19 < 0.0F) {
                  $$19 = 0.0F;
               }

               float $$21 = axk.i($$6, $$3.cb, $$3.cc);
               $$18 += axk.a(axk.i($$6, $$3.X, $$3.Y) * 6.0F) * 32.0F * $$21;
               if ($$3.bX()) {
                  $$18 += 25.0F;
               }

               $$0.a(a.b.rotationDegrees(6.0F + $$19 / 2.0F + $$18));
               $$0.a(a.f.rotationDegrees($$20 / 2.0F));
               $$0.a(a.d.rotationDegrees(180.0F - $$20 / 2.0F));
               ewm $$22 = $$1.getBuffer(gah.c($$10.c()));
               this.c().b($$0, $$22, $$2, gla.d);
               $$0.b();
            }
         }
      }
   }
}
