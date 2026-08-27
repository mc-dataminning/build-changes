public class fzf extends gaf<fpt, fiu<fpt>> {
   public fzf(fxs<fpt, fiu<fpt>> $$0) {
      super($$0);
   }

   public void a(enw $$0, fqu $$1, int $$2, fpt $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.ce() && $$3.a(cdv.a)) {
         gcu $$10 = $$3.b();
         if ($$10.c() != null) {
            clj $$11 = $$3.c(bkv.e);
            if (!$$11.a(clm.nS)) {
               $$0.a();
               $$0.a(0.0F, 0.0F, 0.125F);
               double $$12 = atm.d((double)$$6, $$3.bY, $$3.cb) - atm.d((double)$$6, $$3.K, $$3.ds());
               double $$13 = atm.d((double)$$6, $$3.bZ, $$3.cc) - atm.d((double)$$6, $$3.L, $$3.du());
               double $$14 = atm.d((double)$$6, $$3.ca, $$3.cd) - atm.d((double)$$6, $$3.M, $$3.dy());
               float $$15 = atm.j($$6, $$3.aV, $$3.aU);
               double $$16 = (double)atm.a($$15 * (float) (Math.PI / 180.0));
               double $$17 = (double)(-atm.b($$15 * (float) (Math.PI / 180.0)));
               float $$18 = (float)$$13 * 10.0F;
               $$18 = atm.a($$18, -6.0F, 32.0F);
               float $$19 = (float)($$12 * $$16 + $$14 * $$17) * 100.0F;
               $$19 = atm.a($$19, 0.0F, 150.0F);
               float $$20 = (float)($$12 * $$17 - $$14 * $$16) * 100.0F;
               $$20 = atm.a($$20, -20.0F, 20.0F);
               if ($$19 < 0.0F) {
                  $$19 = 0.0F;
               }

               float $$21 = atm.i($$6, $$3.bV, $$3.bW);
               $$18 += atm.a(atm.i($$6, $$3.X, $$3.Y) * 6.0F) * 32.0F * $$21;
               if ($$3.bX()) {
                  $$18 += 25.0F;
               }

               $$0.a(a.b.rotationDegrees(6.0F + $$19 / 2.0F + $$18));
               $$0.a(a.f.rotationDegrees($$20 / 2.0F));
               $$0.a(a.d.rotationDegrees(180.0F - $$20 / 2.0F));
               eoa $$22 = $$1.getBuffer(frc.c($$10.c()));
               this.c().b($$0, $$22, $$2, gbl.d);
               $$0.b();
            }
         }
      }
   }
}
