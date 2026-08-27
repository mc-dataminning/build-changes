public class gbq extends gcq<fry, fku<fry>> {
   public gbq(gaa<fry, fku<fry>> $$0) {
      super($$0);
   }

   public void a(ept $$0, fsz $$1, int $$2, fry $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.ce() && $$3.a(cfc.a)) {
         gff $$10 = $$3.b();
         if ($$10.c() != null) {
            cmr $$11 = $$3.c(blu.e);
            if (!$$11.a(cmu.nS)) {
               $$0.a();
               $$0.a(0.0F, 0.0F, 0.125F);
               double $$12 = aui.d((double)$$6, $$3.bY, $$3.cb) - aui.d((double)$$6, $$3.K, $$3.dr());
               double $$13 = aui.d((double)$$6, $$3.bZ, $$3.cc) - aui.d((double)$$6, $$3.L, $$3.dt());
               double $$14 = aui.d((double)$$6, $$3.ca, $$3.cd) - aui.d((double)$$6, $$3.M, $$3.dx());
               float $$15 = aui.j($$6, $$3.aV, $$3.aU);
               double $$16 = (double)aui.a($$15 * (float) (Math.PI / 180.0));
               double $$17 = (double)(-aui.b($$15 * (float) (Math.PI / 180.0)));
               float $$18 = (float)$$13 * 10.0F;
               $$18 = aui.a($$18, -6.0F, 32.0F);
               float $$19 = (float)($$12 * $$16 + $$14 * $$17) * 100.0F;
               $$19 = aui.a($$19, 0.0F, 150.0F);
               float $$20 = (float)($$12 * $$17 - $$14 * $$16) * 100.0F;
               $$20 = aui.a($$20, -20.0F, 20.0F);
               if ($$19 < 0.0F) {
                  $$19 = 0.0F;
               }

               float $$21 = aui.i($$6, $$3.bV, $$3.bW);
               $$18 += aui.a(aui.i($$6, $$3.X, $$3.Y) * 6.0F) * 32.0F * $$21;
               if ($$3.bX()) {
                  $$18 += 25.0F;
               }

               $$0.a(a.b.rotationDegrees(6.0F + $$19 / 2.0F + $$18));
               $$0.a(a.f.rotationDegrees($$20 / 2.0F));
               $$0.a(a.d.rotationDegrees(180.0F - $$20 / 2.0F));
               epx $$22 = $$1.getBuffer(fth.c($$10.c()));
               this.c().b($$0, $$22, $$2, gdw.d);
               $$0.b();
            }
         }
      }
   }
}
