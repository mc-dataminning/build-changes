public class fwl extends fxl<fmz, fgd<fmz>> {
   public fwl(fuy<fmz, fgd<fmz>> $$0) {
      super($$0);
   }

   public void a(elj $$0, foa $$1, int $$2, fmz $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.cd() && $$3.a(ccb.a)) {
         gaa $$10 = $$3.b();
         if ($$10.c() != null) {
            cjl $$11 = $$3.c(bjb.e);
            if (!$$11.a(cjo.nh)) {
               $$0.a();
               $$0.a(0.0F, 0.0F, 0.125F);
               double $$12 = asb.d((double)$$6, $$3.bY, $$3.cb) - asb.d((double)$$6, $$3.K, $$3.dq());
               double $$13 = asb.d((double)$$6, $$3.bZ, $$3.cc) - asb.d((double)$$6, $$3.L, $$3.ds());
               double $$14 = asb.d((double)$$6, $$3.ca, $$3.cd) - asb.d((double)$$6, $$3.M, $$3.dw());
               float $$15 = asb.j($$6, $$3.aV, $$3.aU);
               double $$16 = (double)asb.a($$15 * (float) (Math.PI / 180.0));
               double $$17 = (double)(-asb.b($$15 * (float) (Math.PI / 180.0)));
               float $$18 = (float)$$13 * 10.0F;
               $$18 = asb.a($$18, -6.0F, 32.0F);
               float $$19 = (float)($$12 * $$16 + $$14 * $$17) * 100.0F;
               $$19 = asb.a($$19, 0.0F, 150.0F);
               float $$20 = (float)($$12 * $$17 - $$14 * $$16) * 100.0F;
               $$20 = asb.a($$20, -20.0F, 20.0F);
               if ($$19 < 0.0F) {
                  $$19 = 0.0F;
               }

               float $$21 = asb.i($$6, $$3.bV, $$3.bW);
               $$18 += asb.a(asb.i($$6, $$3.X, $$3.Y) * 6.0F) * 32.0F * $$21;
               if ($$3.bW()) {
                  $$18 += 25.0F;
               }

               $$0.a(a.b.rotationDegrees(6.0F + $$19 / 2.0F + $$18));
               $$0.a(a.f.rotationDegrees($$20 / 2.0F));
               $$0.a(a.d.rotationDegrees(180.0F - $$20 / 2.0F));
               eln $$22 = $$1.getBuffer(foi.c($$10.c()));
               this.c().b($$0, $$22, $$2, fyr.d);
               $$0.b();
            }
         }
      }
   }
}
