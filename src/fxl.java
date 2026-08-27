public class fxl extends fyl<fnz, fhc<fnz>> {
   public fxl(fvy<fnz, fhc<fnz>> $$0) {
      super($$0);
   }

   public void a(emh $$0, fpb $$1, int $$2, fnz $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.cd() && $$3.a(ccy.a)) {
         gba $$10 = $$3.b();
         if ($$10.c() != null) {
            ckj $$11 = $$3.c(bjy.e);
            if (!$$11.a(ckm.nh)) {
               $$0.a();
               $$0.a(0.0F, 0.0F, 0.125F);
               double $$12 = asy.d((double)$$6, $$3.bY, $$3.cb) - asy.d((double)$$6, $$3.K, $$3.dq());
               double $$13 = asy.d((double)$$6, $$3.bZ, $$3.cc) - asy.d((double)$$6, $$3.L, $$3.ds());
               double $$14 = asy.d((double)$$6, $$3.ca, $$3.cd) - asy.d((double)$$6, $$3.M, $$3.dw());
               float $$15 = asy.j($$6, $$3.aV, $$3.aU);
               double $$16 = (double)asy.a($$15 * (float) (Math.PI / 180.0));
               double $$17 = (double)(-asy.b($$15 * (float) (Math.PI / 180.0)));
               float $$18 = (float)$$13 * 10.0F;
               $$18 = asy.a($$18, -6.0F, 32.0F);
               float $$19 = (float)($$12 * $$16 + $$14 * $$17) * 100.0F;
               $$19 = asy.a($$19, 0.0F, 150.0F);
               float $$20 = (float)($$12 * $$17 - $$14 * $$16) * 100.0F;
               $$20 = asy.a($$20, -20.0F, 20.0F);
               if ($$19 < 0.0F) {
                  $$19 = 0.0F;
               }

               float $$21 = asy.i($$6, $$3.bV, $$3.bW);
               $$18 += asy.a(asy.i($$6, $$3.X, $$3.Y) * 6.0F) * 32.0F * $$21;
               if ($$3.bW()) {
                  $$18 += 25.0F;
               }

               $$0.a(a.b.rotationDegrees(6.0F + $$19 / 2.0F + $$18));
               $$0.a(a.f.rotationDegrees($$20 / 2.0F));
               $$0.a(a.d.rotationDegrees(180.0F - $$20 / 2.0F));
               eml $$22 = $$1.getBuffer(fpj.c($$10.c()));
               this.c().b($$0, $$22, $$2, fzr.d);
               $$0.b();
            }
         }
      }
   }
}
