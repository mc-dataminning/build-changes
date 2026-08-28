public class gna extends goa<gde, fvv<gde>> {
   public gna(glk<gde, fvv<gde>> $$0) {
      super($$0);
   }

   public void a(fao $$0, gef $$1, int $$2, gde $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.cj() && $$3.a(cmm.a)) {
         gqq $$10 = $$3.b();
         if ($$10.c() != null) {
            cud $$11 = $$3.a(bso.e);
            if (!$$11.a(cug.nT)) {
               $$0.a();
               $$0.a(0.0F, 0.0F, 0.125F);
               double $$12 = ayg.d((double)$$6, $$3.ck, $$3.cn) - ayg.d((double)$$6, $$3.L, $$3.dw());
               double $$13 = ayg.d((double)$$6, $$3.cl, $$3.co) - ayg.d((double)$$6, $$3.M, $$3.dy());
               double $$14 = ayg.d((double)$$6, $$3.cm, $$3.cp) - ayg.d((double)$$6, $$3.N, $$3.dC());
               float $$15 = ayg.j($$6, $$3.ba, $$3.aZ);
               double $$16 = (double)ayg.a($$15 * (float) (Math.PI / 180.0));
               double $$17 = (double)(-ayg.b($$15 * (float) (Math.PI / 180.0)));
               float $$18 = (float)$$13 * 10.0F;
               $$18 = ayg.a($$18, -6.0F, 32.0F);
               float $$19 = (float)($$12 * $$16 + $$14 * $$17) * 100.0F;
               $$19 = ayg.a($$19, 0.0F, 150.0F);
               float $$20 = (float)($$12 * $$17 - $$14 * $$16) * 100.0F;
               $$20 = ayg.a($$20, -20.0F, 20.0F);
               if ($$19 < 0.0F) {
                  $$19 = 0.0F;
               }

               float $$21 = ayg.i($$6, $$3.ch, $$3.ci);
               $$18 += ayg.a(ayg.i($$6, $$3.Y, $$3.Z) * 6.0F) * 32.0F * $$21;
               if ($$3.cc()) {
                  $$18 += 25.0F;
               }

               $$0.a(a.b.rotationDegrees(6.0F + $$19 / 2.0F + $$18));
               $$0.a(a.f.rotationDegrees($$20 / 2.0F));
               $$0.a(a.d.rotationDegrees(180.0F - $$20 / 2.0F));
               fas $$22 = $$1.getBuffer(gen.c($$10.c()));
               this.c().b($$0, $$22, $$2, gph.d);
               $$0.b();
            }
         }
      }
   }
}
